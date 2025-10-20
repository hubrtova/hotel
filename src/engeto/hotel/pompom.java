package engeto.hotel;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class pompom {
    public static String datumCZ(LocalDate datum){
        DateTimeFormatter formatCZ = DateTimeFormatter.ofPattern("d.M.yyyy");
        return datum.format(formatCZ);
    }

    public static int cenaPokoje(){
        return 500;
    }

    public static BigDecimal koeficientBalkon(){
        return BigDecimal.valueOf(1,1);
    }

    public static BigDecimal koeficienVyhledNaMore(){
        return BigDecimal.valueOf(1,2);
    }

    public static BigDecimal celkovaCenaPokoje(boolean balkon,boolean vyhledNaMore){
        BigDecimal koeficientBalkon = BigDecimal.valueOf(1);
        BigDecimal koefiecientVyhledNaMore = BigDecimal.valueOf(1);

        if (balkon){koeficientBalkon = koeficientBalkon();}
        if (vyhledNaMore){koefiecientVyhledNaMore = koeficienVyhledNaMore();}

        return BigDecimal.valueOf(cenaPokoje()).multiply(koeficientBalkon).multiply(koefiecientVyhledNaMore);

    }

}
