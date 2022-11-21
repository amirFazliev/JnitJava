package org.example;

public class Contact {
    private String name;
    private String numberPhone;

    public Contact (String name, String numberPhone) {
        this.name = name;
        this.numberPhone = numberPhone;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " - " + numberPhone;
    }

    @Override
    public int hashCode() {
        return numberPhone.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Contact infoContact = (Contact) obj;
        return numberPhone.equals(infoContact.getNumberPhone());
    }
}
