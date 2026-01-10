package vendingMachine;

public class IdleState implements State{
    private VendingMachine machine;
    public IdleState(VendingMachine machine){
        this.machine = machine;
    }
    public void selectProduct(String productId){
        machine.selectProduct(productId);
    }
    public void insertMoney(double money){
        throw new IllegalStateException("Select Product First");
    }
    public void dispense(){
        throw new IllegalStateException("No Product selected");
    }
}
