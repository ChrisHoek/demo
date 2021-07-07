drop table IF EXISTS billionaires;

create TABLE billionaires (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  career VARCHAR(250) DEFAULT NULL
);

create TABLE temperatures (
    id INT AUTO_INCREMENT PRIMARY KEY,
    degrees VARCHAR(5) NOT NULL
);

insert into temperatures (degrees) values
    ('10'),
    ('20');