package vn.com.T3H.B8.Btvn;

import java.util.Scanner;

public class QuanLyThuVien {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new BusinessBook(1, "Khởi nghiệp tinh gọn", 2011, "Eric Ries", "Khởi nghiệp"));
        library.addBook(new ScienceBook(2, "Lược sử thời gian", 1988, "Stephen Hawking", "Vũ trụ học"));
        int choice;
        do {
            System.out.println("\n ------ Quản lý thư viện ------");
            System.out.println("1. Thêm sách");
            System.out.println("2. Cập nhật sách");
            System.out.println("3. Xóa sách");
            System.out.println("4. Tìm kiếm sách theo tác giả");
            System.out.println("5. Hiển thị tất cả sách");
            System.out.println("0. Dừng chương trình");
            System.out.println(" Mời bn chọn: ");
            choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập số sách cần thêm: ");
                    int n = new Scanner(System.in).nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Chọn loại sách: ");
                        System.out.println("1. Kinh doanh");
                        System.out.println("2. Khoa học");
                        int id = new Scanner(System.in).nextInt();
                        Book book = null;
                        if (id == 1) {
                            book = new BusinessBook();
                        }else if (id == 2) {
                            book = new ScienceBook();
                        }else {
                            System.out.println("Lựa chọn không hơp lệ!");
                        }
                        book.intputInfo();
                        library.addBook(book);
                    }
                    break;
                case 2:
                    System.out.println("Nhập sách cần cập nhật: ");
                    int  id = new Scanner(System.in).nextInt();
                    System.out.println("Chọn loại sách: ");
                    System.out.println("1. Kinh doanh");
                    System.out.println("2. Khoa học");
                    int id2 = new Scanner(System.in).nextInt();
                    Book book = null;
                    if (id2 == 1) {
                        book = new BusinessBook();
                    }else if (id2 == 2) {
                        book = new ScienceBook();
                    }else {
                        System.out.println("Lựa chọn không hơp lệ!");
                    }
                    book.intputInfo();
                    library.updateBook(id, book);
                    break;
                case 3:
                    System.out.println("Nhập mã sách cần xóa: ");
                     id = new Scanner(System.in).nextInt();
                     library.deleteBook(id);
                    break;
                case 4:
                    System.out.println("Nhập tên tác giả: ");
                    String author = new Scanner(System.in).nextLine();
                    library.searchByAuthor(author);
                    break;
                case 5:
                    library.displayAllBooks();
                    break;
                case 0:
                    System.exit(choice);
                    break;
            }
        } while (choice != 0);
    }
}
