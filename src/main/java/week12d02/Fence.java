package week12d02;

public enum Fence {
    PERFECT(0), NEED_UPGRADE(0), NO_FENCE(0);

    private int sold;

    Fence(int sold) {
        this.sold = sold;
    }

    public int getSold() {
        return sold;
    }

    protected void setSold(int sold) {
        this.sold = sold;
    }

    @Override
    public String toString() {
        return sold + " " + name();
    }
}
