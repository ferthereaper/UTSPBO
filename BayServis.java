package UTS;

public class BayServis {
    private int nomor;
    private Servis servis;

    public BayServis(int nomor) {
        this.nomor = nomor;
    }

    public void terima(Servis servis) {
        this.servis = servis;
    }

    public Servis selesai() {
        Servis hasil = servis;
        servis = null;
        return hasil;
    }

    public boolean isKosong() {
        return servis == null;
    }

    public Servis getServis() {
        return servis;
    }

    public int getNomor() {
        return nomor;
    }
}