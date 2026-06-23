package day27;

import java.util.*;
import java.util.stream.*;
import java.io.*;

class Contact {
    String first_name;
    String last_name;
    String Address;
    String city;
    String State;
    int zip;
    String email;

    Contact(String first_name, String last_name, String Address,
            String city, String State, int zip, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.Address = Address;
        this.city = city;
        this.State = State;
        this.zip = zip;
        this.email = email;
    }

    void display() {
        System.out.println("First Name : " + first_name);
        System.out.println("Last Name  : " + last_name);
        System.out.println("Address    : " + Address);
        System.out.println("City       : " + city);
        System.out.println("State      : " + State);
        System.out.println("Zip        : " + zip);
        System.out.println("Email      : " + email);
        System.out.println("--------------------------------");
    }

    @Override
    public String toString() {
        return first_name + "," + last_name + "," + Address + "," +
               city + "," + State + "," + zip + "," + email;
    }
}

class AddressBook {

    Scanner sc = new Scanner(System.in);
    ArrayList<Contact> arr = new ArrayList<>();

    void storing(Contact c) {
        arr.add(c);
    }

    void edit(String first_name, String last_name) {
        boolean found = false;

        for (Contact contact : arr) {
            if (contact.first_name.equalsIgnoreCase(first_name)
                    && contact.last_name.equalsIgnoreCase(last_name)) {

                System.out.println("Enter new email:");
                contact.email = sc.nextLine();

                System.out.println("Contact Updated");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }

    void delete(String first_name, String last_name) {

        Iterator<Contact> itr = arr.iterator();

        while (itr.hasNext()) {
            Contact c = itr.next();

            if (c.first_name.equalsIgnoreCase(first_name)
                    && c.last_name.equalsIgnoreCase(last_name)) {
                itr.remove();
                System.out.println("Contact Deleted");
                return;
            }
        }

        System.out.println("Contact not found.");
    }

    void display() {
        if (arr.isEmpty()) {
            System.out.println("No Contacts Available");
            return;
        }

        arr.forEach(Contact::display);
    }

    void viewbycity() {
        Map<String, List<Contact>> cityMap =
                arr.stream().collect(Collectors.groupingBy(c -> c.city));

        cityMap.forEach((city, persons) -> {
            System.out.println("City : " + city);
            persons.forEach(p ->
                    System.out.println(p.first_name + " " + p.last_name));
        });
    }

    void viewbystate() {
        Map<String, List<Contact>> stateMap =
                arr.stream().collect(Collectors.groupingBy(c -> c.State));

        stateMap.forEach((state, persons) -> {
            System.out.println("State : " + state);
            persons.forEach(p ->
                    System.out.println(p.first_name + " " + p.last_name));
        });
    }

    void countbycity() {
        Map<String, Long> countMap =
                arr.stream().collect(Collectors.groupingBy(
                        c -> c.city, Collectors.counting()));

        countMap.forEach((city, count) ->
                System.out.println(city + " -> " + count));
    }

    void sortByName() {
        arr.stream()
                .sorted(Comparator.comparing(
                        c -> c.first_name + " " + c.last_name,
                        String.CASE_INSENSITIVE_ORDER))
                .forEach(Contact::display);
    }

    void sortByCity() {
        arr.stream()
                .sorted(Comparator.comparing(
                        c -> c.city,
                        String.CASE_INSENSITIVE_ORDER))
                .forEach(Contact::display);
    }

    void sortByState() {
        arr.stream()
                .sorted(Comparator.comparing(
                        c -> c.State,
                        String.CASE_INSENSITIVE_ORDER))
                .forEach(Contact::display);
    }

    void sortByZip() {
        arr.stream()
                .sorted(Comparator.comparingInt(c -> c.zip))
                .forEach(Contact::display);
    }

    void writeToFile(String fileName) {
        try (FileWriter fw = new FileWriter(fileName)) {

            for (Contact c : arr) {
                fw.write(c.toString());
                fw.write("\n");
            }

            System.out.println("Contacts written to file successfully.");
        }
        catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    void readFromFile(String fileName) {
        try (BufferedReader br =
                     new BufferedReader(new FileReader(fileName))) {

            arr.clear();

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                if (data.length == 7) {
                    Contact c = new Contact(
                            data[0],
                            data[1],
                            data[2],
                            data[3],
                            data[4],
                            Integer.parseInt(data[5]),
                            data[6]
                    );

                    arr.add(c);
                }
            }

            System.out.println("Contacts loaded successfully.");
        }
        catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}

public class address_file {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, AddressBook> books = new HashMap<>();

        while (true) {

            System.out.println("\n===== ADDRESS BOOK MENU =====");
            System.out.println("1. Create Address Book");
            System.out.println("2. Select Address Book");
            System.out.println("3. Display Address Books");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.println("Enter Address Book Name:");
                    String bookName = sc.nextLine();

                    if (books.containsKey(bookName)) {
                        System.out.println("Book already exists.");
                    } else {
                        books.put(bookName, new AddressBook());
                        System.out.println("Address Book Created.");
                    }
                    break;

                case 2:

                    System.out.println("Enter Address Book Name:");
                    bookName = sc.nextLine();

                    if (!books.containsKey(bookName)) {
                        System.out.println("Address Book not found.");
                        break;
                    }

                    AddressBook book = books.get(bookName);

                    while (true) {

                        System.out.println("\n--- " + bookName + " ---");
                        System.out.println("1. Add Contact");
                        System.out.println("2. Display Contacts");
                        System.out.println("3. Edit Contact");
                        System.out.println("4. Delete Contact");
                        System.out.println("5. View By City/State");
                        System.out.println("6. Count Contacts By City");
                        System.out.println("7. Sort By Name");
                        System.out.println("8. Sort By City");
                        System.out.println("9. Sort By State");
                        System.out.println("10. Sort By Zip");
                        System.out.println("11. Write To File");
                        System.out.println("12. Read From File");
                        System.out.println("13. Exit");

                        int crud = sc.nextInt();
                        sc.nextLine();

                        switch (crud) {

                            case 1:

                                System.out.println("Number of Contacts:");
                                int count = sc.nextInt();
                                sc.nextLine();

                                for (int i = 0; i < count; i++) {

                                    System.out.println("\nContact " + (i + 1));

                                    System.out.print("First Name: ");
                                    String fn = sc.nextLine();

                                    System.out.print("Last Name: ");
                                    String ln = sc.nextLine();

                                    System.out.print("Address: ");
                                    String addr = sc.nextLine();

                                    System.out.print("City: ");
                                    String city = sc.nextLine();

                                    System.out.print("State: ");
                                    String state = sc.nextLine();

                                    System.out.print("Zip: ");
                                    int zip = sc.nextInt();
                                    sc.nextLine();

                                    System.out.print("Email: ");
                                    String email = sc.nextLine();

                                    book.storing(new Contact(
                                            fn, ln, addr,
                                            city, state,
                                            zip, email));
                                }
                                break;

                            case 2:
                                book.display();
                                break;

                            case 3:
                                System.out.println("Enter First Name:");
                                String fn = sc.nextLine();

                                System.out.println("Enter Last Name:");
                                String ln = sc.nextLine();

                                book.edit(fn, ln);
                                break;

                            case 4:
                                System.out.println("Enter First Name:");
                                fn = sc.nextLine();

                                System.out.println("Enter Last Name:");
                                ln = sc.nextLine();

                                book.delete(fn, ln);
                                break;

                            case 5:

                                System.out.println("1. View By City");
                                System.out.println("2. View By State");

                                int opt = sc.nextInt();
                                sc.nextLine();

                                if (opt == 1)
                                    book.viewbycity();
                                else if (opt == 2)
                                    book.viewbystate();

                                break;

                            case 6:
                                book.countbycity();
                                break;

                            case 7:
                                book.sortByName();
                                break;

                            case 8:
                                book.sortByCity();
                                break;

                            case 9:
                                book.sortByState();
                                break;

                            case 10:
                                book.sortByZip();
                                break;

                            case 11:
                                book.writeToFile("contacts.txt");
                                break;

                            case 12:
                                book.readFromFile("contacts.txt");
                                break;

                            case 13:
                                System.out.println("Exiting Address Book...");
                                break;

                            default:
                                System.out.println("Invalid Choice");
                        }

                        if (crud == 13)
                            break;
                    }
                    break;

                case 3:

                    if (books.isEmpty()) {
                        System.out.println("No Address Books Found.");
                    } else {
                        books.keySet().forEach(System.out::println);
                    }
                    break;

                case 4:

                    System.out.println("Application Closed.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
