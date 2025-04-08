create database QL_SINHVIEN;

use QL_SINHVIEN;

create table SinhVien(
                         id int auto_increment primary key,
                         ho_ten varchar(50) NOT NULL ,
                         ngay_sinh date,
                         gioi_tinh varchar(4),
                         dia_chi varchar(50),
                         email varchar(50) UNIQUE ,
                         diem_trung_binh decimal
);

create table MonHoc(
                       id_mon int primary key,
                       ten_mon nvarchar(50),
                       so_tin_chi int
);

create table DiemThi(
                        id_diem int primary key,
                        id_sinhvien int,
                        id_mon int,
                        diem decimal
);

alter table DiemThi
    add foreign key (id_sinhvien) references SinhVien(id),
add foreign key (id_mon) references MonHoc(id_mon);

insert into SinhVien (id, ho_ten, ngay_sinh, gioi_tinh, dia_chi, email, diem_trung_binh)
values
    ('1','Nguyen Van A', '2002-05-12', 'Nam', 'Hanoi', 'a@gmail.com', 7.80),
    ('2','Tran Thi B', '2001-09-20', 'Nữ', 'Danang', 'b@yahoo.com', 8.40),
    ('3','Le Van C', '2003-01-15', 'Nam', 'Hue', 'c@gmail.com', 6.90),
    ('4','Pham Thi D', '2002-03-25', 'Nữ', 'HCM', 'd@hotmail.com', 5.60),
    ('5','Hoang Van E', '2000-12-10', 'Nam', 'Can Tho', 'e@gmail.com', 9.10);

insert into MonHoc (id_mon, ten_mon, so_tin_chi)
VALUES
    ('1','Toan Cao Cap', 3),
    ('2','Lap Trinh Java', 4),
    ('3','Co So Du Lieu', 3);

insert into DiemThi (id_diem, id_sinhvien, id_mon, diem)
VALUES
    (1, 1,'1', 7.5),
    (2, 2,'2', 8.0),
    (3, 1,'3', 9.0),
    (4, 3,'3', 8.2),
    (5, 2,'2', 6.5),
    (6, 3,'1', 4.0),
    (7, 1,'2', 9.5),
    (8, 2,'2', 8.5),
    (9, 3,'1', 9.0);

update SinhVien
set
    diem_trung_binh = 9.0
where id = 1;

update DiemThi
set
    diem = 10
where id_diem = 2;

select * from SinhVien;

select * from MonHoc;

select s.ho_ten, m.ten_mon, d.Diem
from DiemThi d
         join MonHoc m on d.id_mon = m.id_mon
         join SinhVien s on d.id_SinhVien = s.id;

select * from SinhVien where diem_trung_binh > 8;

select distinct MH.ten_mon, diem
from DiemThi d
         join MonHoc MH on d.id_mon = MH.id_mon
where d.diem < 5.0;

select count(id_sinhvien) as so_luong_sinh_vien
from DiemThi
where diem > 6.0;

select * from SinhVien where diem_trung_binh between 7.0 and 8.5 and gioi_tinh = 'Nam';

select * from SinhVien where email like '%gmail.com%' or email like '%yahoo.com%';

select s.*
from SinhVien s
         join DiemThi d on s.id = d.id_sinhvien
where s.diem_trung_binh >6.5 and d.diem < 5.0;

select MH.ten_mon, count(d.id_sinhvien) as so_sinh_vien
from DiemThi d
         join MonHoc MH on d.id_mon = MH.id_mon
where d.diem > 6.0
group by MH.id_mon;

select MH.ten_mon, count(d.id_sinhvien) as so_sinh_vien_thi_lai
from DiemThi d
         join MonHoc MH on d.id_mon = MH.id_mon
where d.diem < 5.0
group by MH.id_mon;