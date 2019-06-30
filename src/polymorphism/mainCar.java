package polymorphism;

class Car{
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void startEngine(){
        System.out.println("No engines to start");
    }

    public void accelerate(){
        System.out.println("No Acceleration");
    }

    public void brake() {
        System.out.println("No Brakes To Stop");
    }
}

class BMW extends Car{
    public BMW(){
        super(6, "i8");
    }
    @Override
    public void startEngine(){
        System.out.println("Starting BMW i8 Engine");
    }

    @Override
    public void accelerate(){
        System.out.println("BMW i8 accelerating at 180km/h");
    }

    @Override
    public void brake(){
        System.out.println("BMW i8 stopping in 0.7seconds");
    }
}

class Kia extends Car{
    public Kia(){
        super(4, "Stinger");
    }
    @Override
    public void startEngine(){
        System.out.println("Kia Stinger Engine Starting...");
    }
    @Override
    public void accelerate(){
        System.out.println("Kia Stinger going at 130km/h");
    }

    @Override
    public void brake(){
        System.out.println("Kia Stinger taking a brake in 0.9 seconds");
    }
}

public class mainCar {
    public static void main(String[] args) {
        Car car = randomCar();
        System.out.println("The Car is: " + car.getName());
        car.startEngine();
        car.accelerate();
        car.brake();
        System.out.println("Testing for Git");
    }
    public static Car randomCar(){
        int randCarGen = (int) (Math.random()*2)+1;
        System.out.println("Random Number is: " + randCarGen);

        switch(randCarGen) {
            case 1:
                return new BMW();
            case 2:
                return new Kia();
            default:
                return null;
        }
    }
}
