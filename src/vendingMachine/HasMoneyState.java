package vendingMachine;

public class HasMoneyState implements State {
    private VendingMachine machine;
    public HasMoneyState(VendingMachine machine){
        this.machine = machine;
    }

    @Override
    public void selectProduct(String productId) {

    }

    @Override
    public void insertMoney(double money) {

    }

    @Override
    public void dispense() {

    }
}
