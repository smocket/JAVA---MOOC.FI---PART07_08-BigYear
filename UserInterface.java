import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Bird> dataBase;
    
    public UserInterface(Scanner scanner) {
        this.scanner = new Scanner(System.in);
        dataBase = new ArrayList<>();
    }
    
    public void start() {
        
        while(true) {
            System.out.println("?");
            String command = scanner.nextLine();
            
            if(command.equals("Quit")) {
                break;
            }
            
            //Asks for both names of the bird. It creates the bird, then adds it to the dataBase;
            if(command.equals("Add")) {
                System.out.println("Name:");
                String name = scanner.nextLine();
                System.out.println("Name in Latin:");
                String latinName = scanner.nextLine();
                Bird bird = new Bird(name, latinName);
                dataBase.add(bird);
            }
            
            //Adds an observation to the specified bird
            if(command.equals("Observation")) {
                System.out.println("Bird?");
                String observedBird = scanner.nextLine();
                for(int i =0; i < dataBase.size(); i++) {
                    if(dataBase.get(i).getName().equals(observedBird)) {
                        dataBase.get(i).addObservation();
                    }
                }
            }
            
            //Prints all birds
            if(command.equals("All")) {
                for(int i = 0; i < dataBase.size(); i++) {
                    System.out.println(dataBase.get(i));
                }
            }
            
            //Prints one specified bird
            if(command.equals("One")) {
                System.out.println("Bird?");
                String one = scanner.nextLine();
                for(int i = 0; i < dataBase.size(); i++) {
                    if(dataBase.get(i).getName().equals(one)) {
                        System.out.println(dataBase.get(i));
                    }
                }
            }
        }
    }
}
