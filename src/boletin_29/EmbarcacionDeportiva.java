package boletin_29;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class EmbarcacionDeportiva extends Barco {

    private int potencia;

    public EmbarcacionDeportiva(String matricula, int potencia) {
        super(matricula);
        this.potencia = potencia;
    }

    @Override
    void calcularAlquiler(int nDias, int eslora) {
        int modulo = eslora * 10 + potencia;
        JOptionPane.showMessageDialog(null, "Matrícula: " + super.getMatricula() + "\nEslora: " + eslora + "m" + "\nPrecio: "
                + modulo * nDias + "€");
    }
}
