import java.util.Scanner;

public class A4Slova {
    public void nactiASuda() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadej počet slov: ");
        int N = sc.nextInt();
        sc.nextLine(); // Ošetření newline
        String[] slova = new String[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Zadej slovo: ");
            slova[i] = sc.nextLine();
        }
        System.out.println("Slova na sudých pozicích:");
        for (int i = 0; i < N; i += 2) {
            System.out.println(slova[i]);
        }
    }
}
