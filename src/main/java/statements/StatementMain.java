package statements;

public class StatementMain {
    public static void main(String[] args) {
        int x = 5 + 6;
        int y = 11 - x;
        int z = 8;
        boolean b = x > y;
        boolean c = b == true || z > 5; //solutions:boolean c = b || (z > 5); -- b = true csak ebben a feladatban. Minek a zárójel? Elvileg kiértékeli a belső kifejezéseket
        z++;
    }
}
