package com.lesson10.praticeassignment2;

public class LibraryInterfaceDemo {
    public static void main(String args[]){

        System.out.println("KidUser try with with age 10 , Book type - Kids: ");
        LibraryUser kidUser1 = new KidUser(10,BookType.KIDS.getName());
        kidUser1.registerAccount();
        kidUser1.requestBook();
        System.out.println();

        System.out.println("KidUser try with with age 18 , Book type - Fiction: ");
        LibraryUser kidUser2 = new KidUser(18,BookType.FICTION.getName());
        kidUser2.registerAccount();
        kidUser2.requestBook();
        System.out.println();

        System.out.println("AdultUser try with with age 5 , Book type - Kids: ");
        LibraryUser adultUser1 = new AdultUser(5,BookType.KIDS.getName());
        adultUser1.registerAccount();
        adultUser1.requestBook();
        System.out.println();

        System.out.println("AdultUser try with with age 23 , Book type - Fiction: ");
        LibraryUser adultUser2 = new AdultUser(23,BookType.FICTION.getName());
        adultUser2.registerAccount();
        adultUser2.requestBook();
        System.out.println();

    }
}
