package OOPS;
class CoffeeMachine{
    private double coffeeQty;
    private double milkQty;
    private double waterQty;
    private double sugarQty;
    static private int count = 1;
    static private CoffeeMachine c = null;

    private CoffeeMachine(){
        coffeeQty =1;
        milkQty = 1;
        waterQty=1;
        sugarQty=1;
    }

    public void fillSugar(double sugar){
        sugarQty = sugar;
    }

    public void fillWater(double water){
        waterQty = water;
    }

    public void fillCoffee(double coffee){
        coffeeQty = coffee;
    }
    public void fillMilk(double milk){
        milkQty = milk;
    }

    static public CoffeeMachine getInstance(){
        if(count <= 5){
            count++;
            c=new CoffeeMachine();
        }
        return c;
    }
}

public class singletonClass {
    public static void main(String args[]){
        CoffeeMachine c1 = CoffeeMachine.getInstance();
        CoffeeMachine c2 = CoffeeMachine.getInstance();
        CoffeeMachine c3 = CoffeeMachine.getInstance();
        CoffeeMachine c4 = CoffeeMachine.getInstance();
        CoffeeMachine c5 = CoffeeMachine.getInstance();
        CoffeeMachine c6 = CoffeeMachine.getInstance();
        System.out.println(c1+" "+c2+" "+c3+" "+c4+" "+c5+" "+c6);

    }
}
