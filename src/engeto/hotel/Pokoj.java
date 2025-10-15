package engeto.hotel;

public class Pokoj {
    private int cisloPokoje;
    private int pocetLuzek;
    private boolean balkon;
    private boolean vyhledNaMore;
    private double cenaPokojDen;

    public Pokoj(int cisloPokoje, int pocetLuzek, boolean balkon, boolean vyhledNaMore, double cenaPokojDen) {
        this.cisloPokoje = cisloPokoje;
        this.pocetLuzek = pocetLuzek;
        this.balkon = balkon;
        this.vyhledNaMore = vyhledNaMore;
        this.cenaPokojDen = cenaPokojDen;
    }


    public Pokoj(int cisloPokoje, int pocetLuzek, boolean balkon, boolean vyhledNaMore) {
           this(cisloPokoje,pocetLuzek,balkon,vyhledNaMore,1000);
    }

    public Pokoj(int cisloPokoje, int pocetLuzek) {
          this(cisloPokoje,pocetLuzek,false,false,1000);
    }

    public Pokoj(int cisloPokoje, int pocetLuzek,double cenaPokojDen) {
        this(cisloPokoje,pocetLuzek,false,false,cenaPokojDen);
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

    public double getCenaPokojDen() {
        return cenaPokojDen;
    }

    public void setCenaPokojDen(double cenaPokojDen) {
        this.cenaPokojDen = cenaPokojDen;
    }
}
