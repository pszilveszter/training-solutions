CREATE TABLE `activities` (
 `id` BIGINT(20) AUTO_INCREMENT,
 `start_time` TIMESTAMP,
 `activity_desc` VARCHAR(255),
 `activity_type` VARCHAR(255),
  PRIMARY KEY (`id`)
);

INSERT INTO activities VALUES (NULL, '2000-12-3 10:23:00','Biking around Balaton','BIKING');
INSERT INTO activities VALUES (NULL, '2002-11-4 09:43:00','Hiking on Bakony','HIKING');
INSERT INTO activities VALUES (NULL, '2002-11-7 10:11:00','Running to the hills','RUNNING');