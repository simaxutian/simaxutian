package Lesson3;

import java.util.*;

public class phonebook {

	class user{
		private String Firstname;
		private String Lastname;
		private String phonenumber;
		private int homenumber;
		private int zipcode;
		private String email;
		private String getFirstname() {
			return Firstname;
		}
		private void setFirstname(String firstname) {
			Firstname = firstname;
		}
		private String getLastname() {
			return Lastname;
		}
		private void setLastname(String lastname) {
			Lastname = lastname;
		}
		private String getPhonenumber() {
			return phonenumber;
		}
		private void setPhonenumber(String phonenumber) {
			this.phonenumber = phonenumber;
		}
		private int getHomenumber() {
			return homenumber;
		}
		private void setHomenumber(int homenumber) {
			this.homenumber = homenumber;
		}
		private int getZipcode() {
			return zipcode;
		}
		private void setZipcode(int zipcode) {
			this.zipcode = zipcode;
		}
		private String getEmail() {
			return email;
		}
		private void setEmail(String email) {
			this.email = email;
		}
		
		user(String Firstname,String Lastname,String phonenumber)
		{
			
		}
		
		user(String Firstname,String Lastname,String phonenumber,int homenumber,int zipcode,String email)
		{
			this.Firstname=Firstname;
			this.Lastname=Lastname;
			this.phonenumber=phonenumber;
			this.homenumber=homenumber;
			this.zipcode=zipcode;
			this.email=email;
		}
		
		user[] List()
		{
			
			return null;
		}
		public void Addcontact(String Firstname,String Lastname,String phonenumber)
		{
			 Scanner scanner = new Scanner(System.in);
			 String firstName = null;
			 String lastName = null;
			 String phoneNum=null;
			 
			 user newUser = new user(firstName,lastName,phoneNum);
		}
		public void Updatecontact()
		{
			 Scanner scanner = new Scanner(System.in);
		}
		public void Deletecontact()
		{
			 Scanner scanner = new Scanner(System.in);
		}
		
	}
	public static void main(String[] args) {
		List<user> myPhoneContactList;
		
		// Addcontact();
	}

}
