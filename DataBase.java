import java.util.ArrayList;

public class DataBase {
    private ArrayList<Bird> birds;
    
    public DataBase() {
        this.birds = new ArrayList<>();
    }
    
    public void addBird(Bird bird) {
        this.birds.add(bird);
    }
    
    public ArrayList getBird() {
        return this.birds;
    }
    
}
