class Vehicle{
    String color;
    double weight;

    Vehicle(String c,double w){
        color = c;
        weight = w;
    }
    void attribute(){
        System.out.println("Color is " + color);
        System.out.println("Weight is " + weight);
    }
}

class Car extends Vehicle{
    int gear;

    Car(String c,double w, int g){
        super(c,w);
        gear = g;
    }

    void attribute(){
        super.attribute();
        System.out.println("Gear " + gear);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Car mercedes_mayback = new Car("White", 550, 5);
        mercedes_mayback.attribute();
    }
}
