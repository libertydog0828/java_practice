class CarTester{
    public static void main(String[] args){
        Car vitz = new Car("Vitz", "123-456", 1660, 1500,
        3640, 40.0, 35.0, 12.0);
        Car march = new Car("March", "789-012", 1660, 1525,
        3965, 41.0, 35.0, 12.0);

        vitz.putSpec();
        System.out.println();
        march.putSpec();
    }
}