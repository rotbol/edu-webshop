package dk.rotly.dto;

public class Customer {
  String firstName;
  String lastName;
  String zip;
  String city;
  
  public Customer(){
    super();
  }
  
  public Customer(String firstName, String lastName, String zip, String city) {
    super();
    this.firstName = firstName;
    this.lastName = lastName;
    this.zip = zip;
    this.city = city;
  }

  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public String getZip() {
    return zip;
  }
  public void setZip(String zip) {
    this.zip = zip;
  }
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }
}
