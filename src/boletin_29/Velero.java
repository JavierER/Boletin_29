package boletin_29;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Velero extends Barco {

    private int nMastiles;

    public Velero(String matricula, int nMastiles) {
        super(matricula);
        this.nMastiles = nMastiles;
    }

    @Override
    void calcularAlquiler(int nDias, int eslora) {
        int modulo = eslora * 10 + nMastiles;
        JOptionPane.showMessageDialog(null, "Matrícula: " + super.getMatricula() + "\nEslora: " + eslora + "m" + "\nPrecio: "
                + modulo * nDias + "€");
    }
}
