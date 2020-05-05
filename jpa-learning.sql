create schema test collate utf8_general_ci;

create table class
(
    id bigint auto_increment
        primary key,
    name varchar(255) null
);

create table course
(
    id bigint auto_increment
        primary key,
    name varchar(255) null
);

create table course_student_relation
(
    Id bigint auto_increment
        primary key,
    course_id bigint null,
    student_id bigint null
);

create table course_teacher_relation
(
    id bigint auto_increment
        primary key,
    course_id bigint null,
    teacher_Id bigint null
);

create table score
(
    id bigint auto_increment
        primary key,
    student_Id bigint null,
    course_id bigint null,
    score decimal(4,1) null
);

create table student
(
    id bigint auto_increment
        primary key,
    name varchar(255) not null,
    class_id bigint null
);

create table teacher
(
    id bigint auto_increment
        primary key,
    name varchar(255) null
);

INSERT INTO test.class (id, name) VALUES (1, '1班');
INSERT INTO test.class (id, name) VALUES (2, '2班');
INSERT INTO test.class (id, name) VALUES (3, '3班');
INSERT INTO test.class (id, name) VALUES (4, '4班');
INSERT INTO test.course (id, name) VALUES (1, '语文');
INSERT INTO test.course (id, name) VALUES (2, '数学');
INSERT INTO test.course (id, name) VALUES (3, '英语');
INSERT INTO test.student (id, name, class_id) VALUES (1, '学生1', 1);
INSERT INTO test.student (id, name, class_id) VALUES (2, '学生2', 1);
INSERT INTO test.student (id, name, class_id) VALUES (3, '学生3', 2);
INSERT INTO test.student (id, name, class_id) VALUES (4, '学生4', 2);
INSERT INTO test.student (id, name, class_id) VALUES (5, '学生5', 2);
INSERT INTO test.student (id, name, class_id) VALUES (6, '学生6', 2);
INSERT INTO test.student (id, name, class_id) VALUES (7, '学生7', 3);
INSERT INTO test.student (id, name, class_id) VALUES (8, '学生8', 3);
INSERT INTO test.student (id, name, class_id) VALUES (9, '学生9', 3);
INSERT INTO test.student (id, name, class_id) VALUES (10, '学生10', 4);
INSERT INTO test.teacher (id, name) VALUES (1, '老师1');
INSERT INTO test.teacher (id, name) VALUES (2, '老师2');
INSERT INTO test.teacher (id, name) VALUES (3, '老师3');