use testdb;


create table manager(
mid int primary key,
mname varchar(100),
mshift varchar(100),
msalary double
);


create table item(
itemid varchar(100) primary key,
dish varchar(100),
price double,
category varchar(100)
);


create table customer_order(
orderid int primary key,
cname varchar(100),
cphone varchar(100),
caddress varchar(100),
itemid varchar(100),
cqty int,
ctotal double,
orderdate varchar(100),
foreign key (itemid) references item(itemid)
);

