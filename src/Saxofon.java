public class Saxofon extends Instrumentos implements ISonido{
    @Override
    public void sonido() {
        super.sonido();
        System.out.println("Que tal soy un Saxofon, mi dueña es Lisa");
    }
}
