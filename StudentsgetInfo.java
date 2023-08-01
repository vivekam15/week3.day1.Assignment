package week3.assignday1;

public class StudentsgetInfo {
	 public void getStudentInfo(int id) {
	        System.out.println("Student ID: " + id);
	    }
	    public void getStudentInfo(int id, String name) {
	        System.out.println("Student ID: " + id);
	        System.out.println("Student Name: " + name);
	    }
	    public void getStudentInfo(String name,int id) {
	    	System.out.println("Student Name: " + name);
	    	System.out.println("Student ID: " + id);
	        
		
		
			
	    }
	    public void getStudentInfo(String email, String phoneNumber) {
	        System.out.println("Student Email: " + email);
	        System.out.println("Student Phone Number: " + phoneNumber);
	    }

	    public static void main(String[] args) {
	        StudentsgetInfo student = new StudentsgetInfo();
	       student.getStudentInfo(1234);
	       student.getStudentInfo(2456,"Meena");
	       student.getStudentInfo("viveka.m15@gmail.com", "976541230");
	       student.getStudentInfo(36, "Viveka");
	       student.getStudentInfo("Vinoth", 36);
	     System.out.println("*************");

	    }
	    

}
