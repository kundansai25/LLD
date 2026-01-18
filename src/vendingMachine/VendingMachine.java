package vendingMachine;

public class VendingMachine {
    private State idleState;
    private State hasMoneyState;
    private State dispenseState;
    private State currentState;
    private Inventory inventory;
    private Payment payment;
    private Product selectedProduct;

    public VendingMachine(){
        inventory = new Inventory();
        payment = new Payment();
        selectedProduct = new Product();
        idleState = new IdleState(this);
        hasMoneyState = new HasMoneyState(this) ;
        dispenseState = new DispenseState(this);
        currentState = idleState;
    }

    public void selectProduct(String id){
        currentState.selectProduct(id);
    }

    public void insertMoney(double money){
        currentState.insertMoney(money);
    }

    public void dispense(){
        currentState.dispense();
    }
}
