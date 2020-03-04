package java_basico05;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
		

	}

	private void start() {
		
		for(int i = 0;i<=5;i++) {
			switch(i) {
			case 1: System.out.println("Primeira condição");
			break;
			case 2: System.out.println("Não encontrou uma condição");
			break;
			case 3: System.out.println("Não encontrou uma condição");
			break;
			case 4: System.out.println("Segunda condição");
			break;
			case 5: System.out.println("Não encontrou uma condição");
			break;
			
			}
		}
		
	}

}
