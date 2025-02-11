import java.util.Scanner;

public class A3Cisla {
    public int[] nactiCisla(int N) {
        Scanner sc = new Scanner(System.in);
        int[] pole = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Zadej číslo: ");
            pole[i] = sc.nextInt();
        }
        return pole;
    }

    public double urciPrumer(int[] pole) {
        int suma = 0;
        for (int num : pole) {
            suma = suma + num;
        }
        return (double) suma / pole.length;
    }
}
