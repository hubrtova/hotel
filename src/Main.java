import engeto.hotel.Host;
import engeto.hotel.Pokoj;
import engeto.hotel.Rezervace;
import engeto.hotel.TypPobytu;
import engeto.hotel.SeznamRezervaci;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Host host1 = new Host("Karel", "Dvořák", LocalDate.of(1990, 5, 15));
        Host host2 = new Host("Karel", "Dvořák", LocalDate.of(1979, 1, 3));
        Host host4 = new Host("Karolína", "Tmavá", LocalDate.of(2000, 2, 2));

        Pokoj pokoj2 = new Pokoj(2, 1, false, false);
        Pokoj pokoj3 = new Pokoj(3, 2, true, true);

        Rezervace rezervace1 = new Rezervace(pokoj3, LocalDate.of(2023, 6, 1), LocalDate.of(2023, 6, 7), TypPobytu.PRACOVNI, host1);
        Rezervace rezervace2 = new Rezervace(pokoj2, LocalDate.of(2023, 7, 18), LocalDate.of(2023, 7, 21), TypPobytu.REKREACNI, host2);
        Rezervace rezervace4 = new Rezervace(pokoj3, LocalDate.of(2023, 8, 1), LocalDate.of(2023, 8, 31), TypPobytu.PRACOVNI, host4);

        rezervace4.addOstatniHost(host1);

        SeznamRezervaci seznamRezervaci1 = new SeznamRezervaci();
        seznamRezervaci1.addRezervace(rezervace2);
        seznamRezervaci1.addRezervace(rezervace4);
        seznamRezervaci1.addRezervace(rezervace1);

        LocalDate datumOd = LocalDate.of(2023, 8, 1);
        for (int i = 1; i <= 10; i++) {
            Host host = new Host("fyziopacient" + i);
            Rezervace rezervace = new Rezervace(pokoj2, datumOd, datumOd.plusDays(1), TypPobytu.REKREACNI, host);
            seznamRezervaci1.addRezervace(rezervace);
            datumOd = datumOd.plusDays(2);
        }


        System.out.println("pocet rezervaci: " + seznamRezervaci1.getPocetRezervaci(null));
        System.out.println("prumerny pocet hostu: " + seznamRezervaci1.getPrumernyPocetHostu(TypPobytu.REKREACNI));
        seznamRezervaci1.printStatistikaHostu(TypPobytu.PRACOVNI);
        seznamRezervaci1.printTopRezervaci(TypPobytu.REKREACNI,4);



    }
}