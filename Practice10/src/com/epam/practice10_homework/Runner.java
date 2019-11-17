package com.epam.practice10_homework;

public class Runner {

    public void run(MyPhone.MyPhoneBook myBook) {
        MyPhone myPhoneInfo = new MyPhone();
        myPhoneInfo.switchOn(myBook);
        myPhoneInfo.call(myBook, myPhoneInfo.getYourNumber());
    }
}
