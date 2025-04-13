create database web_ban_do;

use web_ban_do;

-- Thông tin công ty
create table companyinfo(
                            id int PRIMARY KEY AUTO_INCREMENT,
                            ten nvarchar(50) NOT NULL ,
                            dia_chi nvarchar(100),
                            phone varchar(15) UNIQUE
);

-- Thông tin mạng xã hội
create table social(
                       id int PRIMARY KEY AUTO_INCREMENT,
                       id_company_info int,
                       id_branch int,
                       ten nvarchar(100) NOT NULL,
                       link varchar(100) UNIQUE
);

-- Thông tin chi nhánh
create table branch(
                       id int PRIMARY KEY AUTO_INCREMENT,
                       ten nvarchar(100) NOT NULL,
                       dia_chi nvarchar(100),
                       email varchar(50) UNIQUE ,
                       phone varchar(15) UNIQUE
);

-- Thông tin loại sản phẩm
create table category(
                         id int PRIMARY KEY AUTO_INCREMENT,
                         id_branch int,
                         ten nvarchar(100) NOT NULL ,
                         category_parent nvarchar(100)
);

-- Thông tin sản phẩm
create table production(
                           id int PRIMARY KEY AUTO_INCREMENT,
                           id_category int,
                           ten nvarchar(100) NOT NULL ,
                           mo_ta nvarchar(255),
                           gia double,
                           tong_soLuong int
);

-- Thông tin sản xuất chi tiết
create table production_detail(
                                  id int PRIMARY KEY AUTO_INCREMENT,
                                  id_production int,
                                  so_luong int
);

-- Thông tin ảnh
create table image(
                      id int PRIMARY KEY AUTO_INCREMENT,
                      id_production_detail int,
                      path varchar(100),
                      extension varchar(100)
);

-- Thông tin kích thước
create table size(
                     id int PRIMARY KEY AUTO_INCREMENT,
                     id_production_detail int,
                     ma varchar(50),
                     ten nvarchar(100) NOT NULL,
                     type varchar(15)
);

-- Thông tin màu sắc
create table color(
                      id int PRIMARY KEY AUTO_INCREMENT,
                      id_production_detail int,
                      ma varchar(50),
                      ten nvarchar(100)
);

alter table social
    add foreign key (id_company_info) references companyinfo(id),
    add foreign key (id_branch) references branch(id);

alter table category
    add foreign key (id_branch) references branch(id);

alter table production
    add foreign key (id_category) references category(id);

alter table production_detail
    add foreign key (id_production) references production(id);

alter table image
    add foreign key (id_production_detail) references production_detail(id);

alter table color
    add foreign key (id_production_detail) references production_detail(id);

alter table size
    add foreign key (id_production_detail) references production_detail(id);
