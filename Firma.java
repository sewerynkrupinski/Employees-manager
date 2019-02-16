package J29_1;

import java.util.Scanner;

public class Firma extends PracownikController {

    private String nazwaFirmy;
    Scanner sc = new Scanner(System.in);

    public Firma (String nazwaFirmy){
        this.nazwaFirmy = nazwaFirmy;
        this.menu();
    }

    public void menu(){

        while(true){
            System.out.println("Witaj w firmie: "+this.nazwaFirmy);
            System.out.println("D-dodaj, P-pokaż, U-usuń, Z-zmiana kontraktu, K-koniec");
            String dec = sc.nextLine().toUpperCase();

            if (dec.equals("D")){
                System.out.println("Podaj imię pracownika");
                String imie = sc.nextLine();

                System.out.println("Podaj nazwisko pracownika");
                String nazwisko = sc.nextLine();

                System.out.println("Kopgo dodajesz: S-stażysta, E-etatowiec");
                String typ = sc.nextLine().toUpperCase();

                if (typ.equals("S")){
                    this.dodajPracownika(imie, nazwisko);
                }

                else if (typ.equals("E")){
                    System.out.println("Podaj wysokość pensji");
                    double pensja = sc.nextDouble();
                    sc.nextLine();

                    this.dodajPracownika(imie, nazwisko, "etat", pensja);
                }


            }

            else if(dec.equals(("P"))){
                this.pokazPracownikow();

            }

            else if(dec.equals("U")){

                System.out.println("Podaj nazwisko pracownika do usunięcia ");
                String nazwisko = sc.nextLine();
                this.usunPracownika(nazwisko);

            }

            else if(dec.equals("Z")){
                System.out.println("Podaj nazwisko pracownika któremu chcesz zmnienić kontrakt ");
                String nazwisko = sc.nextLine();
                System.out.println("Podaj nową wysokość pensji");
                double pensja = sc.nextDouble();
                sc.nextLine();
                this.zmienKontrakt(nazwisko, pensja);

            }

            else if (dec.equals("K"))
                break;

        }
    }
}



