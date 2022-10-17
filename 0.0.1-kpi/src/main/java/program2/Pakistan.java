package program2;

public class Pakistan implements Countries{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pakistan P1 = new Pakistan();
		P1.no_state();
		P1.states();
	}

	public int no_state() {
		// TODO Auto-generated method stub
		System.out.println("States in Pakistan are: "+8);
		return 8;
	}

	public String states() {
		// TODO Auto-generated method stub
		System.out.println("State1:"+ "Amb");
		System.out.println("State2:"+ "Bahawalpur");
		System.out.println("State3:"+ "Chitral");
		System.out.println("State4:"+ "Hunza");
		System.out.println("State5:"+ "Khairpur");
		System.out.println("State6:"+ "Nagar");
		System.out.println("State7:"+ "Phulra");
		System.out.println("State8:"+ "Swat");
		
		return "str";
	}

}
