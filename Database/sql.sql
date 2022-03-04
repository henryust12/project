
-- Elon Users --
create table ElonUsers
(
    user_id          varchar(10)                        not null,
    first_name       varchar(100)                       not null,
    first_name_kana  varchar(100)                       null,
    last_name        varchar(100)                       not null,
    last_name_kana   varchar(100)                       null,
    sex              char(1)                            not null,
    phone_number     varchar(12)                        null,
    birthday         date                               null,
    date_of_employee date                               not null,
    user_level       char(1)                            not null comment '1=レジ
2=マネージャー ',
    password         varchar(100)  default 1234         null,
    created          datetime default current_timestamp null,
    updated          datetime default current_timestamp null,
    constraint ElonUsers_pk
        primary key (user_id)
);

-- Elon Books --
create table ElonBooks
(
    isbn            varchar(20)                         not null,
    title           varchar(100)                        not null,
    title_kana      varchar(100)                        null,
    price           int(11)                             not null,
    discount        int(3)                              not null,
    stock           int(4)                              not null,
    publisher       varchar(100)                        not null,
    author          varchar(100)                        not null,
    author_kana     varchar(100)                        not null,
    genre_id        int(2)                              null,
    created         datetime default current_timestamp  null,
    updated         datetime default current_timestamp  null,
    constraint ElonBooks_pk
        primary key (isbn)
);

-- Elon Genres -
create table ElonGenres
(
    id              int(2)                              not null auto_increment,
    genre_name      varchar(100)                        not null,
    created         datetime default current_timestamp  null,
    updated         datetime default current_timestamp  null,
    constraint ElonGenres_pk
        primary key (id)
);


-- Elon Buys --
create table ElonBuys
(
    id              int(11)                             not null auto_increment,
    user_id         varchar(10)                         null,
    isbn            varchar(20)                         not null,
    amount          int(3)                              null default 0,
    created         datetime default current_timestamp  null,
    constraint ElonBuys_pk
        primary key (id)
);


-- RELATION --
-- Book to Genre --
alter table ElonBooks
    add constraint ElonBooks_ElonGenres_id_fk
        foreign key (genre_id) references ElonGenres (id)
            on update cascade on delete set null;


-- Buy to Book --
alter table ElonBuys
    add constraint ElonBuys_ElonBooks_isbn_fk
        foreign key (isbn) references ElonBooks (isbn)
            on update cascade on delete cascade;

-- Buy to User --
alter table ElonBuys
    add constraint ElonBuys_ElonUsers_user_id_fk
        foreign key (user_id) references ElonUsers (user_id)
            on update cascade on delete set null;

