
DROP TABLE IF EXISTS users;
CREATE TABLE users(
user_id INT PRIMARY KEY,
password varchar(255),
username varchar(255)
);

DROP TABLE IF EXISTS roles;
CREATE TABLE roles(
role_id INT PRIMARY KEY,
name VARCHAR(255)
);

DROP TABLE IF EXISTS users_roles;
CREATE TABLE users_roles(
user_id INT PRIMARY KEY,
role_id INT
);


insert into roles (
role_id,
name
)
values (
1,
'ADMIN'
);


insert into users (
user_id,
password,
username) 
values (
1,
'$2a$12$fiaWE7X6hW/ROIIGsHLBLuTww4k4N78UiC2pgLP/r0HmooYtfso.q',
'SriGanesha'
);



insert into users_roles (
user_id,
role_id
)
values (
1,
1
);



