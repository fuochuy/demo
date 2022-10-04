create database demo;
use demo;

create table users(
                      mssv int primary key,
                      password varchar(255),
                      email varchar(255),
                      full_name varchar(2550),
                      phone varchar(15)
);

insert into users(mssv, email, full_name, phone)
values
    ('19120529', '19120529@student.hcmus.edu.vn', 'Nguyen Phuoc Huy','0917*******'),
    ('19120517', '19120517@student.hcmus.edu.vn', 'Truong Van Hoang','0917*******'),
    ('19120503', '19120503@student.hcmus.edu.vn', 'Nguyen Thanh Hien','0917*******'),
    ('1712342', '1712342@student.hcmus.edu.vn', 'Nguyen Van Dien','0917*******');

