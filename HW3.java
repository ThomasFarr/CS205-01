package edu.monmouth.HW3;

import java.io.*;
import java.util.*;

import edu.monmouth.book.Book;
import edu.monmouth.book.BookException;
import edu.monmouth.book.BookTypes;
import edu.monmouth.book.BookConstants;


public class HW3 {
    public static void main(String[] args) {
    	String stringFileName = "string.txt";
        String bookFileName = "books.txt";

        try {
            System.setOut(new PrintStream(new FileOutputStream(args[0])));
            System.setErr(new PrintStream(new FileOutputStream(args[0])));
        } catch (FileNotFoundException e) {
            System.err.println("File(s) not found.");
            e.printStackTrace();
            return;
        }

        List<String> stringArrayList = new ArrayList<>();
        List<String> stringLinkedList = new LinkedList<>();

        try (BufferedReader stringReader = new BufferedReader(new FileReader(stringFileName))) {
            String line;
            while ((line = stringReader.readLine()) != null) {
                stringArrayList.add(line);
                stringLinkedList.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading string file: " + stringFileName);
            e.printStackTrace();
            return;
        }

        List<Book> bookArrayList = new ArrayList<>();
        List<Book> bookLinkedList = new LinkedList<>();

        try (BufferedReader bookReader = new BufferedReader(new FileReader(bookFileName))) {
            String line;
            while ((line = bookReader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    String title;
                    BookTypes bookType;
                    int numberOfPages, publicationYear;
                    double price;
               
                    if (parts[0]!="" && parts[1]!="" && parts[2]!="" && parts[3]!="" && parts[4]!="") {
                    	title = parts[0];
                    	bookType = BookTypes.valueOf(parts[1]);
                    	numberOfPages = Integer.parseInt(parts[2]);
                    	price = Double.parseDouble(parts[3]);
                    	publicationYear = Integer.parseInt(parts[4]);
                    	
                    	try {
                    		Book book = new Book(title, bookType, numberOfPages, price, publicationYear );
                    		bookArrayList.add(book);
                            bookLinkedList.add(book);
                    	} catch(BookException e) {
                    		e.printStackTrace();
                    	}
                    	
                    }
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error reading book file: " + bookFileName);
            e.printStackTrace();
            return;
        }
        
        if (args.length != 3) {
            System.err.println("Usage: java edu.monmouth.HW3 <HW3Output.txt> <string.txt> <book.txt>");
            return;
        }

        System.out.println("Using ArrayList method: ");
        
        System.out.println("Is stringArrayList empty? " + stringArrayList.isEmpty());
        if (!bookArrayList.isEmpty()) {
            Book removedBook = bookArrayList.remove(0);
            System.out.println("Removed book: " + removedBook);
        }
        
        System.out.println("Size of bookArrayList: " + bookArrayList.size());
        
        System.out.println("add: ");
        try {
			bookArrayList.add(new Book("The Hobbit",BookTypes.HARDBACK,212,32.50,1948));
		} catch (BookException e) {
			e.printStackTrace();
		}
        
        Iterator<Book> iterator = bookArrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("");

        
        System.out.println("iterate forward: ");
        ListIterator<Book> listIterator = bookArrayList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("");

        
        System.out.println("iterate reverse: ");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        
        System.out.println("");

        System.out.println("Using LinkedList methods");
        
        try {
			bookLinkedList.add(new Book("The Hobbit",BookTypes.HARDBACK,212,32.50,1948));
		} catch (BookException e) {
			e.printStackTrace();
		}

        System.out.println("iterate forward: ");
        ListIterator<Book> linkedListIterator = bookLinkedList.listIterator();
        while (linkedListIterator.hasNext()) {
            System.out.println(linkedListIterator.next());
        }
        System.out.println("");

        
        System.out.println("iterate reverse: ");
        while (linkedListIterator.hasPrevious()) {
            System.out.println(linkedListIterator.previous());
        }
        System.out.println("");

        System.out.println("Iterator: ");
        Iterator<Book> linkedListIterator2 = bookLinkedList.iterator();
        while (linkedListIterator2.hasNext()) {
            System.out.println(linkedListIterator2.next());
        }
        System.out.println("");

        System.out.println("Contains: ");
        Book book1 = null;
        Book book2 = null;
		try {
			book1 = new Book("The Hobbit",BookTypes.HARDBACK,212,32.50,1948);
			book2 = new Book("Harry Potter and the Goblet of Fire",BookTypes.ELECTRONIC,-9,19.99,1996);
		} catch (BookException e) {
			e.printStackTrace();
		}
        System.out.println("Does bookLinkedList contain book1? " + bookLinkedList.contains(book1));
        System.out.println("Does bookLinkedList contain book2? " + bookLinkedList.contains(book2));
        System.out.println("");

        System.out.println("remove: ");
        boolean removed1 = bookLinkedList.remove(book1);
        System.out.println("Removed book1: " + removed1);
        boolean removed2 = bookLinkedList.remove(book2);
        System.out.println("Removed book2: " + removed2);
    }
}

