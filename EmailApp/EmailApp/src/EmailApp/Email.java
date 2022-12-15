package EmailApp;

import java.util.Scanner;

public class Email {
   private String firstName;
   private String lastName;
   private String department;
   private String password;
   private int defaultRandomPasswordLength = 10;
   private int mailBoxCapacity;
   private String companySuffix = "companyName.com";
   private String alternateEmail;
   private String email;
   private String altEmail;

   // constructor to receive fist and last name
   public Email(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
       System.out.println("EMAIL CREATED: " + this.firstName +" "+ this.lastName);

      // call a method asking for department
      this.department = setDepartment();
      System.out.println("Department: " + this.department);

      // call a method that generates a random password
      this.password = randomPass(defaultRandomPasswordLength);

      System.out.println("Random password generated: " + this.password);
      System.out.println("");
      email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
      System.out.println("Your email is: " + email);
   }
   // ask for the department

   private String setDepartment() {
      System.out.print("Enter the department code:\n1 for sales \n2 for Dev \n3 for Accounting\n0 for none \n");
      Scanner in = new Scanner(System.in);
      int departmentChoice = in.nextInt();
      if (departmentChoice == 1) {
         return "sales";
      } else if (departmentChoice == 2) {
         return "Dev";
      } else if (departmentChoice == 3) {
         return "Accounting";
      } else {
         return " ";
      }

   }

  // generate a random password

   private String randomPass(int length) {
      String passwordSet = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ123456789";

      char[] password = new char[length];

      for (int i = 0; i < length; i++) {
         int rand = (int) (Math.random() * passwordSet.length());

         password[i] = passwordSet.charAt(rand);

      }
      return new String(password);
   }
// change password

// set mailbox capacity
public void setMailBoxCapacity(int capacity){
   this.mailBoxCapacity = capacity;
}
// set alternate email
public void setAltEmail(String altEmail){
      this.altEmail = altEmail;
}
}
