import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] Arr = {123456, 1234567, 4567, 987654, 123456789};
        Arrays.sort (Arr);
        for (int j : Arr) {
            System.out.println(j);
        }
    }
}

