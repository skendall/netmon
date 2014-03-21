

# --- !Ups

create table host (
    id bigint(20) not null auto_increment,
    host char(1024) not null,
    endpoint char(1024) not null
);

create table monitor (
    id bigint(20) not null auto_increment,
    host_id bigint(20) not null,
    monitor_type_id bigint(20) not null,
    frequency int(10)
);

create table monitor_type (
    id bigint(20) not null auto_increment,
    label char(20) not null
);

create table node (
    id bigint(20) not null auto_increment,
    ip char(20)
);

# --- !Downs

drop table host;
drop table monitor;
drop table monitor_type;
drop table node;