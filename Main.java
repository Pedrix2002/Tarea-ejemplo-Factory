public class Zoologico {
    public static void main(String[] args) {
        CreadorAnimal creadorLeon = new CreadorLeon();
        CreadorAnimal creadorTigre = new CreadorTigre();

        System.out.println("Creando un león:");
        creadorLeon.escucharSonido(); 

        System.out.println("\nCreando un tigre:");
        creadorTigre.escucharSonido(); 
    }
}
