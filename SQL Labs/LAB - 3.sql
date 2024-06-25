-- Selct into - part - A
CREATE TABLE CRICKET(
	Name VARCHAR(50),
	City VARCHAR(50),
	Age INT
);

insert into cricket values('Sachin Tendulkar', 'Mumbai', 30)
insert into cricket values('Rahul Dravid', 'Bombay', 35)
insert into cricket values('M. S. Dhoni', 'Jharkhand', 31)
insert into cricket values('Surensh Raina', 'Gujarat', 30)

select * from CRICKET

--1. Create table Employee_detail from Employee with all the columns and data.1. 
	select * into worldcup from CRICKET

--2. Create table T20 from cricket with first two columns with no data.
	select Name, City into T20 from cricket where 1=2

--3. Create table IPL From Cricket with No Data	select * into IPL from CRICKET where 1=2	select * from IPL

-- part - B
--EMPLOYEE
--Name City Age
--Jay Patel Rajkot 30
--Rahul Dave Baroda 35
--Jeet Patel Surat 31
--Vijay Raval Rajkot 30

CREATE TABLE EMPLOYEE(
	name varchar(50),
	city varchar(50),
	age int
);

insert into EMPLOYEE values('Jay Patel', 'Rajkot', 30)
insert into EMPLOYEE values('Rahul Dave','Baroda',35)
insert into EMPLOYEE values('Jeet Patel','Surat',31)
insert into EMPLOYEE values('Vijay Raval','Rajkot',30)

--1. Create table Employee_detail from Employee with all the columns and data.
	select * into Employee_detail from employee
	
--2. Create table Employee_data from Employee with first two columns with no data.
	select name, city into Employee_data from EMPLOYEE where 1=2

--3. Create table Employee_info from Employee with no Data	select * into Employee_info from EMPLOYEE where 1=2-- part - C
--1. Insert the Data into Employee_info from Employee whose CITY is Rajkot
	insert into Employee_info select * from EMPLOYEE where city = 'RAJKOT'
	select * from Employee_info

--2. Insert the Data into Employee_info from Employee whose age is more than 32.	insert into Employee_info select * from EMPLOYEE where age > 32
	select * from Employee_info

-- Update - part - A
--1. Update deposit amount of all customers from 3000 to 5000. (Use Deposit Table)
	update deposit set amount = 5000 where amount = 3000

--2. Change branch name of ANIL from VRCE to C.G. ROAD. (Use Borrow Table)
	update borrow set bname = 'C.G.ROAD' where bname = 'vrce'

--3. Update Account No of SANDIP to 111 & Amount to 5000. (Use Deposit Table)
	update deposit set ACTNO = 111, amount = 5000 where cname = 'SANDIP'

--4. Update amount of KRANTI to 7000. (Use Deposit Table)
	update deposit set amount = 7000 where cname = 'KRANTI'

--5. Update branch name from ANDHERI to ANDHERI WEST. (Use Branch Table)
	update branch set bname = 'ANDHERI WEST' where bname = 'ANDHERI'

--6. Update branch name of MEHUL to NEHRU PALACE. (Use Deposit Table)
	update deposit set bname = 'NEHRU PLACE' where cname = 'MEHUL'

--7. Update deposit amount of all depositors to 5000 whose account no between 103 & 107. (Use Deposit Table)
	update deposit set amount = 5000 where ACTNO between 103 and 107

--8. Update ADATE of ANIL to 1-4-95. (Use Deposit Table)
	update deposit set adate = '1995-04-01' where cname = 'ANIL'

--9. Update the amount of MINU to 10000. (Use Deposit Table)
	update deposit set amount = 10000 where cname = 'MEHUL'
	select * from DEPOSIT

--10. Update deposit amount of PRAMOD to 5000 and ADATE to 1-4-96 (Use Deposit Table)
	update deposit set amount = 5000, adate = '1996-04-01' where cname = 'PRAMOD'

-- part - B
--1. Give 10% Increment in Loan Amount. (Use Borrow Table)
	update BORROW set amount = (amount * 1.1)
	select * from BORROW

--2. Customer deposits additional 20% amount to their account, update the same. (Use Deposit Table)
	update DEPOSIT set amount = (amount * 1.2)
	select * from DEPOSIT
	
-- part - C
--1. Update amount of loan no 321 to NULL. (Use Borrow Table)
	update BORROW set amount = null where LOANNO = 321
	
--2. Update branch name of KRANTI to NULL (Use Borrow Table)
	update BORROW set bname = null where cname = 'KRANTI'

--3. Display the name of borrowers whose amount is NULL. (Use Borrow Table)
	select cname from BORROW where amount is null

--4. Display the Borrowers whose having branch. (Use Borrow Table)
	select * from BORROW where bname is not null

--5. Update the Loan Amount to 5000, Branch to VRCE & Customer Name to Darshan whose loan no is 481.(Use Borrow Table)
	update BORROW set AMOUNT = 5000, bname = 'VRCE', cname = 'DARSHAN' where LOANNO = 481

--6. Update the Deposit table and set the date to 01-01-2021 for all the depositor whose amount is less than 2000.
	update DEPOSIT set ADATE = '2021-02-01' where amount < 2000

--7. Update the Deposit table and set the date to NULL & Branch name to ‘ANDHERI whose Account No is 110.
	update DEPOSIT set adate = null, bname = 'ANDHERI' where ACTNO = 110