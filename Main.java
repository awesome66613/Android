import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayi = {1, 0, 1, 0, 1, 0, 1, 0, 0, 1};
        int[] arrayy = new int[8];

        int[] arrayo = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        int[] arrayu = {1, 55, 3, 14, 11, 4, 71, 2, 4, 8, 9, 1};


    }

    public static void arrayone(int[] arrayi) {
        for (int i = 0; i < arrayi.length; i++) {
            arrayi[i] = (arrayi[i] > 0) ? 0 : 1;
        }

    }

    public static void arraytwo(int[] arrayy) {
        for (int i = 0; i < arrayy.length; i++) {
            arrayy[i] = (3 * i) + 1;
        }
    }

    public static void arraythree(int[] arrayo) {
        for (int i = 0; i < arrayo.length; i++) {
            arrayo[i] = (arrayo[i] < 6) ? arrayo[i] * 2 : arrayo[i];
        }
    }

    public static void arraythoe(int[] arrayu) {
        int a = 0;
        for (int i = 0; i < arrayu.length; i++) {
            a = (a < arrayu[i]) ? arrayu[i] : a;
        }

        System.out.println(a);
    }
}

