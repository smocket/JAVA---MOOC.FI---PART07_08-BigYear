public class Bird {
    private String name;
    private String latinName;
    int observations;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getLatinName() {
        return this.latinName;
    }
    
    public void addObservation() {
        this.observations += 1;
    }
    
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observations + " observations";
    }
    
}
