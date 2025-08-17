package btvn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Publisher publisher1 = new Publisher("Nhà Xuất Bản Trẻ", "Việt Nam");
        Publisher publisher2 = new Publisher("Oxford University Press", "UK");

        Book book1 = new Book("Dế Mèn Phiêu Lưu Ký", "Tô Hoài", 5.99, publisher1);
        Book book2 = new Book("Oxford English Dictionary", "Oxford Team", 25.50, publisher2);
        Book book3 = new Book("Tắt Đèn", "Ngô Tất Tố", 7.49);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n---- MENU ------");
            System.out.println("1. Them sach");
            System.out.println("2. In tat ca sach");
            System.out.println("3. Tim kiem sach theo tac gia");
            System.out.println("4. Xoa sach theo bookId");
            System.out.println("5. Thoat");
            System.out.print("Nhap lua chon: ");
            choice = sc.nextInt();
            sc.nextLine(); // bỏ dòng trống sau nextInt

            switch (choice) {
                case 1: {
                    System.out.print("Nhap so luong sach can them: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("\n--- Nhap sach thu " + (i + 1) + " ---");
                        System.out.print("Nhap title: ");
                        String title = sc.nextLine();
                        System.out.print("Nhap author: ");
                        String author = sc.nextLine();
                        System.out.print("Nhap price: ");
                        double price = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Nhap 1 neu co nha xuat ban, 0 neu khong: ");
                        int check = sc.nextInt();
                        sc.nextLine();

                        if (check == 1) {
                            System.out.print("Nhap ten nha xuat ban: ");
                            String name = sc.nextLine();
                            System.out.print("Nhap dia chi: ");
                            String address = sc.nextLine();
                            Publisher publisher = new Publisher(name, address);
                            library.addBook(new Book(title, author, price, publisher));
                        } else {
                            library.addBook(new Book(title, author, price));
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.print("Ban co muon hien thi nha xuat ban? (1=co, 2=khong): ");
                    int check = sc.nextInt();
                    sc.nextLine();
                    boolean showPublisher = (check == 1);
                    library.displayAllBooks(showPublisher);
                    break;
                }
                case 3: {
                    System.out.print("Nhap ten tac gia can tim: ");
                    String name = sc.nextLine();
                    library.searchByAuthor(name);
                    break;
                }
                case 4: {
                    System.out.print("Nhap bookId can xoa: ");
                    int id = sc.nextInt();
                    library.removeBookById(id);
                    break;
                }
                case 5: {
                    System.out.println("Thoat chuong trinh...");
                    break;
                }
                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (choice != 5);

        sc.close();
    }
}

