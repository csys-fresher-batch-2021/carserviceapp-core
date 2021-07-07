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

CREATE TABLE service_estimation(
  Services varchar(25),
  Actual_price varchar(25),
  estimated_price varchar(20),
  discounts varchar(100) NOT NULL,
  Actual_time_duration varchar(100),
  estimated_time varchar(10)
  
) ;

INSERT INTO  service_estimation  VALUES ('waterwash','500','400','5%','1day','half a day');
INSERT INTO  service_estimation  VALUES ('general','1000','800','10%','2day','1 day');
commit;
select * from  service_estimation ;
CREATE TABLE update_car_service_status(
  Services varchar(25),
  Initiated varchar(20),
  In_progress varchar(100) NOT NULL,
   completed varchar(10)
  
) ;

INSERT INTO  update_car_service_status VALUES ('general','null','yes','null');
commit;

CREATE TABLE add_service (
  Services varchar(25),
  price varchar(25),
  discounts varchar(100) NOT NULL,
  time_duration varchar(100),
  incharge_name varchar(50),
  incharge_phn varchar(15)
) ;

INSERT INTO  add_service  VALUES ('waterwash','500','5%','half a day','muthu','9849865285');
INSERT INTO  add_service  VALUES ('general','1000','0%','1day','parthi','97259732634');
commit;


CREATE TABLE list_all_service (
  Services varchar(25),
  price varchar(25),
  discounts varchar(100) NOT NULL,
  time_duration varchar(100),
  incharge_name varchar(50),
  incharge_phn varchar(15)
) ;

INSERT INTO list_all_service  VALUES ('waterwash','750','10%','half a day','deepa','8798435245');
INSERT INTO list_all_service  VALUES ('general','1000','20%','1day','nandhu','9874537436');
INSERT INTO list_all_service  VALUES ('wheel allignment','500','5%','half a day','muthu','9849865285');
INSERT INTO list_all_service  VALUES ('bumper fixing','1000','0%','1day','parthi','97259732634');
commit;
select * from list_all_service ;

CREATE TABLE delete_service (
  Services varchar(25),
  price varchar(25),
  discounts varchar(100) NOT NULL,
  time_duration varchar(100),
  incharge_name varchar(50),
  incharge_phn varchar(15)
) ;


INSERT INTO  delete_service  VALUES ('wheel allignment','500','5%','half a day','muthu','9849865285');
INSERT INTO  delete_service  VALUES ('bumper fixing','1000','0%','1day','parthi','97259732634');
commit;
select * from  delete_service ;

CREATE TABLE bookcar_service(
  Services varchar(25),
  estimated_price varchar(20),
  discounts varchar(100) NOT NULL,
  estimated_time varchar(10)
  
) ;

INSERT INTO bookcar_service VALUES ('waterwash','500','5%','1day');
INSERT INTO  bookcar_service  VALUES ('general','1000','10%','2day');
commit;

