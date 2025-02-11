import java.util.Scanner;

public class A5Knihovna {
    private String[] knihy;
    private int pocetZamestnancu;

    public void nactiKnihy() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadej počet knih: ");
        int N = sc.nextInt();
        sc.nextLine(); // Ošetření newline
        knihy = new String[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Zadej název knihy: ");
            knihy[i] = sc.nextLine();
        }
    }

    public void vypisKnihy() {
        System.out.println("Knihy v knihovně:");
        for (String kniha : knihy) {
            System.out.println(kniha);
        }
    }
}
