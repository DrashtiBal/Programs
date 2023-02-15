package com.JavaDatabase.drashti;

public interface CrudOperation {

	public void insertUser(User u);
	
	public void  getAllUser();
	
	public void getSingleUser(int eid);
	
	public void deleteAllUser(User u);
	
	public void deleteSingleuser(int eid);
	
	public void updateSingleUser(int eid);
	
	 
}
