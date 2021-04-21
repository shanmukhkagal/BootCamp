import java.util.*;

//members datails (individual)
class Contact
{
  //private global variables
  private String firstName;
  private String lastName;
  private String address;
  private String city;
  private String state;
  private int zip;
  private long phoneNumber;
  private String email;

  //initializing global variables
  public Contact(String f_name, String l_name, String address, String city, String state, int zip, long phoneNumber, String email)
  {
      firstName = f_name;
      lastName = l_name;
      this.address = address;
      this.city = city;
      this.state = state;
      this.zip = zip;
      this.phoneNumber = phoneNumber;
      this.email = email;
  }

  //to add first name
  public void setFirstName(String firstName) {
      this.firstName = firstName;
  }

  //to add last name
  public void setLastName(String lastName) {
      this.lastName = lastName;
  }

  //to add address
  public void setAddress(String address) {
      this.address = address;
  }

  //to add city
  public void setCity(String city) {
      this.city = city;
  }

  //to add state
  public void setState(String state) {
      this.state = state;
  }

  //to add zip
  public void setZip(int zip) {
      this.zip = zip;
  }

  //to add phone number
  public void setPhoneNumber(long phoneNumber) {
      this.phoneNumber = phoneNumber;
  }

  //to add email
  public void setEmail(String email) {
      this.email = email;
  }

  //to fetch first name
  public String getFirstName() {
      return firstName;
  }

  //to fetch last name
  public String getLastName() {
      return lastName;
  }

  //to fetch address
  public String getAddress() {
      return address;
  }

  //to fetch city
  public String getCity() {
      return city;
  }

  //to fetch state
  public String getState() {
      return state;
  }

  //to fetch zip
  public int getZip() {
      return zip;
  }

  //to fetch phone number
  public long getPhoneNumber() {
      return phoneNumber;
  }

  //to fetch email
  public String getEmail() {
      return email;
  }

  //to fetch everything
  @Override //for getting all the info
  public String toString() {
      return "member info:"+"\n"+ "firstName: " + firstName +"\n"+"lastName: " + lastName +"\n"+ "address: " + address +"\n"+ "city: " + city +"\n"+ "state: " + state +"\n"+ "zip: " + zip +"\n"+ "phoneNumber: " + phoneNumber +"\n"+ "email: " + email;
  }
}

//List of members
class AddressBookMembers
{
  //creating a list for members
  private List<Contact> members;
  /**
   * members = list of members
   */
  HashMap<Contact, List<Contact>> map = new HashMap<>();

  //assigning members to the list
  public AddressBookMembers(List<Contact> members)
  {
      this.members = members;
  }

  //Returns the list of members
  public List<Contact> getContact()
  {
      return members;
  }

  //Adds a new member to the members list
  public void setMember(List<Contact> member)
  {
      this.members = member;
      map.put(member.get(0), member);
  }

  //Returns the contact by name
  public List<Contact> getByName(String name)
  {
  	return map.get(name);
  }
}

