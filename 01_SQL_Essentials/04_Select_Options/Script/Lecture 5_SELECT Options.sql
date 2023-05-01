Create database R2S_Training
go
USE R2S_Training

create table Trainer(
	TrainerId int identity primary key,
	TrainerName nvarchar(100) not null,
	TrnSalary real,
	TrnAge int
);

insert into Trainer values ('Nguyen Van A', 10000000, 30);
insert into Trainer values ('Nguyen Van B', 15000000, 40);
insert into Trainer values ('Nguyen Van C', 12000000, 25);
insert into Trainer values ('Nguyen Van D', 13000000, 27);
--insert into Trainer values ('Nguyen Van E', 18000000, 27);
select * from Trainer
GO
SELECT * FROM dbo.Trainer

select max(TrnSalary) from Trainer

GO
-- MAX Function
SELECT *
FROM dbo.Trainer
WHERE TrnSalary = (SELECT MAX(TrnSalary) FROM Trainer)

GO
--MIN
SELECT *
FROM dbo.Trainer tr
WHERE TR.TrnAge = 
	(SELECT MIN(TrnAge) FROM Trainer)

GO
-- AVG
SELECT *
FROM dbo.Trainer tr
WHERE TR.TrnSalary >= (SELECT AVG(TrnSalary) FROM Trainer)

GO
-- Create table
IF EXISTS (SELECT * FROM sys.tables WHERE name = 'Students')
	DROP TABLE Students

GO
CREATE TABLE Students(
	StudentId		INT IDENTITY PRIMARY KEY
,	StudentName		VARCHAR(50)
,	SubjectId		CHAR(5)
,	StudentMark		FLOAT,
	TrainerId int foreign key references Trainer(TrainerId)
)

GO
INSERT INTO Students
VALUES	('John',  'DBS', 76.5, 1),
		('John',  'IAI', 72.25, 2),
		('Mary',  'DBS', 60.5, 3),
		('Mand',  'PR1', 63.25, 4),
		('Mand',  'PR2', 35.0, 1), 
		('Jane',  'IAI', 54.5, 3)

-- thong ke so luong hoc sinh cua tung trainer
select t.TrainerId, TrainerName, COUNT(s.StudentId) as 'SO Luong hoc sinh'
from Students s, Trainer t
where s.TrainerId = t.TrainerId
group by t.TrainerId, TrainerName

-- Having
SELECT s.StudentName, COUNT(s.SubjectId) AS SubjectNumber
FROM dbo.Students s
where StudentMark >= 50
GROUP BY s.StudentName
HAVING COUNT(s.SubjectId) >= 2


-- thong ke so luong hoc sinh cua tung trainer
select t.TrainerId, TrainerName, COUNT(s.StudentId) as 'SO Luong hoc sinh'
from Students s, Trainer t
where s.TrainerId = t.TrainerId
group by t.TrainerId, TrainerName

GO


select TrainerId, TrainerName, NULL as 'Column3' from Trainer
union
select StudentId, StudentName, StudentMark from Students


-- UNION ALL
SELECT p.P_Id AS Id, p.LastName + ' ' + p.FirstName AS Name, p.Address, p.City, '1' AS Flag
FROM Persons p
UNION ALL
SELECT c.CustomerID, c.CustomerName, c.Address, c.City, '2' AS Flag
FROM Customer c
