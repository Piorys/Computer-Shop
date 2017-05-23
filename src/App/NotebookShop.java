package App;
import java.util.Scanner;
import Data.DataStore;

public class NotebookShop {

	public static void main(String[] args) {
		boolean close = false;
		int option;
		Scanner input = new Scanner(System.in);
		
		do{
			System.out.println("Witamy w sklepie komputerowym, wybierz opcję");
			System.out.println("1 - dodaj komputer");
			System.out.println("2 - wyświetl komputery w magazynie");
			System.out.println("3 - policz ile komputerów znajduje się w magazynie");
			System.out.println("4 - sprawdź dostępność komputerów");
			System.out.println("5 - wyjdź z programu");
			option = input.nextInt();
			
			switch(option) {
			case 1:
				DataStore.add();
				break;
			case 2:
				DataStore.listComputers();
				break;
			case 3:
				DataStore.countComputers();
				break;
			case 4:
				DataStore.checkAvalability();;
				break;
			case 5:
				System.out.println("Do widzenia!");
				close = true;
				break;
			default:
				System.out.println("Brak opcji");
			}
		}while(close == false);
		input.close();
	}
	
}

