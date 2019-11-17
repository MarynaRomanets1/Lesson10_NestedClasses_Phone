package com.epam.practice10_homework;

public class Main {

    public static void main(String[] args) {
        MyPhone myPhoneInfo = new MyPhone();
        MyPhone.MyPhoneBook myBook = myPhoneInfo.new MyPhoneBook();

        myBook.addPhoneNumber("Peter", "0661234567");
        myBook.addPhoneNumber("Ivan", "0681456721");
        myBook.addPhoneNumber("Nina", "0967654321");
        myBook.addPhoneNumber("Taras", "0737162534");
        myBook.addPhoneNumber("Liudmila", "0559865321");
        myBook.addPhoneNumber("Mila", "0968854319");
        myBook.addPhoneNumber("Sergiy", "0981425348");
        myBook.addPhoneNumber("Alexa", "0852986351");
        myBook.addPhoneNumber("Misha", "0531234567");
        myBook.addPhoneNumber("Boris", "0752583697");

        myBook.printPhoneBook();
        System.out.println();

        System.out.println("----------Sort by name------------");
        MyPhone.MyPhoneBook.PhoneRecord[] myRecords = myBook.sortByName();
        for (MyPhone.MyPhoneBook.PhoneRecord elem : myRecords) {
            System.out.println(elem);
        }
        System.out.println();

        System.out.println("----------Sort by phone number");
        myRecords = myBook.sortByPhoneNumber();
        for (MyPhone.MyPhoneBook.PhoneRecord elem : myRecords) {
            System.out.println(elem);
        }
        System.out.println();

        Runner element = new Runner();
        element.run(myBook);
    }
}
