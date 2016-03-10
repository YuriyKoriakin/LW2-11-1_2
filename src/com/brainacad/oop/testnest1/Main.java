package com.brainacad.oop.testnest1;

/**
 * Created by Yuriy on 09.03.2016.
 */
public class Main {
    public static void main(String[] args) {
MyPhoneBook phoneBook=new MyPhoneBook();
        phoneBook.addPhoneNumber("user1","123");
        phoneBook.addPhoneNumber("user2","124");
        phoneBook.addPhoneNumber("user3","125");
        phoneBook.addPhoneNumber("user4","126");
        phoneBook.addPhoneNumber("user5","127");
        phoneBook.printPhonebook();
    }
   }
