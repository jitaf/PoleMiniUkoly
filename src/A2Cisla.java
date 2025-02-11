import java.util.Scanner;

public class A2Cisla {
    public void nactiANajdiMin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadej počet čísel: ");
        int N = sc.nextInt();
        double[] cisla = new double[N];
        double min = Double.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            System.out.print("Zadej číslo: ");
            cisla[i] = sc.nextDouble();
            if (cisla[i] < min) min = cisla[i];
        }
        System.out.println("Nejmenší číslo je: " + min);
    }
}
