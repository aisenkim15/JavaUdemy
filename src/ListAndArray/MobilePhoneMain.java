package ListAndArray;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.Scanner;

public class MobilePhoneMain {

    private static MobilePhone newPhone = new MobilePhone();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        options();
        while (!quit) {
            System.out.println("Enter your Menu choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    options();
                    break;
                case 1:
                    quit = true;
                    break;
                case 2:
                    newPhone.printContacts();
                    break;
                case 3:
                    addNewContact();
                    break;
                case 4:
                   updateContact();
                   break;
                case 5:
                    removeContact();
                    break;
                case 6:
                    queryContact();
                    break;
            }

        }
    }

    public static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = newPhone.findContact(name);
        if (existingContactRecord == null) {
            System.out.println("contact not found");
            return;
        }
        if (newPhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Failed to delete");
        }
    }

    public static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = newPhone.findContact(name);
        if (existingContactRecord == null) {
            System.out.println("contact not found");
            return;
        }
        System.out.println("Name; " + existingContactRecord.getName() + "phone number is: " + existingContactRecord.getPhoneNum());
    }

    public static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = newPhone.findContact(name);
        if (existingContactRecord == null) {
            System.out.println("contact not found");
            return;
        }
        System.out.print("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new Phone number: ");
        String number = scanner.nextLine();
        Contacts newContact = Contacts.createContact(newName, number);
        if (newPhone.modifyContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated the record");
        } else {
            System.out.println("Error updating record");
        }
    }

    public static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name, phone);
        if (newPhone.addNewContact(newContact)) {
            System.out.println("New contact added: " + name + ", Phone: " + phone);
        } else {
            System.out.println("Cannot add " + name + " already on file");
        }
    }

//    public static Contacts setContact() {
//        System.out.println("Enter the name of the contact: ");
//        String name = scanner.next();
//        System.out.println("Enter the phone number: ");
//        String phoneNumber = scanner.next();
//        Contacts newContact = new Contacts(name, phoneNumber);
//        return newContact;
//    }

    public static void options() {
        System.out.println("0. Print Menu");
        System.out.println("1. Quit");
        System.out.println("2. print list of contacts");
        System.out.println("3. Add new contact");
        System.out.println("4. Update Existing contact");
        System.out.println("5. Remove contact");
        System.out.println("6. Search and find contact");
    }
}

