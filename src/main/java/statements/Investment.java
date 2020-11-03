package statements;

public class Investment {
    private double cost;
    private int fund;
    private int interestRate;
    private boolean active;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        active = true;
    }

    public int getFund() {
        return fund;
    }

    public double getYieald(int days) {
        return (double) getFund() * interestRate / 100 / 365 * days;
    }

    public double close(int days) {
        cost = (getFund() + getYieald(days)) * 0.003;
        double withdraw = active ? (getYieald(days) + getFund() - cost) : 0;
        active = false;
        return withdraw;
    }
}
