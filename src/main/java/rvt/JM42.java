package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class JM42 {
    public static void main(String[] args) {
        ArrayList<Book> book = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        
        while(true){
            System.out.print("Title: ");
            String name = reader.nextLine();
            if(name.equals("")){
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.parseInt(reader.nextLine());
            System.out.print("Publication year: ");
            int pubYear = Integer.parseInt(reader.nextLine());
            
            book.add(new Book(name, pages, pubYear));
        }
        
        System.out.print("What information will be printed? ");
        String info = reader.nextLine();
        for(Book b: book){
            if(info.equals("everything")){
                System.out.println(b.getName() + ", " + b.getPages() + " pages, " + b.getPubYear());
            }
            else if(info.equals("names")){
                System.out.println(b.getName());
            }
        }
    }
    
    public static class Book{
        private String name;
        private int pages;
        private int pubYear;
        
        public Book(String name, int pages, int pubYear) {
            this.name = name;
            this.pages = pages;
            this.pubYear = pubYear;
        }
        
        public String getName() {
            return name;
        }
        
        public int getPages() {
            return pages;
        }
        
        public int getPubYear() {
            return pubYear;
        }
    }
}
