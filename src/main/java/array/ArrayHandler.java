package array;

public class ArrayHandler {
    public static boolean contains(int[] source, int itemToFind) {
        for (int i = 0; i < source.length; i++) {
            if (source[i] == itemToFind) return true;
        }
        return false;
    }

    public static int find(int[] source, int itemToFind) {
        if (contains(source, itemToFind)) {
            for (int i = 0; i < source.length; i++) {
                if (source[i] == itemToFind) return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Boolean a = contains(new int[] {1,2,3,4,5},3);
        System.out.println(a);
        Boolean b = contains(new int[] {1,2,3,4,5},8);
        System.out.println(b);

        int c = find(new int[] {1,2,3,4,5},3);
        System.out.println(c);
        int d = find(new int[] {1,2,3,4,5},9);
        System.out.println(d);
    }
}
