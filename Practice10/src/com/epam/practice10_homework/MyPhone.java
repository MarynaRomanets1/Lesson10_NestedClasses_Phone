package com.epam.practice10_homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MyPhone {
    MyPhoneBook phonebook;
    final static int MAX = 10;

    public MyPhone() {
        this.phonebook = phonebook;
    }

    class MyPhoneBook {
        //----class MyPhoneBook--------------------------------------

         class PhoneRecord {
            //----class PhoneRecord---------------------------------------
            private String name;
            private String phone;

            public String getName() {
                return name;
            }
            public void setName(String name) {
                this.name = name;
            }
            public String getPhone() {
                return phone;
            }
            public void setPhone(String phone) {
                this.phone = phone;
            }

            @Override
            public String toString() {
                return "Record: " +
                        "name=" + name +
                        ", phone=" + phone;
            }

            public PhoneRecord(String name, String phone) {
                this.name = name;
                this.phone = phone;
            }
            //----end of class PhoneRecord-------------------------------
        }

        private PhoneRecord[] records = new PhoneRecord[MAX];
        private int counter = 0;

        public void addPhoneNumber(String name,
                                   String phone) {
            PhoneRecord temp = new PhoneRecord(name, phone);
            if (counter != records.length) {
                records[counter++] = temp;
            }
        }

        public void printPhoneBook() {
            for (int i = 0; i < counter; i++) {
                System.out.println(records[i]);
            }
        }

        public void printCallTo(int yourNumber) {
            System.out.println(records[yourNumber-1]);
        }

        public PhoneRecord[] sortByName() {
            PhoneRecord[] newRecords = Arrays.copyOf(records, counter);
            Arrays.sort(newRecords, new Comparator<PhoneRecord>() {
                @Override
                public int compare(PhoneRecord o1, PhoneRecord o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
            return newRecords;
        }

        public PhoneRecord[] sortByPhoneNumber() {
            PhoneRecord[] newRecords = Arrays.copyOf(records, counter);
            Arrays.sort(newRecords, new Comparator<PhoneRecord>() {
                @Override
                public int compare(PhoneRecord o1, PhoneRecord o2) {
                    return o1.getPhone().compareTo(o2.getPhone());
                }
            });
            return newRecords;
        }
        //----end of class MyPhoneBook--------------------------
    }

    public void switchOn(MyPhone.MyPhoneBook item) {
        System.out.println("Loading PhoneBook records... ");
        item.printPhoneBook();
        System.out.println("Loading is complete");
        System.out.println();
    }

    public void call(MyPhone.MyPhoneBook item, int yourNumber) {
        System.out.println();
        System.out.println("Calling to...");
        item.printCallTo(yourNumber);
    }

    public static int getYourNumber() {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        System.out.println("Please, enter number for searching from 1 to 10: ");
        while (true) {
            size = sc.nextInt();
            if ((size < 1)||(size > 10)) {
                System.out.println("Wrong number, please enter number from 1 to 10");
            } else {
                return size;
            }
        }
    }


}
