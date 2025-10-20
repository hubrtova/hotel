package engeto.hotel;

import java.util.ArrayList;
import java.util.List;

public class SeznamRezervaci {
    private List<Rezervace> seznamRezervaci;

    public SeznamRezervaci() {
        this.seznamRezervaci = new ArrayList<>();
    }

    public void addRezervace(Rezervace rezervace) {

        seznamRezervaci.add(rezervace);
    }

    public void removeRezervace(Rezervace rezervace) {

        seznamRezervaci.remove(rezervace);
    }

    public Rezervace getRezervace(int index) {
        return seznamRezervaci.get(index);
    }

    public List<Rezervace> getSeznamRezervaci() {
        return new ArrayList<>(seznamRezervaci);
    }

    public void clearSeznamRezervaci() {
        this.seznamRezervaci.clear();
    }

    public int getPocetRezervaci(TypPobytu typPobytu) {
        int pocetRezervaci = 0;
        for (Rezervace rezervace : seznamRezervaci) {
            if (rezervace.getTypPobytu() == typPobytu || typPobytu == null) {
                pocetRezervaci++;
            }
        }
        return pocetRezervaci;
    }

    public double getPrumernyPocetHostu(TypPobytu typPobytu) {
        int pocetRezervaci = 0;
        int pocetHostu = 0;
        double prumernyPocetHustu = 0;
        for (Rezervace rezervace : seznamRezervaci) {
            if (rezervace.getTypPobytu() == typPobytu || typPobytu == null) {
                pocetRezervaci++;
                pocetHostu += rezervace.getPocetHostu();
            }
        }
        prumernyPocetHustu = pocetHostu / pocetRezervaci;
        return prumernyPocetHustu;
    }

    public String printTopRezervaci(TypPobytu typPobytu, int pocetRezervaci) {
        int i = 0;
            for (Rezervace rezervace : seznamRezervaci) {
                if (rezervace.getTypPobytu() == typPobytu || typPobytu == null) {
                     System.out.println(rezervace.toString());
                     i++;
                }
                if (i >= pocetRezervaci) {
                return "";
            }
        }
        return "";
    }

    public double printStatistikaHostu(TypPobytu typPobytu) {
        int host1 = 0;
        int host2 = 0;
        int hostVice = 0;
        for (Rezervace rezervace : seznamRezervaci) {
            if (rezervace.getTypPobytu() == typPobytu || typPobytu == null) {
                switch (rezervace.getPocetHostu()) {
                    case 1:
                        host1++; break;
                    case 2:
                        host2++; break;
                    default:
                        hostVice++;
                }
            }
        }
            System.out.println("Pocet rezervaci s jednym hostem je:" + host1);
            System.out.println("Pocet rezervaci se dvema hosty je:" + host2);
            System.out.println("Pocet rezervaci s vice nez dvema hosty je:" + hostVice);

        return 0;
    }

}
