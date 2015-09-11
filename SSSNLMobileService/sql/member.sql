CREATE TABLE shirdisa_mobileapp.Member (
   id INT AUTO_INCREMENT NOT NULL,
   name VARCHAR(40) NOT NULL,
   address VARCHAR(100),
   date_of_birth DATE,
   age INT,
   mobile_number VARCHAR(20),
   landline_number VARCHAR(20),
   email VARCHAR(30),
   seva_1 INT,
   seva_2 INT,
   seva_3 INT,
   seva_4 INT,
  PRIMARY KEY (id)
);
COMMIT;