package J29_1;

import java.util.ArrayList;

public class PracownikController {

    ArrayList<Pracownik> listaPracownik = new ArrayList<>();


    public void dodajPracownika(String imie, String nazwisko, String kontrakt, double pensja){
       Pracownik obj = new Pracownik(imie, nazwisko, kontrakt, pensja);
       this.listaPracownik.add(obj);

    }


    public void dodajPracownika(String imie, String nazwisko){
        Pracownik obj = new Pracownik(imie, nazwisko);
        this.listaPracownik.add(obj);

    }


    public void pokazPracownikow(){
        for (Pracownik tmp : listaPracownik){
            System.out.println("Imię: "+ tmp.getImie()+", Nazwisko: "+tmp.getNazwisko()+ ", Kontrakt: "+ tmp.getKontrakt()+ ", Pensja: "+ tmp.getPensja()+" zł");
        }
    }

    public void usunPracownika(String nazwisko){
        for (Pracownik tmp : listaPracownik){
            if (tmp.getNazwisko().equals(nazwisko)){
                listaPracownik.remove(tmp);
                break;
            }
        }
    }

    public void zmienKontrakt(String nazwisko, double pensja){
        for (Pracownik tmp : listaPracownik){
            if (tmp.getNazwisko().equals(nazwisko)){
                tmp.setKontrakt("etat");
                tmp.setPensja(pensja);
            }
        }
    }
}
