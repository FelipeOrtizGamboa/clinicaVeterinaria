public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Luna", 3, "Carlos", "Labrador");
        Gato gato = new Gato("Michi", 2, "Ana", true);
        Ave ave = new Ave("Piolin", 1, "Luis", 120);

        // 1. Fichas usando polimorfismo
        Animal[] animales = {perro, gato, ave};

        for (int i = 0; i < animales.length; i++) {
            System.out.println("--- Ficha ---");
            animales[i].imprimirFicha();
        }

        // 2. Registrar vacunas
        perro.registrarVacuna("Rabia");
        perro.registrarVacuna("Parvovirus");
        gato.registrarVacuna("Triple felina");

        System.out.println("Vacunas del perro: "
                + perro.getVacunasAplicadas());
        System.out.println("Vacunas del gato: "
                + gato.getVacunasAplicadas());

        // 3. Asegurar animales y clínica
        Clinica clinica = new Clinica("VetCare", "Calle 10");

        Asegurable[] asegurables = {perro, gato, clinica};

        for (int i = 0; i < asegurables.length; i++) {
            System.out.println("Póliza: "
                    + asegurables[i].obtenerNumeroPoliza());
            System.out.println("Prima anual: $"
                    + asegurables[i].calcularPrimaSeguro());
        }

        // 4. Agregar Conejo sin cambiar las otras clases

        Conejo conejo = new Conejo("Nube", 2, "Marta");
        Animal[] animalesConConejo = {perro, gato, ave, conejo};

        System.out.println("--- Ficha del conejo ---");
        animalesConConejo[3].imprimirFicha();
    }
}
