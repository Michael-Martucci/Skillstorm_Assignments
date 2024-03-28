package assignments.week3.Day4;

public class GasTank  implements Fillable{ // implement interface
    private final double GALLONS;

    private double gas;

    public GasTank (double gallons) { // constructor to create GasTank object
        this.GALLONS = gallons;
    }

    
    public double getGALLONS() { // this constructor gets the volume of gas tank for the object
        return GALLONS;
    }


    public double getGas() { // this method sets the amount of gas filled
        return gas;
    }


    public void setGas(double gas) {// this method sets the amount of gas filled
        this.gas = gas;
    }


    @Override
    public void empty() { // determines how much gas has been removed from the tank
        gas = 0;
        
    }

    @Override
    public void empty(double quantity) { // if statement so the minimum gas amount can't be less than 0
        if (quantity >= 0 && quantity <= gas) {
            gas -= quantity;
        } 
    }

    @Override
    public void fill() { // fills the object with amount of gas
       gas = GALLONS;
        
    }

    @Override
    public void fill(double quantity) {
        if (quantity > 0 && quantity <=GALLONS) { // if statement so the amount of gas cannot exceed the tank capacity
            gas = quantity;


        }
        
    }
public static void main(String ...args) {

    GasTank car = new GasTank(12);
    System.out.println(car.getGas() + "gallons");
     car.fill(6);
     System.out.println(car.getGas()+ "gallons");

     car.empty(3);
     System.out.println("When you drove, you used " + car.getGas()+ "gallons");


    
}
    
}