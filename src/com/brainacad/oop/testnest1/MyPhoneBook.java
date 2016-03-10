package com.brainacad.oop.testnest1;

/**
 * Created by Yuriy on 09.03.2016.
 */
public class MyPhoneBook {
    private PhoneNumber[]phoneNumbers=new PhoneNumber[10]; //створюємо масив в головному класі довжиною 10
    private int arrayIndex=0;
    public void addPhoneNumber(String name,String phone){//створюємо метод
        PhoneNumber phoneNumber=new PhoneNumber(name,phone);//створюємо обєкт
        phoneNumbers[arrayIndex]=phoneNumber;
        arrayIndex++; //створюємо новий обєкт і записуємо новому індексу
    }
    public void printPhonebook(){//ствоорюємо метод для виводу телефонної книги на екран
        for(PhoneNumber phoneNumber:phoneNumbers){
            System.out.println(phoneNumber);//ми здійснили перевизначення методу тому буде видавати номери в правильному форматі
        }

    }

    static class PhoneNumber {//створили вкладений клас
        private String name;
        private String phone;

        public PhoneNumber(String name, String phone) {//constructors
            this.name = name;
            this.phone = phone;
        }

        public String getName() {//getters
            return name;
        }

        public String getPhone() {
            return phone;
        }

        @Override
        public String toString() {//переписуємо метод тустрінг
            return "name:" + name + "," + phone;
        }
    }
}
