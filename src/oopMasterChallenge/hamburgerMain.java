package oopMasterChallenge;

class Hamburger{
    private String rollType;
    private String meat;
    private double basePrice;
    private boolean lettus;
    private boolean tomatoe;
    private boolean carrot;
    private boolean pickle;
    private String burgerName;

    public Hamburger(String rollType, String meat) {
        this.rollType = rollType;
        this.meat = meat;
        this.basePrice = 5.50;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double currentBurgerPrice(boolean lettus, boolean tomatoe, boolean carrot, boolean pickle){
        if(lettus) this.basePrice+=0.50;
        if(tomatoe) this.basePrice += 0.75;
        if(carrot) this.basePrice += 0.25;
        if(pickle) this.basePrice += 0.90;
        return this.basePrice;
    }
}

class healthyBurger extends Hamburger{
    private boolean onion;
    private boolean pepper;

    public healthyBurger(String meat) {
        super("rye bread", meat);
        super.setBasePrice(6.00);
    }


    @Override
    public double currentBurgerPrice(boolean lettus, boolean tomatoe, boolean carrot, boolean pickle) {
        double price = super.currentBurgerPrice(lettus, tomatoe, carrot, pickle);
        return price += 2.00; //additional price for healthy burger
    }

    public double currentBurgerPrice(boolean lettus, boolean tomatoe, boolean carrot, boolean pickle, boolean onion, boolean pepper) {
        double price = super.currentBurgerPrice(lettus, tomatoe, carrot, pickle);
        price += 2.00;
        if(onion) price += 0.35;
        if(pepper) price += 0.15;
        return price;
    }
}

class deluxeBurger extends Hamburger{
    private boolean chips;
    private boolean drink;

    public deluxeBurger(String rollType, String meat) {
        super(rollType, meat);
        this.chips = true;
        this.drink = true;
    }

    @Override
    public double getBasePrice() {
        double price = super.getBasePrice();
        price += 3.50; //price of chips and drink is added
        return price;
    }

    @Override
    public double currentBurgerPrice(boolean lettus, boolean tomatoe, boolean carrot, boolean pickle) {
        double finalPrice = getBasePrice() + super.currentBurgerPrice(lettus, tomatoe, carrot, pickle);
        return finalPrice;
    }
}

public class hamburgerMain {
    public static void main(String[] args) {
        Hamburger burger = new deluxeBurger("random roll", "Chicken");
        double price = burger.currentBurgerPrice(true, true, true, false);
        System.out.println(price);

    }
}
