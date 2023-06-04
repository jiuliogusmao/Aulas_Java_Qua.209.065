package principal.Televisor;

public class Televisor {
    private int canal;
    private int volume;
    private boolean ligado;

    public Televisor() {
        canal = 1;
        volume = 0;
        ligado = false;
    }

    public void aumentarVolume() {
        if (ligado && volume < 10) {
            volume++;
        }
    }

    public void reduzirVolume() {
        if (ligado && volume > 0) {
            volume--;
        }
    }

    public void subirCanal() {
        if (ligado && canal < 16) {
            canal++;
        }
    }

    public void descerCanal() {
        if (ligado && canal > 1) {
            canal--;
        }
    }

    public void ligarTelevisor() {
        ligado = true;
    }

    public void desligarTelevisor() {
        ligado = false;
    }

    public void mostrarStatus() {
        System.out.println("Status da TV:");
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume);
        System.out.println("Televisor ligado: " + (ligado ? "Sim" : "Não"));
    }
}
