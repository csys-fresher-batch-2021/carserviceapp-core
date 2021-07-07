# add_service
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
select * from  add_service ;
