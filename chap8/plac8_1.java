class Human{
    String name;
    int height;
    int weight;
}

class HumanTester{

    public static void main(String[] args){
        Human suzuki = new Human();
        Human takada = new Human();

        suzuki.name = "zirou suzuki";
        suzuki.height = 170;
        suzuki.weight = 60;

        takada.name = "ryuichi takada";
        takada.height = 166;
        takada.weight = 56;

        System.out.printf("name : %s\n", suzuki.name);
        System.out.printf("height : %d\n", suzuki.height);
        System.out.printf("weight : %d\n\n", suzuki.weight);

        System.out.printf("name : %s\n", takada.name);
        System.out.printf("height : %d\n", takada.height);
        System.out.printf("weight : %d\n", takada.weight);        
    }
}