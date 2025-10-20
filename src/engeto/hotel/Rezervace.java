package engeto.hotel;

import com.sun.beans.introspect.PropertyInfo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Rezervace {
    private Pokoj pokoj;
    private LocalDate datumOd;
    private LocalDate datumDo;
    private TypPobytu typPobytu;
    private Host host;
    private List<Host> ostatniHoste = new ArrayList<>();

    public Rezervace(Pokoj pokoj, LocalDate datumOd, LocalDate datumDo, TypPobytu typPobytu, Host host) {
        this.pokoj = pokoj;
        this.datumOd = datumOd;
        this.datumDo = datumDo;
        this.typPobytu = typPobytu;
        this.host = host;
    }

    public Rezervace(Pokoj pokoj, Host host) {
        this(pokoj,LocalDate.now(),LocalDate.now().plusDays(6),TypPobytu.REKREACNI,host);
    }

    public Pokoj getPokoj() {
        return pokoj;
    }

    public void setPokoj(Pokoj pokoj) {
        this.pokoj = pokoj;
    }

    public LocalDate getDatumOd() {
        return datumOd;
    }

    public void setDatumOd(LocalDate datumOd) {
        this.datumOd = datumOd;
    }

    public LocalDate getDatumDo() {
        return datumDo;
    }

    public void setDatumDo(LocalDate datumDo) {
        this.datumDo = datumDo;
    }

    public TypPobytu getTypPobytu() { return typPobytu; }

    public void setTypPobytu(TypPobytu typPobytu) {
        this.typPobytu = typPobytu;
    }

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    public void addOstatniHost(Host host) {
        ostatniHoste.add(host);
    }

    public void removeOstatniHost(Host host) {
        ostatniHoste.remove(host);
    }

    public List<Host> getHoste() {
        return new ArrayList<>(ostatniHoste);
    }

    public int getPocetHostu() {
        return 1 + ostatniHoste.size();
    }

    public String getDatumOdDoCZ() {
        DateTimeFormatter formatCZ = DateTimeFormatter.ofPattern("d.M.yyyy");
        String datumOdCZ = getDatumOd().format(formatCZ);
        String datumDoCZ = getDatumDo().format(formatCZ);
        return "od " + datumOdCZ + " do " + datumDoCZ;
    }

    @Override
    public String toString() {
        return host.toString() + " si rezervoval/a pokoj číslo " + pokoj.getCisloPokoje() + " od " + pompom.datumCZ(datumOd) + " do " + pompom.datumCZ(datumDo);
    }


    public long getPocetNoci(){
        return getDatumOd().until(getDatumOd()).getDays();
    }

    public BigDecimal getCenaRezervace(){
        return pokoj.getCenaPokojDen().multiply(BigDecimal.valueOf(getPocetNoci()));
    }
}


