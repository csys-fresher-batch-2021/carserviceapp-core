# Project Features
LOGIN PAGE
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
