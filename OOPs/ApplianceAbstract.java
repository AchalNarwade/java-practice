abstract class Appliance{
 
    abstract void turnOn();

    int powerConsumption(){
        return 100;
    }

    int timer(int hours){
        return powerConsumption() * hours;

    }
}

// Child class 
class Fan extends Appliance{
    void turnOn(){
        System.out.println("Fan starts spinning");
    }

    int powerConsumption(){
        return 75;
    }
}

//Another child class
class Heater extends Appliance{
   
    void turnOn(){
        System.out.println("Heater is heating");
    }
    int powerConsumption(){
        return 1500;
    }
}

public class ApplianceAbstract{
    public static void main(String[] args){

    //Using Abstraction
    Appliance a1 = new Fan();
    Appliance a2 = new Heater();

    //fan
    a1.turnOn();
        System.out.println("Power: " + a1.powerConsumption() + " watts");
        System.out.println("Energy for 5 hours: " + a1.timer(5) + " watt-hours");
        System.out.println();

    //heater
        a2.turnOn();
        System.out.println("Power: " + a2.powerConsumption() + " watts");
        System.out.println("Energy for 2 hours: " + a2.timer(2) + " watt-hours");
   
    }
}