package J29_1;

public class Pracownik {

    private String imie;
    private String nazwisko;
    private String kontrakt = "staż";
    private double pensja = 1000.00;

    public Pracownik(String imie, String nazwisko, String kontrakt, double pensja){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.kontrakt = kontrakt;
        this.pensja = pensja;

    }

    public Pracownik(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;

    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getKontrakt() {
        return kontrakt;
    }

    public void setKontrakt(String kontrakt) {
        this.kontrakt = kontrakt;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", kontrakt='" + kontrakt + '\'' +
                ", pensja=" + pensja +
                '}';
    }
}
