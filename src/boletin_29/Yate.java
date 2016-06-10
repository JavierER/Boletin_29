package boletin_29;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Yate extends Barco {

    private int nCamarotes;
    private int potencia;

    Yate(String matricula, int nCamarotes, int potencia) {
        super(matricula);
        this.nCamarotes = nCamarotes;
        this.potencia = potencia;
    }

    @Override
    void calcularAlquiler(int nDias, int eslora) {
        int modulo = eslora * 10 + nCamarotes + potencia;
        JOptionPane.showMessageDialog(null, "Matrícula: " + super.getMatricula() + "\nEslora: " + eslora + "m" + "\nPrecio: "
                + modulo * nDias + "€");
    }
}
