class Human{
    private String name;
    private int height;
    private int weight;
    
    //constructer//
    Human(String n, int h, int w){
        name = n; height = h; weight = w;
    }

    String getName() { return name; };
    int getHeight() { return height; };
    int getWeight() { return weight; };

    void gainWeight(int w) { weight += w; };
    void reduceWeight(int w) { weight -= w; };
}

class HumanTester{
    public static void main(String[] args){
        Human suzuki = new Human("zirou suzuki", 170, 60);
        Human takada = new Human("ryuzi takada", 166, 56);

        suzuki.gainWeight(3);
        takada.reduceWeight(5);

        System.out.printf("name : %s\n", suzuki.getName());
        System.out.printf("height : %s\n", suzuki.getHeight());
        System.out.printf("weight : %s\n", suzuki.getWeight());
        System.out.println();

        System.out.printf("name : %s\n", takada.getName());
        System.out.printf("height : %s\n", takada.getHeight());
        System.out.printf("weight : %s\n", takada.getWeight());
    }
}