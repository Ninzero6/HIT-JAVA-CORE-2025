package btvn;

import java.util.ArrayList;
import java.util.Locale;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void displayAllBooks(boolean showPublisher){
        if(showPublisher){
            for(Book book : books){
                book.displayInfo(showPublisher);
            }
        }
    }

    public void searchByAuthor(String author){
        String word=author.toLowerCase();
        boolean found=false;
        for(Book book: books){
            String authorName=book.getAuthor().toLowerCase();
            if(authorName.contains(word)){
                book.displayInfo(true);
                found=true;
            }
        }
        if (!found){
            System.out.println("Khong tim thay sach cua tac gia: " + author);
        }
    }

    public void removeBookById(int bookId){
        boolean found=false;
        for(int i=0;i<books.size();i++){
            if(books.get(i).getBookId()==bookId){
                books.remove(i);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Khong tim thay bookid");
    }
}
}