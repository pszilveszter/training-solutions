package classstructureconstructors;

public class Store {
    private String product;
    private int stock;

    public void store(int increase) {
        setStock(this.stock = this.stock + increase);
    }
    public void dispatch(int decrease) {
        setStock(stock = this.stock - decrease);
    }

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
