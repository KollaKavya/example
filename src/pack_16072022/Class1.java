package pack_16072022;

import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        System.out.println("***BOOL MANAGEMENT SYSTEM***");
        Scanner k = new Scanner(System.in);
        BookInter b=new BookMethod();
        int opt = 0;
        do {
            menu();
            opt = k.nextInt();
            switch (opt) {
                case 1:
                    Book_det book = new Book_det();
                    System.out.println("Enter the Book ID: ");
                    int id = k.nextInt();
                    System.out.println("Enter Book Name: ");
                    String name = k.next();
                    System.out.println("Enter the Cost of the book: ");
                    float cost = k.nextFloat();
                    System.out.println("Enter the Genre of the Book: ");
                    String genre = k.next();
                    System.out.println("Enter the Selling Count of Book: ");
                    int sell = k.nextInt();
                    book = new Book_det(id, name, genre, cost, sell);
                    b.add(book);
                    break;
                case 2:
                    System.out.println("Enter the BookID to be Deleted: ");
                    int del=k.nextInt();
                    b.delete(del);
                    break;
                case 3:
                    System.out.println("Available Book Details");
                    b.display();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }

        }
        while (opt > 0 && opt < 6);
    }
    public static void menu(){
        System.out.println("1: Add a Book\n2: Delete a Book\n3: Display all Book Details\n4: exit");
    }

}
