package vendingMachine;

public interface State {
    void selectProduct(String productId);
    void insertMoney(double money);
    void dispense();
}
