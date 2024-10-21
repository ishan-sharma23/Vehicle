public class Main2 {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        System.out.println("Car:");
        for (int i=0;i<3;i++){
            car.speedup();
        }
        System.out.println("Bicycle:");
        for (int i=0;i<3;i++) {
            bicycle.speedup();
        }
    }
}
