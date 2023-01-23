insert into users (username, password, enabled) values ('bhoopendra', 'password', true);
insert into authorities (username, authority) values ('bhoopendra', 'VIEW_USER');

insert into users (username, password, enabled) values ('user', 'password', true);
insert into authorities (username, authority) values ('user', 'VIEW_USER');

insert into users (username, password, enabled) values ('admin', 'password', true);
insert into authorities (username, authority) values ('admin', 'VIEW_ADMIN');