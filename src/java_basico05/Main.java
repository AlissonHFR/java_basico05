package java_basico05;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
		

	}

	private void start() {
		
		for(int i = 0;i<=5;i++) {
			switch(i) {
			case 1: System.out.println("Primeira condi��o");
			break;
			case 2: System.out.println("N�o encontrou uma condi��o");
			break;
			case 3: System.out.println("N�o encontrou uma condi��o");
			break;
			case 4: System.out.println("Segunda condi��o");
			break;
			case 5: System.out.println("N�o encontrou uma condi��o");
			break;
			
			}
		}
		
	}

}
