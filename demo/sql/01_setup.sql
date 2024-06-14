
-- Create the database and user for the demo application
create database demo;
create user 'demo'@'%' identified with 'mysql_native_password' by 'tech8123' require none account unlock;
