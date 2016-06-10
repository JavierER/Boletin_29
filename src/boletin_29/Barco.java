package boletin_29;

/**
 *
 * @author Usuario
 */
public abstract class Barco {

    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    Barco(String matricula) {
        this.matricula = matricula;
    }

    abstract void calcularAlquiler(int nDias, int slora);
}
