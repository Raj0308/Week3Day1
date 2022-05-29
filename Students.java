package week3.day1;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Employee ID:" + id);
		
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Employee ID:" + id);
		System.out.println("Employee Name:" + name);
		
	}
	public void getStudentInfo(String email, double phoneNumber) {
		System.out.println("Employee Email:" + email);
		System.out.println("Employee Email:" + phoneNumber);
	
	}
	
	public static void main(String[] args) {
		Students details = new Students();
		details.getStudentInfo(1245);
		details.getStudentInfo(1245, "varadharaj");
		details.getStudentInfo("varadharaj.raj@gmail.com", 778414558);
		

	}

}
