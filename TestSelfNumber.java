import java.util.HashSet;
import java.util.Set;

public class TestSelfNumber {

    public static int d(int n){
        int totalN = n;
        while (n > 0) {
            totalN += n % 10;
            n /= 10;
        }
        return totalN;
    }

    public static void main(String[] args) {

        Set<Integer> generate = new HashSet<>();
        for (int i = 1; i <= 75; i++){
            int total = d(i);
            if (total <= 75) {
                generate.add(total);
            }
        }

        for (int i = 1; i <= 75; i++){
            if (!generate.contains(i)) {
                System.out.println(i + " ");
            }
        }
    }


}
