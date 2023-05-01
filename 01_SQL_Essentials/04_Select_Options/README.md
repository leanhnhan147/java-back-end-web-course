# Select Options

## Learning Goals
- Understand and use SQL functions.
- Use Group, Having, Order clauses to built queries.
- Copy data from one table into another, combine the result-set of two or more SELECT statements.

## Table of contents
- SQL Clauses
  - Grouping by clause
  - Having clause
  - WHERE and HAVING
  - Order by clause
- SQL Functions
  - What is an aggregate function
    - An aggregate function is function that take a collection of values as input and return a single value.
    - Aggregate functions can be used as expressions only in the following:
      - The select list of a SELECT statement
      - A HAVING clause.
  - Aggregate Functions
| Function      | Description                 				            |
| ------------- | ----------------------------------------------------- |
| AVG()         | Return the average value in a column       		    |
| COUNT()     	| Return the total number of values in a given column   |
| COUNT(*)		| Return the number of rows      				        |
| MIN()    		| Returns the smallest value in a column      		    |
| MAX()		    | Returns the largest value in a column 			    |
| SUM()		    | Returns the sum values in a column 			        |
  - Scalar functions
| Function      | Description                 				                    |
| ------------- | ------------------------------------------------------------- |
| LEN()         | Returns the length of a text field           		            |
| ROUND()     	| Rounds a numeric field to the number of decimals specified    |
| NOW(*)		| Returns the current system date and time      		        |
| FORMAT()    	| Formats how a field is to be displayed      		            |
- Other Options
  - UNION Operator
  - SELECT INTO Statement
  - INSERT INTO SELECT Statement