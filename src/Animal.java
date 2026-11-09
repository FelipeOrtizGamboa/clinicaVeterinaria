public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected String nombreDueno;

    public Animal(String nombre, int edad, String nombreDueno) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDueno = nombreDueno;
    }

    public abstract double calcularCostoConsulta();

    public void imprimirFicha() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Dueño: " + nombreDueno);
        System.out.println("Costo de consulta: $"
                + calcularCostoConsulta());
    }
    //Crear la interface vacunable

    public interface Vacunable {
        void registrarVacuna(String nombre);

        int getVacunasAplicadas();
    }
    //Crear la interface asegurable
    
    public interface Asegurable {
        double calcularPrimaSeguro();

        String obtenerNumeroPoliza();
    }
}