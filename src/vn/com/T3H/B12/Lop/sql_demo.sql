create database qunlynhansu;

use qunlynhansu;

create table nhanvien(
                         id integer primary key,
                         manv varchar(50),
                         ho_ten nvarchar(50),
                         ngay_sinh date,
                         phongban varchar(50),
                         luong decimal
);

insert into nhanvien (id, manv, ho_ten, ngay_sinh, phongban, luong)
values
    ('1','NV001','Nguyễn văn A','1999-02-15','Kinh doanh','10000000'),
    ('2','NV002','Lê Thị B','2001-4-30','Kỹ thuật','15000000'),
    ('3','NV003','Đào Duy T','2003-03-20','Kinh doanh','12000000'),
    ('4','NV004','NGuyễn Thị D','1992-07-19','Kỹ thuật','18000000'),
    ('5','NV005','Đinh linh M','2005-09-20','Hành chính','8000000');

update nhanvien
set
    ho_ten = 'Trần Minh Hiếu'
where id = 3;

select * from nhanvien where phongban like '%Kỹ thuật%';

select * from nhanvien where luong > 10000000;

select * from nhanvien where ho_ten like '%Minh%';

select count(manv),phongban from nhanvien group by phongban having count(manv) > 1;

select * from nhanvien where phongban like '%Kinh doanh%' and luong > 11000000;

select * from nhanvien where id = 2 or phongban like '&Hành chính&';

select sum(luong) from nhanvien where phongban like '%Kỹ thuật%';