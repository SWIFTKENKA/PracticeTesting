package GUI.PracticeTesting;

public class TableView_Product {

    private String name;
    private double price;
    private int quantity;

    public TableView_Product() {
        this.name = "";
        this.price = 0.00;
        this.quantity = 0;
    }

    public TableView_Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //todo MUST FOLLOW NAMING CONVECTION

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
