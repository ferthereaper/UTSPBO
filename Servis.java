package UTS;

public class Servis {
    protected String kode;
    protected String platNomor;
    protected int biayaJasa;
    private Mekanik mekanikPJ;

    public Servis() {

    }

    public Servis(String kode, String plat, int biaya) {
        this.kode = kode;
        platNomor = plat;
        biayaJasa = biaya;
    }

    public String getKode() {
        return kode;
    }

    public String getJenis() {
        return mekanikPJ != null ? mekanikPJ.getSpesial() : "-";
    }

    public void setMekanik(Mekanik mekanik) {
        mekanikPJ = mekanik;
    }

    public Mekanik getMekanik() {
        return mekanikPJ;
    }

    public int hitungBiaya() {
        return biayaJasa;
    }

    public String getPlatnomor() {
        return platNomor;
    }

@Override
public String toString() {
    String namaMekanik = (mekanikPJ != null) ? mekanikPJ.getNama() : "-";
    return kode + " | " + platNomor + " | " + namaMekanik + " | Rp" + hitungBiaya();
}
}
