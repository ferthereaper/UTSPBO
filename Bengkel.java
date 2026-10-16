package UTS;

public class Bengkel {
    private String nama;
    private BayServis[] daftarBay;
    private Mekanik kepala;

    public Bengkel(String nama, int jumlahBay) {
        this.nama = nama;
        daftarBay = new BayServis[jumlahBay];
        for (int i = 0; i < jumlahBay; i++) {
            daftarBay[i] = new BayServis(i + 1);
        }
    }

    public String getNama() {
        return nama;
    }

    public void setKepala(Mekanik kepala) {
        this.kepala = kepala;
    }

    public Servis terimaServis(Servis servis) {
        for (BayServis bay : daftarBay) {
            if (bay.isKosong()) {
                bay.terima(servis);
                return servis;
            }
        }
        return null;
    }

    public Servis terimaServis(Servis servis, int nomorBay) {
        int idx = nomorBay - 1;
        if (idx < 0 || idx >= daftarBay.length) {
            return null;
        }
        if (!daftarBay[idx].isKosong()) {
            return null;
        }
        daftarBay[idx].terima(servis);
        return servis;
    }

    public Servis selesaikan(int nomorBay) {
        int idx = nomorBay - 1;
        if (idx < 0 || idx >= daftarBay.length) {
            return null;
        }
        return daftarBay[idx].selesai();
    }

public void tampilinfo() {
    for (BayServis bay : daftarBay) {
        System.out.println("Bay " + bay.getNomor() + "   : "
                + (bay.isKosong() ? "kosong" : bay.getServis()));
    }
}
}