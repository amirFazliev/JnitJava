package org.example;

import java.util.*;

public class PhoneBook {
    private Map<String, Contact> map = new HashMap<>();


    public void addPhoneBook(String number, Contact contact) {
        map.put(number, contact);
    }

    // Поиск контакта по номеру
    public Contact seachContactNumber(String number) {
        return map.get(number);
    }

    // проверка на null
    public String testInNull (Contact contact) {
        return (contact.getName() == null) ? contact.getNumberPhone() : contact.getName();
    }
}

