CREATE TABLE update_car_service_status(
  Services varchar(25),
  Initiated varchar(20),
  In_progress varchar(100) NOT NULL,
   completed varchar(10)
  
) ;

INSERT INTO  update_car_service_status VALUES ('general','null','yes','null');
commit;
select * from  update_car_service_status;
