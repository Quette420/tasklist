insert into users (name, username, password)
values ('John Doe', 'johndoe@gmail.com', '$2a$10$qZoWSddcphfP2xHo5KMHi.DeW1j0Sp8/OvAonlQbn4xliIGU.DPue'),
       ('Mike Smith', 'mikesmith@gmail.com', '$2a$10$1IpDARpZnOQBg13E48KmJuWSZYO/im9.h8CMAJzl4sOFYEeTGmT.6');

insert into tasks (title, description, status, expiration_date)
values ('Buy cheese', null, 'TODO', '2023-01-29 12:00:00'),
       ('Do homework', 'math', 'IN_PROGRESS', '2023-01-31 08:00:00'),
       ('Cleaning', null, 'DONE', null),
       ('Call Mike', 'Ask about gym', 'TODO', '2023-01-29 12:00:00');

insert into users_tasks (task_id, user_id)
values (1, 2),
       (2, 2),
       (3, 2),
       (4, 1);

insert into users_roles (user_id, role)
values (1, 'ROLE_ADMIN'),
       (1, 'ROLE_USER'),
       (2, 'ROLE_USER');