CREATE TABLE registeration (
  FirstName varchar(25),
  LastName varchar(25),
  username varchar(100) NOT NULL,
  email varchar(100) NOT NULL,
  pswd varchar(100) NOT NULL
) ;
alter table registeration drop column username;
select * from registeration;
INSERT INTO registeration VALUES ('deepa','bala','dee@gmail.com','drt');
INSERT INTO registeration VALUES ('nandhu','ravi','nandi@gmail.com','try');
INSERT INTO registeration VALUES ('muthu','kumar','muthu@gmail.com','gyu');
INSERT INTO registeration VALUES ('parthu','ravi','parthu@gmail.com','huie');
commit;
