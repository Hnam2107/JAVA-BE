package vn.com.T3H.B8.Btvn;

public interface ILibrary
{
    public void addBook(Book book); // Thêm một cuốn sách vào thư viện

    public void updateBook(int id, Book book); // Cập nhật thông tin sách dựa trên ID

    public void deleteBook(int  id); // Xóa sách theo mã ID

    public void searchByAuthor(String author); //Tìm kiếm sách theo tác giả

    public void displayAllBooks(); // Hiện thị tất cả sách trong thư viện

}
