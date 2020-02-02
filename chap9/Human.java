public class Human{
    private String name;
    private int height;
    private int weight;

    //constructer//
    public Human() {}
    public Human(String name, int height, int weight) { set(name, height, weight); }
    public Human(Human person) { this(person.name, person.height, person.weight); }

    public void set(String name, int height, int weight){
        this.name = name; this.height = height; this.weight = weight;
    }

    public String getName() { return this.name; }
    public int getHeight() { return this.height; }
    public int getWeight() { return this.weight; }

}