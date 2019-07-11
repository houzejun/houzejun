public class test {
    public static void main(String[] args) {
        Car bmw = CarFactory.getCar("bmw");
        System.out.println("bmw = " + bmw.getName());
    }
}
