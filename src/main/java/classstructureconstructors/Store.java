package classstructureconstructors;

public class Store {
    private String product;
    private int stock;

    public void store(int increase) { stock = stock + increase; }
    public void dispatch(int decrease) { stock = stock - decrease; }

    public Store(String product) {
        this.product = product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getProduct() {
        return product;
    }

    public int getStock() {
        return stock;
    }
}
