package UTS;

public class MainVarian9 {
    public static void main(String[] args) {
        Bengkel bengkel = new Bengkel("Jaya Motor", 3);
        Mekanik mekanikkpl = new Mekanik("Pak Slamet", "Mesin");
        Mekanik mekanikpj = new Mekanik("Mas Dodi", "Kelistrikan");

        ServisRingan s1 = new ServisRingan("SRV-01", "N 2211 AA", 50000);
        ServisBerat s2 = new ServisBerat("SRV-02", "N 3344 BB", 200000, 450000);
        
        s1.setMekanik(mekanikpj);
        s2.setMekanik(mekanikpj);
        bengkel.terimaServis(s1);
        bengkel.terimaServis(s2, 3);
        System.out.println("Bengkel "+ bengkel.getNama() +" (kepala: " +mekanikkpl.getNama() +")");
        bengkel.tampilinfo();
        bengkel.selesaikan(1);

        NotaPrinter printer = new NotaPrinter("001");
        printer.cetakNota(s1);
        printer.cetakNota(s2);

        bengkel.tampilinfo();
    }
}
