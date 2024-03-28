package assignments.week3.Day4;

public class CoffeeMug implements Fillable{
    private final double OUNCES;

    private double coffee;

    public CoffeeMug(double ounces) { // coffee was spelled wrong and it took me waaay to long to realize
        this.OUNCES = ounces;
    }


    public double getOUNCES() {
        return OUNCES;
    }

    public double getCoffee() {
        return coffee;
    }

    public void setCoffee(double coffee) {
        this.coffee = coffee;
    }

    @Override
    public void fill() {
        coffee = OUNCES;
    }

    @Override
    public void fill(double quantity) {
        if (quantity > 0 && quantity <=OUNCES) { // if statement so the amount of gas cannot exceed the tank capacity
            coffee = quantity;
    }
}

    @Override
    public void empty() {
        coffee = 0;
    }

    @Override
    public void empty(double quantity) {
        if (quantity >= 0 && quantity <= coffee) {
            coffee -= quantity;
    }
}
}
