package Data;
import Data.Computer;
import java.util.Scanner;
public class DataStore {
	
	static Scanner input = new Scanner(System.in);
	static Computer[] storage = new Computer[100];
	
	
	public static Computer addComputer(){
		
		int newModel = 0;
		boolean newModelCorrect = false;
		 
		do {
		System.out.println("Podaj nr modelu: ");
		int inputModel = input.nextInt();
		if((inputModel >= 0) && (inputModel <= 1000000)){
			newModel = inputModel;
			newModelCorrect = true;
		}else{
			System.out.println("Błąd! Podaj wartość pomiędzy 0 a 1 000 000");
		}
		input.nextLine();
		}while(newModelCorrect == false);
		
		System.out.println("Podaj nazwę producenta: ");
		String newProducer = input.nextLine();
		return new Computer(newModel, newProducer);
	}
	
	public static void add(){
		for(int i = 0; i<storage.length ; i++){
			if(storage[i] == null){
				storage[i] = addComputer();
			}else if (storage[i] != null){
				continue;
			}else{
				System.out.println("Magazyn jest pełny!");
				System.out.println("");
			}
			break;
		}	
	}
	

	public static void listComputers(){
		for(int i = 0; i<storage.length ; i++){
			if(storage[i] != null){
				int computerCount = i+1;
				System.out.println("Komputer nr " + computerCount);
				System.out.println(storage[i]);
				System.out.println("");
			}
		}
	}
	
	public static void countComputers(){
		int storageCount = 0;
		for(int i = 0; i<storage.length;i++){
			if(storage[i] != null){
				storageCount++;
				continue;
			}
			break;
		}
		System.out.println("W magazynie znajduje się aktualnie " + storageCount + " komputerów");
		System.out.println("");
	}
	
	public static void checkAvalability(){
		int computersAvaivable = 0;
		Computer query = addComputer();
		
		for(int i=0; i< storage.length;i++ ){
			if(storage[i].equals(query)){
				computersAvaivable++;
			}else{
				break;
			}
		}
		System.out.println("Znaleziono " + computersAvaivable + " komputerów w magazynie");
		System.out.println("");
		
	}
	
}
