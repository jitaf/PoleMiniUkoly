import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // A1
        A1Cisla cisla = new A1Cisla();
        cisla.nactiCisla();
        cisla.vypisSuda();

        // A2
        A2Cisla cislaMin = new A2Cisla();
        cislaMin.nactiANajdiMin();

        // A3
        A3Cisla cp = new A3Cisla();
        System.out.print("Kolik čísel zadáš? ");
        int N = sc.nextInt();
        sc.nextLine();
        int[] pole = cp.nactiCisla(N);
        System.out.println("Průměr: " + cp.urciPrumer(pole));

        // A4
        A4Slova slova = new A4Slova();
        slova.nactiASuda();

        // A5
        A5Knihovna knihovna = new A5Knihovna();
        knihovna.nactiKnihy();
        knihovna.vypisKnihy();


        // B1: Knihy
        B1Kniha[] knihy = new B1Kniha[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Zadej název knihy: ");
            String nazev = sc.nextLine();
            System.out.print("Zadej počet stran: ");
            int stran = sc.nextInt();
            sc.nextLine();
            knihy[i] = new B1Kniha(nazev, stran);
        }

        int suma = 0;
        for (B1Kniha kniha: knihy) {
            suma = suma + kniha.getPocetStran();
        }

        System.out.println("Průměrný počet stran: " + (suma/3.0));






        // B2: Student
        B2Student[] studenti = new B2Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Zadej jméno studenta: ");
            String jmeno = sc.nextLine();
            System.out.print("Zadej průměr: ");
            double prumer = sc.nextDouble();
            sc.nextLine();
            studenti[i] = new B2Student(jmeno, prumer);
        }

        B2Student nejlepsi = studenti[0];
        for (B2Student student: studenti) {
            if (student.getPrumer() < nejlepsi.getPrumer()) {
                nejlepsi = student;
            }
        }

        System.out.println("Nejlepší student: " + nejlepsi.getJmeno());

        // B3: Autobusy
        B3Autobus[] autobusy = new B3Autobus[3];
        B3Autobus nejviceMista = null;
        for (int i = 0; i < 3; i++) {
            System.out.print("Zadej kapacitu autobusu: ");
            int kapacita = sc.nextInt();
            System.out.print("Zadej počet cestujících: ");
            int cestujici = sc.nextInt();
            autobusy[i] = new B3Autobus(kapacita, cestujici);
            if (nejviceMista == null || (kapacita - cestujici) > (nejviceMista.getKapacita() - nejviceMista.getCestujici())) {
                nejviceMista = autobusy[i];
            }
        }
        System.out.println("Autobus s nejvíce volnými místy má kapacitu " + nejviceMista.getKapacita() + " a " + (nejviceMista.getKapacita() - nejviceMista.getCestujici()) + " volných míst.");

        // B4: Filmy
        B4Film[] filmy = new B4Film[4];
        int celkovaDelka = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print("Zadej název filmu: ");
            String nazev = sc.next();
            System.out.print("Zadej délku filmu (v minutách): ");
            int delka = sc.nextInt();
            filmy[i] = new B4Film(nazev, delka);
            celkovaDelka += delka;
        }
        System.out.println("Celková délka filmů: " + celkovaDelka + " minut.");

        // B5: Barvy
        B5Barva[] barvy = new B5Barva[4];
        B5Barva nejkratsiKod = null;
        for (int i = 0; i < 4; i++) {
            System.out.print("Zadej název barvy: ");
            String nazev = sc.next();
            System.out.print("Zadej kód barvy: ");
            String kod = sc.next();
            barvy[i] = new B5Barva(nazev, kod);
            if (nejkratsiKod == null || kod.length() < nejkratsiKod.getKod().length()) {
                nejkratsiKod = barvy[i];
            }
        }
        System.out.println("Barva s nejkratším kódem: " + nejkratsiKod.getNazev() + " (" + nejkratsiKod.getKod() + ")");


    }
}