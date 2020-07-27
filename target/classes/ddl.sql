drop table if exists member_role;
drop table if exists member;


-- -----------------------------------------------------
-- Table `member`
-- -----------------------------------------------------
CREATE TABLE `member` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT 'member id',
  `name` VARCHAR(255) NOT NULL COMMENT 'member name',
  `password` VARCHAR(255) NOT NULL COMMENT '암호회된 password',
  `email` VARCHAR(255) NOT NULL UNIQUE COMMENT 'login id, email',
  `create_date` DATETIME NULL DEFAULT NULL COMMENT '등록일',
  `modify_date` DATETIME NULL DEFAULT NULL COMMENT '수정일',
  PRIMARY KEY (`id`)) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- -----------------------------------------------------
-- Table `member_role`
-- -----------------------------------------------------
CREATE TABLE `member_role` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT 'role id',
  `member_id` INT(11) NOT NULL COMMENT 'member id fk',
  `role_name` VARCHAR(100) NOT NULL COMMENT 'role 이름 ROLE_ 로 시작하는 값이어야 한다.',
  PRIMARY KEY (`id`),
  FOREIGN KEY (`member_id`)
  REFERENCES `member` (`id`)
)  ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- dml
insert into member (id, name, password, email, create_date, modify_date) values ( 1, '박상아', '$2a$10$G/ADAGLU3vKBd62E6GbrgetQpEKu2ukKgiDR5TWHYwrem0cSv6Z8m', 'sanga@example.com', now(), now());
insert into member (id, name, password, email, create_date, modify_date) values ( 2, '유혜민', '$2a$10$G/ADAGLU3vKBd62E6GbrgetQpEKu2ukKgiDR5TWHYwrem0cSv6Z8m', 'hyemin@example.com', now(), now());

insert into member_role (id, member_id, role_name) values (1, 1, 'ROLE_USER');
insert into member_role (id, member_id, role_name) values (2, 1, 'ROLE_ADMIN');
insert into member_role (id, member_id, role_name) values (3, 2, 'ROLE_USER');