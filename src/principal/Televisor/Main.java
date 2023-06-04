package principal.Televisor;

public class Main {
    public static void main(String[] args) {
        Televisor tv = new Televisor();

        tv.ligarTelevisor();
        tv.aumentarVolume();
        tv.subirCanal();
        tv.mostrarStatus();

        tv.reduzirVolume();
        tv.descerCanal();
        tv.desligarTelevisor();
        tv.mostrarStatus();
    }
}
