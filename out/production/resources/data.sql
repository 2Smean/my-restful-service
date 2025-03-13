insert into users(id, join_date, name, password, ssn) values(90001, now(), 'User1', 'test111', '009093-3049582');
insert into users(id, join_date, name, password, ssn) values(90002, now(), 'User2', 'test222', '990493-4958374');
insert into users(id, join_date, name, password, ssn) values(90003, now(), 'User3', 'test333', '994857-4059384');

insert into post(description, user_id) values ('My first post', 90001);
insert into post(description, user_id) values ('My second post', 90001);