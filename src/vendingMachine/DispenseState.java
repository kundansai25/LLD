package vendingMachine;

public class DispenseState implements State{
    private VendingMachine machine;
    public DispenseState(VendingMachine machine){this.machine = machine;};

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
