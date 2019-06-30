package ListAndArray;

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
            switch (choice) {
                case 0:
                    options();
                    break;
                case 1:
                    quit = true;
                    break;
                case 2:
                    printList();
                    break;
                case 3:
                    Contacts contact = setContact();
                    newPhone.storeContact(contact);
                    break;
                case 4:
                    System.out.println("Contact Information You Want To Switch");
                    Contacts contactOriginal = setContact();
                    System.out.println("Contact Information you want to modify to");
                    Contacts contactSwtich = setContact();
                    newPhone.modifyContact(contactOriginal, contactSwtich);
            }

        }
    }
    public static Contacts setContact() {
        System.out.println("Enter the name of the contact: ");
        String name = scanner.next();
        System.out.println("Enter the phone number: ");
        String phoneNumber = scanner.next();
        Contacts newContact = new Contacts(name, phoneNumber);
        return newContact;
    }

    public static void printList() {
        newPhone.printList();
    }

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

