package ListAndArray;

import java.util.ArrayList;
import java.util.Arrays;

public class MobilePhone {
    private static ArrayList<Contacts> contactList = new ArrayList<Contacts>();

    public boolean addNewContact(Contacts contact) {
        if (queryContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        contactList.add(contact);
        return true;
    }

    //store
    public static void storeContact(Contacts contact) {
        if (contactList.indexOf(contact) < 0) {
            contactList.add(contact);
        }
    }

    public boolean modifyContact(Contacts originalContact, Contacts updatedContact) {
        int foundPosition = queryContact(originalContact);
        if (foundPosition < 0) {
            System.out.println(originalContact.getName() + " was not found.");
            return false;
        }
        contactList.set(foundPosition, updatedContact);
        System.out.println(originalContact.getName() + " was replaced with " + updatedContact.getName());
        return true;
    }

    public static boolean removeContact(Contacts contact) {
        if (contactList.indexOf(contact) >= 0) {
            contactList.remove(contact);
            System.out.println(contact.getName() + " is deleted");
            return true;
        }
        System.out.println(contact.getName() + " was not found.");
        return false;
    }

    private static int queryContact(Contacts contact) {
        return contactList.indexOf(contact);
    }

    private static int queryContact(String contactName) {
        for (int i = 0; i < contactList.size(); i++) {
            Contacts contact = contactList.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String findContact(Contacts contact) {
        if (queryContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public void printContacts() {
        System.out.println("contact list");
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println((i+1) + "." + this.contactList.get(i).getName() + "->" + this.contactList.get(i).getPhoneNum());
        }
    }

}
