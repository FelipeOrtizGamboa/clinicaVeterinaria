import java.util.ArrayList;

public class Gato extends Animal implements Vacunable, Asegurable {
    private boolean esEsterilizado;
    private ArrayList<String> vacunas;

    public Gato(String nombre, int edad, String nombreDueno,
                boolean esEsterilizado) {
        super(nombre, edad, nombreDueno);
        this.esEsterilizado = esEsterilizado;
        vacunas = new ArrayList<String>();
    }

    @Override
    public double calcularCostoConsulta() {
        return 38000;
    }

    @Override
    public void registrarVacuna(String nombre) {
        vacunas.add(nombre);
    }

    @Override
    public int getVacunasAplicadas() {
        return vacunas.size();
    }

    @Override
    public double calcularPrimaSeguro() {
        if (esEsterilizado) {
            return 120000;
        } else {
            return 200000;
        }
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-GATO-" + nombre.toUpperCase();
    }
}
