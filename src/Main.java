import engeto.hotel.Host;
import engeto.hotel.Pokoj;
import engeto.hotel.Rezervace;
import engeto.hotel.TypPobytu;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Host host1 = new Host("Adéla","Malíková", LocalDate.of(1993,3,13));
        Host host2 = new Host("Jan","Dvořáček",LocalDate.of(1995,5,5));

        host2.setDatumNarozeni(LocalDate.of(1995,4,5));

        host2.getHost();

        Pokoj pokoj1 = new Pokoj(1,1,true,true,1000);
        Pokoj pokoj2 = new Pokoj(2,1,true,true,1000);
        Pokoj pokoj3 = new Pokoj(3,3,false,true,2400);

        Rezervace rezervace1 = new Rezervace(pokoj1,LocalDate.of(2021,7,19),LocalDate.of(2021,7,26), TypPobytu.PRAC,host1);
        Rezervace rezervace2 = new Rezervace(pokoj3,LocalDate.of(2021,9,3),LocalDate.of(2021,9,14),TypPobytu.REKRE,host1);
        rezervace2.addHost(host2);

        ArrayList<Rezervace> seznamRezervaci = new ArrayList<>();
        seznamRezervaci.add(rezervace1);
        seznamRezervaci.add(rezervace2);



        for (Rezervace rezervace : seznamRezervaci) {
            System.out.println(rezervace.getRezervace());
        }
    }
}