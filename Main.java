import java.util.Arrays;
public class Main {

    public static void main(String args[]) {
        A obj = new B();



    }
    public static boolean equalArr(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    static int MysteryFunction(int argA, int argB) {
        int c = 1;
        int d = argA;
        int e = argB;

        while (e > 0) {
            if (2 * (e / 2) != e) {
                c = c * d;
            }
            d = d * d;
            e = e / 2;
        }
        return c;
    }
}
