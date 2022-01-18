import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    new Main().run();


    }

    private void run() {
        Random random = new Random();
        int[] mass = fillMass();
        int j = 1;
        int maxJ = mass[0];
        while(j < mass.length){
            if(mass[j]>maxJ) maxJ = mass[j];
                j++;
        }
        System.out.println(maxJ);



        }


    private int[] fillMass() {
        int n = new Scanner(System.in).nextInt();
      int[] mass = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            mass[i] = random.nextInt(100);
        }
        return mass;
    }
}
