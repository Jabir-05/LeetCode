
import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static boolean IsHappyNymber(int n) {
        Set<Integer> seen = new HashSet<>();
        while (true) {
            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;

            }
            if (sum == 1) {
                return true;
            }
            if (seen.contains(sum)) {
                return false;

            }
            seen.add(sum);
            n = sum;
        }
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(IsHappyNymber(n));
    }
}
