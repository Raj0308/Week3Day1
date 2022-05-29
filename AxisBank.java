package week3.day1;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("deposit:2500");
	}
	public static void main(String[] args) {
		AxisBank myDetails = new AxisBank();
		myDetails.deposit();

	}

}
