package engeto.hotel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Host {
    private String jmeno;
    private String prijmeni;
    private LocalDate datumNarozeni;

    public Host(String jmeno, String prijmeni, LocalDate datumNarozeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.datumNarozeni = datumNarozeni;
    }

    public Host(String jmeno, String prijmeni) {
        this(jmeno,prijmeni,LocalDate.MIN);

    }

    public Host(String prijmeni) {
        this("",prijmeni);
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    @Override
    public String toString() {
        String narozen;
        if (getDatumNarozeni() != LocalDate.MIN) {narozen = " narozen/a: " + pompom.datumCZ(getDatumNarozeni());}
        else {narozen = "";}
        return getJmeno() + " " + getPrijmeni() + narozen;
    }

}
