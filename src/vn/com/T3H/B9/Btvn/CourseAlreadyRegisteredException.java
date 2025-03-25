package vn.com.T3H.B9.Btvn;

public class CourseAlreadyRegisteredException extends Exception
{
    private String tenKhoaHoc;

    public CourseAlreadyRegisteredException(String tenKhoaHoc, String message)
    {
        super(message);
        this.tenKhoaHoc = tenKhoaHoc;
    }

    public String getTenKhoaHoc() {
        return tenKhoaHoc;
    }

    public void setTenKhoaHoc(String tenKhoaHoc) {
        this.tenKhoaHoc = tenKhoaHoc;
    }
}
