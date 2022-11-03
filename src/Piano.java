public class Piano extends Instrumentos implements ISonido{
    @Override
    public void sonido() {
        super.sonido();
        System.out.println("SOY UN PIANO");
    }
}
