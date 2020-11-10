CREATE DATABASE education;

CREATE TABLE IF NOT EXISTS student (
    studentid INT(11) AUTO_INCREMENT,
    course INT(11),
    name VARCHAR(250) NOT NULL,
    is_completed BOOLEAN NOT NULL DEFAULT FALSE,
    PRIMARY KEY (studentid),
);

CREATE TABLE IF NOT EXISTS course (
    courseid INT(11) AUTO_INCREMENT,
    name VARCHAR(250) NOT NULL,
    PRIMARY KEY (courseid),
    FOREIGN KEY (course)
);

CREATE TABLE IF NOT EXISTS course (
    institutionid INT(11) AUTO_INCREMENT,
    name VARCHAR(250) NOT NULL,
    FOREIGN KEY (institutionid)
);