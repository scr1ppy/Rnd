import java.util.Random;

public class Main {

    public static void main(String[] args) {
    new Main().run();


    }

    private void run() {
        Random random = new Random();
        int[] mass = fillMass(20);
        int j = 1;
        int maxJ = mass[0];
        if (j < mass.length) {
            do {
                if (mass[j] > maxJ) maxJ = mass[j];
                j++;
            } while (j < mass.length);
        }
        System.out.println(maxJ);



        }


    private int[] fillMass(int n) {
      int[] mass = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            mass[i] = random.nextInt(100);
        }
        return mass;
    }
}
