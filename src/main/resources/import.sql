create database if not exists server;

# create table user
create table if not exists user
(
  id         int                                                                          auto_increment,
  username   varchar(32)  not null,
  name       varchar(32) null,
  created_at datetime    not null                                                         default NOW(),
  last_login datetime    not null                                                         default NOW(),
  password   text        not null,
  bio        varchar(140) null,
  role       tinyint      null,
  constraint username
  unique (username),
  primary key (id)
);

# create table comment
create table if not exists comment
(
  id       int auto_increment,
  content text         not null,
  username varchar(32) not null,
  primary key (id),
  constraint foreign key (username) references user (username)
);

# create table article
create table if not exists article
(
  id          int               auto_increment,
  title varchar(128)      not null,
  created_at datetime not null default NOW(),
  modified_at datetime not null default NOW(),
  author      varchar(32) not null,
  content     text        not null,
  category    varchar(32),
  comments    int,
  primary key (id),
  constraint foreign key (comments) references comment (id)
);

