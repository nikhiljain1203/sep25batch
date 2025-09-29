package org.example.labsession1;

public class Client {
    public static void main(String[] args) {
        LibraryMangementSystem lms = new LibraryMangementSystem();

        Member member = new Member("Ayush", "M001");
        Librarian librarian = new Librarian("Rohit", "L001", "1");

        lms.registerUser(member);
        lms.registerUser(librarian);

        TextBook textBook =
                new TextBook("ISBN1", "Java Programming", "Author A", "Education", 1);
        NovelBook novelBook =
                new NovelBook("ISBN2", "Mystery of the Old House", "Author B", "Fiction");

        lms.addBook(textBook);
        lms.addBook(novelBook);

        System.out.println("Library Management System initialized successfully.");

        textBook.lend(member);

        System.out.println("Debug");

        textBook.returnBook(member);

        System.out.println("Debug");
    }
}
