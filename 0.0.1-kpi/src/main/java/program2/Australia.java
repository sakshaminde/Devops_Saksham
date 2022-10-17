package program2;

public class Australia implements Countries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Australia A1 = new Australia();
		A1.no_state();
		A1.states();
		}

	public int no_state() {
		// TODO Auto-generated method stub
		System.out.println("States in Australia are: "+6);
		return 6;
	}

	public String states() {
		// TODO Auto-generated method stub
		System.out.println("State1:"+ "New South Wales");
		System.out.println("State2:"+ "Victoria");
		System.out.println("State3:"+ "Queensland");
		System.out.println("State4:"+ "Western Australia");
		System.out.println("State5:"+ "South Australia");
		System.out.println("State6:"+ "Tasmania");
		return "str";
	}

}
