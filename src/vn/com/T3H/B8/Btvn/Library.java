package vn.com.T3H.B8.Btvn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library implements ILibrary
{
    ArrayList<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book)
    {
            books.add(book);
            System.out.println("Sách " + book.getTitle() + " được thêm vào thư viện");
    }

    @Override
    public void updateBook(int id, Book book)
    {
        for ( int i = 0; i < books.size(); i++ )
        {
            if (books.get(i).getId() == id )
            {
                books.set(i, book);
                return;
            }
        }
        System.out.println("Sách có mã " + book.getId() + " được cập nhật thông tin");
    }

    @Override
    public void deleteBook(int  id)
    {
        int  idx = -1;

        for ( int i = 0; i < books.size(); i++ )
        {
            if (books.get(i).getId() == id)
            {
                idx = i;
                break;
            }
        }

        if (idx != -1)
        {
            for (int i = idx; i < books.size() - 1; i++)
            {
                books.set(i, books.get(i+1));
            }
            books.remove(books.size()-1);
            System.out.println("Sách có mã " + id + " đã được xóa.");
        }else{
            System.out.println("Không tìm thấy sách có mã " + id + ".");
        }
    }

    @Override
    public void displayAllBooks()
    {
        System.out.println("Thông tin của sách trong thư vện: ");
        for (Book book : books)
        {
            book.dispalyInfo();
        }
    }

    @Override
    public void searchByAuthor(String author)
    {
        boolean flag = false;
        for (Book book : books)
        {
            if (book.getAuthor().equals(author) )
            {
                book.dispalyInfo();
                flag = true;
            }
        }
        if (!flag)
        {
            System.out.println("Không tm thấy tác giả cần tìm!");
        }
    }
}
