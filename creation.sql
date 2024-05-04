
drop table signin;




create table signin (
    id number ,
    firstname varchar2(30) not null,
 lastname varchar2(30) not null,
  username varchar2(30) not null,
  password varchar2(30) not null ,
  phonenumber varchar2(30) not null,
  email varchar2(30) not null,
  constraint signin_pk primary key (username));
