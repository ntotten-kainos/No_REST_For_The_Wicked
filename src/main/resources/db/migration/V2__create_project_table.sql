CREATE TABLE Project (

projectID int PRIMARY KEY NOT NULL AUTO_INCREMENT,
projectName varchar(100) NOT NULL,
projectValue decimal(11,2) NOT NULL
);

INSERT INTO Project (projectName, projectValue)
VALUES ("Project One", 99.99);

INSERT INTO Project (projectName, projectValue)
VALUES ("Project Two", 1047.48);

INSERT INTO Project (projectName, projectValue)
VALUES ("Project Three", 11250.15);