public class Main {
    public static void main() {
        canal c = new canal();
        c.setFrecuenciaMHz(2400.0);
        c.setAnchoBandaMHz(20.0);
        c.setPotencia(100.0);

        c.activar();
        System.out.println("Canal activo: " + c.isActivo());
    }
}
