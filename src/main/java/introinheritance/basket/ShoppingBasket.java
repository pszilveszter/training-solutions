package introinheritance.basket;

public class ShoppingBasket {

    private Basket basket = new Basket();

    public void addItem(Item item) {
        basket.addItem(item);
    }

    public void removeItem(String barcode) {
        basket.removeItem(barcode);
    }

    // az összes tételre
    public double sumNettoPrice() {
        double sum = 0;
        for (Item i : basket.getItems()) {
            sum += i.getNettoPrice();
        }
        return sum;
    }

    // az összes tételre
    public double sumTaxValue() {
        double sum = 0;
        for (Item i : basket.getItems()) {
            sum += i.getTaxAmount();
        }
        return sum;
    }

    public double sumBruttoPrice() {
        return sumNettoPrice() + sumTaxValue();
    }

    // befejezzük a vásárlást, a kosár ürítése
    public void checkout() {
        basket.clearBasket();
    }

    // kikeresi és eltávolítja a kosárból a legdrágább tételt
    public void removeMostExpensiveItem() {
        Item mostExpensive = null;
        for (Item i: basket.getItems()) {
            if (mostExpensive == null || i.getNettoPrice() > mostExpensive.getNettoPrice()) {
                mostExpensive = i;
            }
        }
        if (mostExpensive != null) {
            basket.removeItem(mostExpensive.getBarcode());
        }
    }
}
