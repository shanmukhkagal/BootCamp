import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook
{
  static int i;
  static List<Contact> membersList;
  static AddressBookMembers abms;
  static Scanner sc;
  static Contact kiran;
  static Contact varun;
  static Contact object;

  public static int optionToUpdate(Object object)
  {
      Contact anObject = (Contact) object;
      sc = new Scanner(System.in);
      System.out.println("Which detail do you want to change?");
      System.out.println("1. first name" +"\n"+"2. last name"+"\n"+
                         "3. address"+"\n"+"4. city"+"\n"+"5. state"+"\n"+
                         "6. zip"+"\n"+"7. phone number"+"\n"+"8. email"+"\n"+
                         "9. exit");
      int option =sc.nextInt();
      sc = new Scanner(System.in);
      switch(option)
      {
          case 1:
              System.out.println("Enter the first name:");
              anObject.setFirstName(sc.nextLine());
              break;
          case 2:
              System.out.println("Enter the last name: ");
              anObject.setLastName(sc.nextLine());
              break;
          case 3:
              System.out.println("Enter the Address: ");
              anObject.setAddress(sc.nextLine());
              break;
          case 4:
              System.out.println("Enter the city");
              anObject.setCity(sc.nextLine());
              break;
          case 5:
              System.out.println("Enter the state");
              anObject.setState(sc.nextLine());
              break;
          case 6:
              System.out.println("Enter the zip");
              anObject.setZip(sc.nextInt());
              break;
          case 7:
              System.out.println("Enter the phone number");
              anObject.setPhoneNumber(sc.nextLong());
              break;
          case 8:
              System.out.println("Enter the email");
              anObject.setEmail(sc.nextLine());
              break;
          default:
              System.out.println("Thank you");
      }
      return 0;
  }

  //main method
  public static void main(String[] args)
  {
      //Entering the details manually
      kiran = new Contact("Anil", "Nayak", "H.No: 1-4-5/2, Near Ganes Temple, Gadag.", "Banglore", "Karnataka", 586121, 9380474806L, "email1@yahoo.com");

      //Creating a list for the contacts
      membersList = new ArrayList<>();

      //Adding member to the contact list
      membersList.add(kiran);

      //Passing the contacts list to the address book
      abms = new AddressBookMembers(membersList);

      //printing the contact details from Contacts list
      System.out.println("Contact: "+abms.getContact());


      //Taking the details from user
      sc = new Scanner(System.in);

      System.out.println("Enter member's first name: ");
      String firstName = sc.nextLine();
      System.out.println("Enter member's last name: ");
      String lastName = sc.nextLine();
      System.out.println("Enter email: ");
      String email = sc.nextLine();
      System.out.println("Enter member's address: ");
      String address = sc.nextLine();
      System.out.println("Enter city: ");
      String city = sc.nextLine();
      System.out.println("Enter state: ");
      String state = sc.nextLine();
      System.out.println("Enter zip: ");
      int zip = sc.nextInt();
      System.out.println("Enter phone number: ");
      long phoneNumber = sc.nextLong();

      //Passing variables/details to the Contact-class
      varun = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);

      //Adding member to the contact list
      membersList.add(varun);

      //printing the contact details from Contacts list
//      System.out.println("Contact: "+abms.getContact());

      System.out.println("Do you want to update details? : Y/N");
      sc = new Scanner(System.in);

      //choosing the option
      switch(sc.nextLine().toUpperCase())//converting the option to upper-case
      {
          case "Y":
              System.out.println("Which persons details do you want to update?"+"\n"+" 1. person_1"+"\n"+" 2. person_2");
              System.out.println("Enter the number: ");
              switch(sc.nextInt())
              {
                  case 1:
                      //updating person_1
                      object = kiran; //passing reference to a reference
                      optionToUpdate(object);
                      break;
                  case 2:
                      //Updating person_2
                      object = varun; //passing reference to a reference
                      optionToUpdate(object);
                      break;
                  default:
                      System.out.println("Sorry! this program is for two persons only!");
              }
          default:
              System.out.println("Thank you!");
      }

//      System.out.println("Contact: "+abms.getContact());
      System.out.println(abms.getByName("kiran"));

      System.out.println("Do yopu want to delete the last list entered?: Y/N");
      sc = new Scanner(System.in);
      String delete = sc.nextLine().toUpperCase();
      if("Y".equals(delete))
      {
      	System.out.println("Which persons details do you want to delete?"+"\n"+" 1. person_1"+"\n"+" 2. person_2");
      	System.out.println("Enter the number: ");
      	switch(sc.nextInt())
      	{
      		case 1:
      			//updating person_1
      			object = kiran; //passing reference to a reference
      			membersList.remove(object);
      			break;
      		case 2:
      			//Updating person_2
      			object = varun; //passing reference to a reference
      			membersList.remove(object);
      			break;
      		default:
      			System.out.println("Sorry! this program is for two persons only!");
      	}
      	System.out.println("contact deleted from the Address Book!");
      }
//      System.out.println("Contact: "+abms.getContact());

  }
}
