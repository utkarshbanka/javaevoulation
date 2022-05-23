package course;

public class course {

	int courseId = 10;
	String courseName = "Math";
	int courseFee = 9;
	
	void displayCourseDetails()
	{
		
//		course d1 = new course();
		System.out.println(courseId);
		System.out.println(courseName);
		System.out.println(courseFee);
	}
	
	
	static void authenticate(String username, String password)
	{
		course d1 = new course();
		
		
		if(username.equals("Admin") && password.equals("1234"))
		{
		    d1.displayCourseDetails();
		}
		else 
		{
			System.out.println("Invalid Username or password");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
//		course d1 = new course();
//		d1.displayCourseDetails();
		
		authenticate("Admin", "1234");
		authenticate("ram","5454");
	}

}
