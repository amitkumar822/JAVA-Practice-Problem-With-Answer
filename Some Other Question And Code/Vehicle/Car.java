package Vehicle;

public class Car extends Vehicle{
    int numGears;


    boolean isConvertible;

    public void carprint(){
        super.print();
        System.out.println("Car Color : "+color);
        System.out.println("Car Speeds : "+getMaxSpeed());
        System.out.println("Car Gears : "+numGears);
        System.out.println("Car Convertible : "+isConvertible);
    }
}
