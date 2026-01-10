package vendingMachine;

public class Payment {
    private double totalInserted = 0d;
    public void insertMoney(double amount){
        totalInserted += amount;
    }
    public double getMoney(){
        return totalInserted;
    }
    public double returnChange(double price){
        return totalInserted-price;
    }
    public void reset(){
        totalInserted = 0;
    }
}
