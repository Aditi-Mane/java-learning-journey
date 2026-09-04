package composition.vs.inheritance;

public class Car {

    //composition: Car HAS-A Engine
    private Engine engine;

    //constructor receives an Engine object and stores it inside the Car
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startCar() {
        //the actual Engine object's start() method will be called.
        //PetrolEngine -> PetrolEngine.start()
        //ElectricEngine -> ElectricEngine.start()
        engine.start();

        System.out.println("Car started");
    }
}