create table sys_user (
    id char(32) not null,
    login_name varchar(127),
    ctime datetime,
    password char(32),
    nick_name varchar(127),
    sex integer,
    status_ integer,
    birthday date,
    primary key (id)
) ENGINE=InnoDB;