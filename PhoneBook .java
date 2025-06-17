import java.util.Scanner;
class Contact {
    String username;
    String email;
    String phoneNumber;
    String gender;
    public Contact( String username, String email, String phoneNumber, String gender) {
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
		this.age=age;
		this.blood group=blood group;
		this.location=location;
    }
    public void display() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Blood group: " + blood group);
        System.out.println("Location: " + location);
        System.out.println("-------------------------");
    }
}
public class PhoneBook {
    public static void main(String[] args) {
            switch (option) {
                case 1:
                    System.out.print("Enter Username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter Gender: ");
                    String gender = scanner.nextLine();
                    contacts[count++] = new Contact(id, username, email, phone, gender);
                    System.out.println("Contact added!");
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("No contacts to display.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            contacts[i].display();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default;
                    System.out.println("Invalid option, try again.");
            }
        }
    }
}

