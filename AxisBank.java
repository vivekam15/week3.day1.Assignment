package week3.assignday1;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("Axis Bank: Deposite Account.");
	}
	public static void main(String[] args) {
		BankInfo bank=new BankInfo();
		AxisBank axis=new AxisBank();
		bank.saving();
		bank.fixed();
		bank.deposit();
		axis.deposit();
	}

	

}
