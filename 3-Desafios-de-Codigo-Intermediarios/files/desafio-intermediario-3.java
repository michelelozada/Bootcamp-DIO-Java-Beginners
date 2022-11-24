import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        int res, count;
        int[] d = new int[n + 1];

        for (int i = 1; i < d.length; i++) {
            if (i * i <= n) {
                d[i] = i * i;
            } else {
                i = d.length - 1;
            }
        }

        int countTotal = 1000;

        for (int i = d.length - 1; i > 0 && i <= n; i--) {
            if (i > 0 && d[i] > 0) {
                res = n;
                count = 0;
                for (int j = i; j > 0; j--) {
                    while (res > 0) {
                        if (res >= d[j]) {
                            res = res - d[j];
                            count++;
                        } else {
                            j--;
                        }
                    }
                }
                if (countTotal > count) {
                    countTotal = count;
                }
            }
        }
        System.out.println("O menor número de quadrados perfeitos é:\n" + countTotal);
    }
}