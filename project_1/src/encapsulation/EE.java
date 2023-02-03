package encapsulation;

	class Name {
		 
	    private int age; 
	    private String name; 					// Private is using to hide the data
	 
	    public int getAge() { return age; }
	    public String getname() { return name;}
	    
	 
	    /*public void setAge(int age)
	    {
	        this.age = age;
	    } // setter
	}*/
		public void setName(String name) {
			this.name = name;
		}
		public void setAge(int age) {
			this.age = age;
		}
	}

	public class EE {
		 public static void main(String[] args)
		    {
		 
		        Name n1 = new Name();
		 
		        n1.setAge(19);
		        n1.setName("drashti");
		 
		        System.out.println("her age of the person is: "
		                           + n1.getAge());
		        System.out.println("name is:"+n1.getname());
		    }
	}
