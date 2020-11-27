package week03;

public class Operation {
    private int leftValue;
    private int rightValue;

    public Operation(String input) {
        leftValue = Integer.parseInt(input.substring(0,input.indexOf("+")));
        rightValue = Integer.parseInt(input.substring(input.indexOf("+")));
    }

    public int getResult() {
        return leftValue + rightValue;
    }

    public static void main(String[] args) {
        Operation op = new Operation("161+18");
        System.out.println(op.getResult());
    }
}
