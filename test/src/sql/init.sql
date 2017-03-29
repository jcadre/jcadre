create table sys_user (
	id char(32) not null,
	login_name varchar(127) not null,
	ctime datetime not null,
	password char(32) not null,
	nick_name varchar(127),
	sex integer,
	status_ integer not null,
	birthday date,
	primary key (id)
) ENGINE=InnoDB;