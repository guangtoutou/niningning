ALTER DATABASE `niningning` DEFAULT CHARACTER SET utf8 DEFAULT COLLATE utf8_general_ci;
drop table if exists salesman;
drop table if exists distributor;
drop table if exists store;
drop table if exists storetype;
drop table if exists territory;


create table distributor (
  id int(8) not null auto_increment primary key,
  distname varchar(50) not null,
  soldto varchar(20) not null,
  address varchar(100) not null
)DEFAULT CHARSET=utf8;

create table storetype (
  id int(2) not null auto_increment primary key,
  storetypename varchar(20) not null
)DEFAULT CHARSET=utf8;

create table store (
  id int(8) not null auto_increment primary key,
  storename varchar(50) not null,
  storetype int(2) not null,
  size int(8) not null,
  address varchar(100) not null,
  foreign key (storetype) references storetype(id)
)DEFAULT CHARSET=utf8;

create table salesman (
  id int(8) not null auto_increment primary key,
  salesmanname varchar(50) not null,
  birthdate datetime not null,
  entrydate datetime not null,
  mobile varchar(20) not null,
  distributor int(8) not null,
  foreign key (distributor) references distributor(id)
)DEFAULT CHARSET=utf8;

create table territory (
  id int(8) not null auto_increment primary key,
  salesman int(8) not null,
  store int(8) not null,
  foreign key (salesman) references salesman(id),
  foreign key (store) references store(id)
)DEFAULT CHARSET=utf8;
