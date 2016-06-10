package boletin_29;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Boletin_29 {

    public static void main(String[] args) {
        ArrayList<Barco> barcos = new ArrayList();
        barcos.add(new Velero("nrngrd", 5));
        barcos.add(new Yate("bfdbfdfhrt", 3, 50));
        barcos.add(new EmbarcacionDeportiva("nvrngireg", 100));
        for (Barco b : barcos) {
            b.calcularAlquiler(5, 100);
        }
    }
}
