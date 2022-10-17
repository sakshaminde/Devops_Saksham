package program2;

public class South_Africa implements Countries{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		South_Africa SA = new South_Africa();
		SA.no_state();
		SA.states();
	}

	public int no_state() {
		// TODO Auto-generated method stub
		System.out.println("States in South Africa are: "+9);
		return 9;
	}

	public String states() {
		// TODO Auto-generated method stub
				System.out.println("State1:"+ "Eastern Cape");
				System.out.println("State2:"+ "Free State");
				System.out.println("State3:"+ "Gauteng");
				System.out.println("State4:"+ "KwaZulu-Natal");
				System.out.println("State5:"+ "Limpopo");
				System.out.println("State6:"+ "Mpumalanga");
				System.out.println("State7:"+ "Northern Cape");
				System.out.println("State8:"+ "North West");
				System.out.println("State9:"+ "Western Cape");
		return "str";
	}

}
