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

CREATE TABLE login(
    login_id VARCHAR(20) PRIMARY KEY ,
    username VARCHAR(50) NOT NULL UNIQUE,
    pswd VARCHAR(255) NOT NULL

);
INSERT INTO login VALUES ('123','deepa','Dee1');
INSERT INTO login VALUES ('456','nandhu','nan1');
INSERT INTO login VALUES ('789','muthu','mun1');
INSERT INTO login VALUES ('321','parthu','par1');
commit;
select * from login;
