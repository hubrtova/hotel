package engeto.hotel;

import java.math.BigDecimal;

public class Pokoj {
    private int cisloPokoje;
    private int pocetLuzek;
    private boolean balkon;
    private boolean vyhledNaMore;
    private BigDecimal cenaPokojDen;

    public Pokoj(int cisloPokoje, int pocetLuzek, boolean balkon, boolean vyhledNaMore, BigDecimal cenaPokojDen) {
        this.cisloPokoje = cisloPokoje;
        this.pocetLuzek = pocetLuzek;
        this.balkon = balkon;
        this.vyhledNaMore = vyhledNaMore;
        this.cenaPokojDen = cenaPokojDen;
    }


    public Pokoj(int cisloPokoje, int pocetLuzek, boolean balkon, boolean vyhledNaMore) {
        this(cisloPokoje,pocetLuzek,balkon,vyhledNaMore,pompom.celkovaCenaPokoje(balkon,vyhledNaMore));
    }

    public int getCisloPokoje() {
        return cisloPokoje;
    }

    public void setCisloPokoje(int cisloPokoje) {
        this.cisloPokoje = cisloPokoje;
    }

    public int getPocetLuzek() {
        return pocetLuzek;
    }

    public void setPocetLuzek(int pocetLuzek) {
        this.pocetLuzek = pocetLuzek;
    }

    public boolean isBalkon() {
        return balkon;
    }

    public void setBalkon(boolean balkon) {
        this.balkon = balkon;
    }

    public boolean isVyhledNaMore() {
        return vyhledNaMore;
    }

    public void setVyhledNaMore(boolean vyhledNaMore) {
        this.vyhledNaMore = vyhledNaMore;
    }

    public BigDecimal getCenaPokojDen() {
        return cenaPokojDen;
    }

    public void setCenaPokojDen(BigDecimal cenaPokojDen) {
        this.cenaPokojDen = cenaPokojDen;
    }
}
