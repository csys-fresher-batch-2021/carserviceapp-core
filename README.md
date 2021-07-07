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

RATING CAR SERVICE
CREATE TABLE rating_car_service(
  Services varchar(25),
  customer_name varchar(20),
  incharge_name varchar(100) NOT NULL,
   rating varchar(10),
   review varchar(20)
  
) ;

INSERT INTO  rating_car_service VALUES ('general','ftwyu','hdas','8','good');
INSERT INTO  rating_car_service VALUES ('water_wash','utr','jeyu9','8','good');
commit;
