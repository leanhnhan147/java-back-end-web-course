create database FinalAssignment;
go

use FinalAssignment
go

create table SalariedEmployee(
	SalariedEmployeeId int identity primary key,
	commistionRate double not null,
	grossSales double not null,
	basicSalary double not null,
	
);
go

create table HourlyEmployee(
	HourlyEmployeeId int identity primary key,
	wage double not null,
	workingHours double not null,	
);
go

create table Employee(
	employeeId int identity primary key,
	ssn varchar(100) not null,
	firstName varchar(100) not null,
	lastName varchar(100) not null,
	birthDate varchar(100) not null,
	phone varchar(100) not null,
	email varchar(100) not null,
	SalariedEmployeeId int,
	HourlyEmployeeId int,

	constraint check_ids CHECK (SalariedEmployeeId IS NOT NULL OR HourlyEmployeeId IS NOT NULL),

	constraint FK_Employee_HourlyEmployee foreign key (HourlyEmployeeId) references HourlyEmployee(HourlyEmployeeId),
	constraint FK_Employee_SalariedEmployee foreign key (SalariedEmployeeId) references SalariedEmployee(SalariedEmployeeId)
);
go

create table Department(
	departmentId int primary key identity,
	departmentName varchar(100) ,
	employeeId int,
	constraint FK_Department_Employee foreign key (employeeId) references Employee(employeeId)
);
go
