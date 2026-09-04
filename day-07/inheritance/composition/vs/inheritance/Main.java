package composition.vs.inheritance;

public class Main {
    public static void main(String[] args) {

        //particular engine object passed onto Car constructor
        Car petrolCar = new Car(new PetrolEngine());
        Car electricCar = new Car(new ElectricEngine());

        petrolCar.startCar();
        System.out.println();
        electricCar.startCar();
    }
}
/* OUTPUT

Petrol Engine starts.
Car started

Electric Engine starts.
Car started
 */