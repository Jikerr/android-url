CREATE TABLE service_url(
  id NUMBER not null auto_increment primary key,
  url VARCHAR (200),
  device_type VARCHAR(200),
  remark VARCHAR(200),
  update_time VARCHAR(200),
  create_time VARCHAR(200),
  update_date DATETIME ,
  create_date DATETIME
);