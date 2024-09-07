abstract class CreadorAnimal {
    public abstract Animal crearAnimal();
    public void escucharSonido() {
        Animal animal = crearAnimal();
        animal.hacerSonido();
    }
}
