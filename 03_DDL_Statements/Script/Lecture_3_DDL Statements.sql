-- tao database
create database Buoi2;
use Buoi2;

-- doi ten database
alter database Buoi2 modify name = BuoiHoc2;

-- xoa database
drop database BuoiHoc2;

-- tao table Department
create table Department(
	DepartmentId int identity primary key,
	DepartmentName nvarchar(100) not null,
);

-- tao table Employee
create table Employee(
	-- <ten field> <data type> [options]
	EmployeeId int identity primary key,
	FirstName nvarchar(100) not null,
	LastName nvarchar(100) not null,
	BirthDate datetime,
	Gender varchar(10) default 'Nam', -- mac dinh la nam

	-- 1. tao column DepartmentId va ket noi khoa ngoai ngay lap tuc
	--DepartmentId int foreign key references Department(DepartmentId)

	-- 2. tao ten column, ket noi khoa ngoai sau
	DepartmentId int,

	----------------------
	constraint FK_Employee_Department foreign key (DepartmentId) references Department(DepartmentId)
);

-- them 1 cot employee
alter table Employee add IsDeleted bit;

-- cap nhat datatype IsDeleted thanh int
alter table Employee alter column IsDeleted int;

-- them check Gender chi co the la Nam hoac Nu
alter table Employee add constraint CHECK_GENDER check ((Gender='Nam') or (Gender='Nu'));

-- them default cho bien tao sau
alter table Employee add constraint DEFAULT_ISDELETED default (0) for IsDeleted;

-- tao khoa ngoai
alter table Employee add constraint FK_Employee_Department foreign key (DepartmentId) references Department(DepartmentId)

-- xoa table
drop table Employee;

-- them du lieu cho department
-- insert into <table name> [(<ten field 1>, <ten field 2>, ...)] values (<gia tri 1, gia tri 2, ...>)
insert into Department (DepartmentName) values ('Department 1');
insert into Department values ('Department 1');
insert into Department values ('Department 3');

-- xem gia tri cua table department
select * from Department

-- them du lieu cho employee
set dateformat dmy;
insert into Employee (FirstName, LastName, BirthDate, Gender, DepartmentId) values ('Vladimir', 'Putin', '14-3-2023', 'Nam', 2);
insert into Employee (FirstName, LastName, BirthDate, Gender, DepartmentId) values ('Donald', 'Trump', '14-3-2023', 'Nam', 1);
insert into Employee (FirstName, LastName, BirthDate, Gender, DepartmentId) values ('Kim', 'Jong-un', '14-3-2023', 'Nu', 3);
select * from Employee

-- tao view
create view ViewEmployee as
select FirstName, LastName, Gender, DepartmentName
from Employee, Department
where Employee.DepartmentId = Department.DepartmentId

-- xem view
select * from ViewEmployee