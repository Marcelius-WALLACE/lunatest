package runapp;

public class RunMyApp {

	public static void main(String[] args) {
		
		System.out.println(doHello()+doWorld());

	}
	
	private static String doHello () {
		return "Hello again, " ;
	}
	
	private static String doWorld () {
		return "Magic World !" ;
	}

}
