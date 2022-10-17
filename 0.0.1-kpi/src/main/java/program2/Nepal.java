package program2;

public class Nepal implements Countries{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nepal N1 = new Nepal();
		N1.no_state();
		N1.states();
	}

	public int no_state() {
		// TODO Auto-generated method stub
		System.out.println("States in Nepal are: "+7);
		return 7;
	}

	public String states() {
		// TODO Auto-generated method stub
		System.out.println("State1:"+ "Bagmati");
		System.out.println("State2:"+ "Bhaluwang");
		System.out.println("State3:"+ "Gandaki");
		System.out.println("State4:"+ "Godavari");
		System.out.println("State5:"+ "Karnali");
		System.out.println("State6:"+ "Lumbini");
		System.out.println("State7:"+ "Sudurpaschim");
		return "str";
	}

}
