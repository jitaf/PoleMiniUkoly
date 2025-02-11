import java.util.Scanner;

public class A1Cisla {
    private int N;
    private double[] cisla;

    public void nactiCisla() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadej počet čísel: ");
        N = sc.nextInt();
        cisla = new double[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Zadej číslo: ");
            cisla[i] = sc.nextDouble();
        }
    }

    public void vypisSuda() {
        System.out.println("Čísla na sudých pozicích:");
        for (int i = 0; i < N; i += 2) {
            System.out.println(cisla[i]);
        }
    }
}
