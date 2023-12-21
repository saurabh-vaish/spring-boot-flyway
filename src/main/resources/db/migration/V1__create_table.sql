-- by default every sql file content is transactional in flyway, so problem comes in any query it will rollback the whole file
-- if want to not to rollback success items, then break sql files


create table test_user(id bigint not null,name varchar(255), CONSTRAINT user_pkey PRIMARY KEY (id));

insert into test_user(id,name) values(1,'abc');
insert into test_user(id,name) values(2,'xyz');
