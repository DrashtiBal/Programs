package String_Programs;

public class A {

	public static void main(String[] args) {

		try {
			
			String a[] = null;
			//i[3] =null;
			//System.out.println(i[3]);
			//System.out.println(i[0]);
		} catch (NullPointerException e) {
			System.out.println(e);
		} 
		catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1);
			System.out.println("hsguhu");
		}

		catch (Exception e3) {
			System.out.println(e3);
			
		}
	}
}
