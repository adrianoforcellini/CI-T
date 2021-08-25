package herança;

public class AnimaisAgindo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Mamifero mamifero = new Mamifero();
        animal.comer("plantas");
        mamifero.comer("queijo");
        String produto = mamifero.lactar();
        System.out.println("O produto da lactação é " + produto);
    }
}

