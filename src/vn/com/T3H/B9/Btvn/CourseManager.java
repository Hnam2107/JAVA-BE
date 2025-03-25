package vn.com.T3H.B9.Btvn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CourseManager
{
    private Student[] students;
    private int soHocVienTrongHeThong;

    public CourseManager()
    {
        this.students = new Student[10];
        this.soHocVienTrongHeThong = 0;
    }

    public void themHocVien(Student student)
    {
        if (this.soHocVienTrongHeThong != this.students.length -1){
            return;
        }
        Student[] newStudents = new Student[this.students.length * 2];
        for (int i = 0; i < this.students.length; i++){
            newStudents[i] = this.students[i];
        }
        this.students = newStudents;
        this.students[this.soHocVienTrongHeThong] = student;
        this.soHocVienTrongHeThong++;
    }

    public void dangKyMon(Student student)
    {
        System.out.println("Nhập môn học đăng ký: ");
        String tenKhoaHoc = new Scanner(System.in).nextLine();
        try{
            student.dangKyKhoaHoc(tenKhoaHoc);
            System.out.println("Dăng ký môn " + tenKhoaHoc + " thành công! ");
        }catch (CourseAlreadyRegisteredException | IllegalArgumentException e)
        {
            System.out.println("Lỗi: " + e.getMessage());
        }finally{
            System.out.println("Hoàn thành dăng ký môn học! ");
        }

    }
}
