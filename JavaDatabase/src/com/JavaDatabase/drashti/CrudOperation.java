package com.JavaDatabase.drashti;

public interface CrudOperation {

	public void insertUser(User u);
	
	public void  getAllUser();
	
	public User getSingleUser(User u);
	
	public void deleteAllUser();
	
	public void deleteSingleuser();
	
	public User updateSingleUser(User u);
	
	 
}
