package program2;

public class North_Korea implements Countries{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		North_Korea NK = new North_Korea();
		NK.no_state();
		NK.states();
	}

	public int no_state() {
		// TODO Auto-generated method stub
		System.out.println("States in North_Korea are: "+9);
		return 9;
	}

	public String states() {
		// TODO Auto-generated method stub
		System.out.println("State1:"+ "Chagang");
		System.out.println("State2:"+ "Kangwon");
		System.out.println("State3:"+ "North Hamgyong");
		System.out.println("State4:"+ "North Hwabghae");
		System.out.println("State5:"+ "North Pyongan");
		System.out.println("State6:"+ "Ryanggang");
		System.out.println("State7:"+ "South Hamgyong");
		System.out.println("State8:"+ "South Hwanghae");
		System.out.println("State9:"+ "South Pyongan");
		
		return "str";
	}

}
