package org.example;

//todo Домашнее задание к занятию 4.5. Коллекции TreeMap и TreeSet  - Пропущенные звонки
import java.time.LocalDateTime;

class Main {

    public static void main(String[] args) {
        MissedCalls missedCalls =  new MissedCalls(); // Map<LocalDateTime, String>
        PhoneBook phoneBook = new PhoneBook(); // Map<String, Contact> map

        LocalDateTime call1 = LocalDateTime.of(2022, 1, 15, 14, 55, 15);
        LocalDateTime call2 = LocalDateTime.of(2022, 2, 7, 13, 35, 25);
        LocalDateTime call3 = LocalDateTime.of(2022, 3, 17, 19, 45, 50);
        LocalDateTime call4 = LocalDateTime.of(2022, 4, 27, 10, 15, 45);
        LocalDateTime call5 = LocalDateTime.now();

        Contact contact1 = new Contact("Amir", "79996");
        Contact contact2 = new Contact("Ruslan", "74454");
        Contact contact3 = new Contact("Vova", "73433");
        Contact contact4 = new Contact("Boris", "79991");
        Contact contact5 = new Contact(null, "89878");

        phoneBook.addPhoneBook(contact1.getNumberPhone(),contact1);
        phoneBook.addPhoneBook(contact2.getNumberPhone(),contact2);
        phoneBook.addPhoneBook(contact3.getNumberPhone(),contact3);
        phoneBook.addPhoneBook(contact4.getNumberPhone(),contact4);
        phoneBook.addPhoneBook(contact5.getNumberPhone(),contact5);

        missedCalls.addCalls(call1, contact1.getNumberPhone());
        missedCalls.addCalls(call2, contact2.getNumberPhone());
        missedCalls.addCalls(call3, contact3.getNumberPhone());
        missedCalls.addCalls(call4, contact4.getNumberPhone());
        missedCalls.addCalls(call5, contact5.getNumberPhone());

        missedCalls.missedCallsPhone(phoneBook);
    }
}

