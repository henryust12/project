use ElonBook;
-- Elon Users --
create table elon_users
(
    USER_ID          varchar(10)                        not null,
    FIRST_NAME       varchar(100)                       not null,
    FIRST_NAME_KANA varchar(100)                       null,
    LAST_NAME        varchar(100)                       not null,
    LAST_NAME_KANA   varchar(100)                       null,
    SEX              char(1)                            not null,
    PHONE_NUMBER     varchar(12)                        null,
    BIRTHDAY         date                               null,
    DATE_OF_EMPLOYEE date                               not null,
    USER_LEVEL       char(1)                            not null comment '1=レジ
2=マネージャー ',
    PASSWORD         varchar(100)  default 1234         null,
    CREATED          datetime default current_timestamp null,
    UPDATED          datetime default current_timestamp null,
    constraint elon_users_pk
        primary key (USER_ID)
);

-- Elon Books --
create table elon_books
(
    ISBN            varchar(20)                         not null,
    TITLE           varchar(100)                        not null,
    TITLE_KANA      varchar(100)                        null,
    PRICE           int(11)                             not null,
    DISCOUNT        int(3)                              not null,
    STOCK           int(4)                              not null,
    PUBLISHER       varchar(100)                        not null,
    AUTHOR          varchar(100)                        not null,
    AUTHOR_KANA     varchar(100)                        not null,
    GENRE_ID        int(2)                              null,
    CREATED         datetime default current_timestamp  null,
    UPDATED         datetime default current_timestamp  null,
    constraint elon_books_pk
        primary key (ISBN)
);

-- Elon Genres -
create table elon_genres
(
    ID              int(2)                              not null auto_increment,
    GENRE_NAME      varchar(100)                        not null,
    CREATED         datetime default current_timestamp  null,
    UPDATED         datetime default current_timestamp  null,
    constraint elon_genres_pk
        primary key (id)
);


-- Elon Buys --
create table elon_buys
(
    ID              int(11)                             not null auto_increment,
    USER_ID         varchar(10)                         null,
    ISBN            varchar(20)                         not null,
    AMOUNT          int(3)                              null default 0,
    CREATED         datetime default current_timestamp  null,
    constraint elon_buys_pk
        primary key (ID)
);


-- RELATION --
-- Book to Genre --
alter table elon_books
    add constraint elon_books_elon_genres_id_fk
        foreign key (GENRE_ID) references elon_genres (ID)
            on update cascade on delete set null;


-- Buy to Book --
alter table elon_buys
    add constraint ElonBuys_ElonBooks_isbn_fk
        foreign key (ISBN) references elon_books (ISBN)
            on update cascade on delete cascade;

-- Buy to User --
alter table elon_buys
    add constraint ElonBuys_ElonUsers_user_id_fk
        foreign key (USER_ID) references elon_users (USER_ID)
            on update cascade on delete set null;



-- Insert Data --
-- Insert into genre --
INSERT INTO elon_genres
    (GENRE_NAME, CREATED, UPDATED)
    VALUES
           ('文芸', DEFAULT, DEFAULT),
           ('教養', DEFAULT, DEFAULT),
           ('教育', DEFAULT, DEFAULT),
           ('社会', DEFAULT, DEFAULT),
           ('法律', DEFAULT, DEFAULT),
           ('経済', DEFAULT, DEFAULT),
           ('経営', DEFAULT, DEFAULT),
           ('ビジネス', DEFAULT, DEFAULT),
           ('理学', DEFAULT, DEFAULT),
           ('工学', DEFAULT, DEFAULT),
           ('語学', DEFAULT, DEFAULT),
           ('芸術', DEFAULT, DEFAULT),
           ('ゲーム', DEFAULT, DEFAULT),
           ('エンターテイメント', DEFAULT, DEFAULT),
           ('コミック', DEFAULT, DEFAULT),
           ('児童', DEFAULT, DEFAULT),
           ('辞典', DEFAULT, DEFAULT);

-- Insert into user --
INSERT INTO elon_users (USER_ID, FIRST_NAME, FIRST_NAME_KANA, LAST_NAME, LAST_NAME_KANA, SEX, PHONE_NUMBER, BIRTHDAY, DATE_OF_EMPLOYEE, USER_LEVEL, PASSWORD, CREATED, UPDATED) VALUES ('1111111', 'HENDRI', 'へんどり', 'SIMARMATA', 'しまるまた', '1', '07012345678', '2022-03-05', '2022-03-05', '2', '1234', DEFAULT, DEFAULT);

-- Insert into book --
INSERT INTO elon_books (ISBN, TITLE, TITLE_KANA, PRICE, DISCOUNT, STOCK, PUBLISHER, AUTHOR, AUTHOR_KANA, GENRE_ID, CREATED, UPDATED) VALUES ('1122222221', 'NARUTO', 'ナルト', 1200, 20, 15, '新潮社', '岸本　斉史', 'マサシ　キシモト', 4, DEFAULT, DEFAULT);

-- Insert into buy --
INSERT INTO elon_buys (USER_ID, ISBN, AMOUNT, CREATED) VALUES ('1111111', '1122222221', 3, DEFAULT);
INSERT INTO elon_buys (USER_ID, ISBN, AMOUNT, CREATED) VALUES ('1111111', '1122222221', 5, DEFAULT);
INSERT INTO elon_buys (USER_ID, ISBN, AMOUNT, CREATED) VALUES ('1111111', '1122222221', 2, DEFAULT);
