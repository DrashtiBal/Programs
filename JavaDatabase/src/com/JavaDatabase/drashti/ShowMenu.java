package com.JavaDatabase.drashti;

import java.util.Scanner;

public class ShowMenu extends CrudOperationImplementation {
static int option;
	public static void main(String[] args) {
		User u=new User();
		CrudOperationImplementation ci=new CrudOperationImplementation();
		
		CrudOperationImplementation.getConnection();
		Scanner s=new Scanner(System.in);
		
		do {
				 try {
				    System.out.println("1. for Insert Details Of Employee");
					System.out.println("2. for Print Details Of All Emloyee");
					System.out.println("3. for Print Single Employee Detail Using Id");
					System.out.println("4. for Delete Details of All Employee");
					System.out.println("5. for Delete Single Employee Details Using Id");
					System.out.println("6. for Update Employee Details");
					System.out.println("7. for Exit");
			        System.out.println("Enter an option"); 
			       int option=s.nextInt();	
			       
			  switch(option) { 
			  case 1:
				  
				  ci.insertUser(u);
				  		s.nextLine();  
			  break;
			  case 2:
				  System.out.println("===================================================================================");
				  ci.getAllUser();
				  System.out.println("===================================================================================");
				  
			  break;
			  case 3:
				  			  
				  ci.getSingleUser(u);
				  System.out.println("=================================================================================================");
				  System.out.println("Eid:"+u.getEid()+" ,Fname:"+u.getFname()+", Lname:"+u.getLname()+" ,City:"+u.getCity()+" ,Age:"+u.getAge()+" ,Salary:"+u.getSalary());
				  System.out.println("=================================================================================================");			  
			 
			  break;
			  case 4:
				  if(!User.isNull(u)) {
					  ci.deleteAllUser();
				  }
				  else
				  {
					  System.out.println("===================================");
					  System.out.println("your Account Has Not Been Created!!!");
					  System.out.println("===================================");
				  }
			  break;
			  case 5:
				  
				  ci.deleteSingleuser();
				  
			  break;
			  case 6:
				  ci.updateSingleUser(u);
			  break;
			  case 7:
					 System.out.println("Exit Menu");
					 System.exit(0);
					 break;
					 
			  default:System.out.println("Invalid Option!! Please Enter Again"); 
			        }
			 }
				 	catch (Exception i) {
					System.out.println("Your input is mismatched");
					s.nextLine();
				}
		}    while(option!=7);
			  System.out.println("Thank You For Using Our Services");
	}
	}
