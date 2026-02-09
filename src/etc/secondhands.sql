drop database if exists secondhands;
create database secondhands;
use secondhands;
create table secondhands(
	pno int auto_increment,
    constraint primary key(pno),
    nickname varchar(30) not null,
    pname varchar(30) not null,
    ptxt longtext not null,
    pprice int not null,
    ppw varchar(30) not null,
    pnumber varchar(30) not null,
    pstatus bool default true,
    bdate datetime default now()
);