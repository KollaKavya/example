package pack_16072022;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookMethod implements BookInter{
    List<Book_det> bookDetails=new ArrayList<Book_det>();


    @Override
    public void add(Book_det book) {
        bookDetails.add(book);
        for(Book_det j:bookDetails) {
            System.out.println(j.toString());
        }
    }

    @Override
    public void delete(int del) {
        int f=0;
        for(Book_det j:bookDetails){
            if(j.getId()==del) {
                bookDetails.remove(j);
                f=1;
                break;
            }
        }
        if(f==0){
            System.out.println("BookId not found");
        }
    }

    @Override
    public void display() {
        Iterator z=bookDetails.iterator();
        while(z.hasNext()){
            System.out.println(z.next().toString());
        }

    }
}
