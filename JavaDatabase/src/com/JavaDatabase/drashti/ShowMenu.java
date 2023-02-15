package com.JavaDatabase.drashti;

import java.util.Scanner;

public class ShowMenu extends CrudOperationImplementation {
static int option;
	public static void main(String[] args) {
		User u=new User();
		CrudOperationImplementation ci=new CrudOperationImplementation();
		//JdbcConnection con=new JdbcConnection();
		CrudOperationImplementation.getConnection();
		Scanner s=new Scanner(System.in);
		//CrudOperationImplementation ci=new CrudOperationImplementation();
		do {
			//while(option!="E" || option!="e") { 
				 //try {
				    System.out.println("1. for Insert Details Of Employee");
					System.out.println("2. for Print Details Of Emloyee");
					System.out.println("3. for Print Single Employee Detail");
					System.out.println("4. for Delete All Details of Employee");
					System.out.println("5. for Delete Single Employee Details");
					System.out.println("6. for Update Employee Details");
					System.out.println("7. for Exit");
			        System.out.println("Enter an option"); 
			       int option=s.nextInt();	
			       
			  switch(option) { 
			  case 1:
				  //User u=new User();
				  ci.insertUser(u);
				  ci.getAllUser();
					/*
					 * System.out.println("id  " +u.getEid());
					 * System.out.println("Fname "+u.getFname());
					 * System.out.println("Lname "+u.getLname());
					 * System.out.println("City "+u.getCity());
					 * System.out.println("Age "+u.getAge());
					 * System.out.println("Salary "+u.getSalary());
					 */
				  //System.out.println("Insert Details Of Employee:");
				  s.nextLine();  
			  break;
			  case 2:
				  if(!User.isNull(u)) {
		      System.out.println("===================================================================================");
		      ci.getAllUser();
		      System.out.println("===================================================================================");
				  }
				  else
				  {
					  System.out.println("===================================");
					  System.out.println("your Account Has Not Been Created!!!");
					  System.out.println("===================================");
				  }
			  break;
			  case 3:
				  if(!User.isNull(u)) {
		      System.out.println("===================================================================================");
		      ci.getSingleUser();
		      System.out.println("===================================================================================");
				  }
				  else
				  {
					  System.out.println("===================================");
					  System.out.println("your Account Has Not Been Created!!!");
					  System.out.println("===================================");
				  }
			  break;
			  case 4:
				  if(!User.isNull(u)) {
					  ci.deleteAllUser(u);
					  System.out.println("All user has ben deleted");
				  }
				  else
				  {
					  System.out.println("===================================");
					  System.out.println("your Account Has Not Been Created!!!");
					  System.out.println("===================================");
				  }
			  break;
			  case 5:
				  if(!User.isNull(u)) {
					  ci.deleteSingleuser(option);
					  System.out.println("user has ben deleted");
				  }
				  else
				  {
					  System.out.println("===================================");
					  System.out.println("your Account Has Not Been Created!!!");
					  System.out.println("===================================");
				  }
			  break;
			  case 6:
				  if(!User.isNull(u)) {
					  ci.updateSingleUser(option);
					  System.out.println("user has ben updated");
				  }
				  else
				  {
					  System.out.println("===================================");
					  System.out.println("your Account Has Not Been Created!!!");
					  System.out.println("===================================");
				  }
			  break;
			  
				 		//System.out.println("Your input is invalid");
				 		//s.nextLine();*/
			  case 7:
					 System.out.println("Exit Menu");
					// System.exit(0);
					 break;
			        }
			 }while(option!=7);
			  System.out.println("Thank You For Using Our Services");
	}
	}
