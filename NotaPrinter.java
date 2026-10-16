package UTS;

public class NotaPrinter {
    private String model;

    public NotaPrinter(String model) {
        this.model = model;
    }

public void cetakNota(Servis s) {
    if (s == null) {
        System.out.println("Tidak ada servis yang dicetak.");
        return;
    }

    String namaMekanik = (s.getMekanik() != null) ? s.getMekanik().getNama() : "-";

    System.out.println("Nota " + s.getJenis() + ", "
            + s.getKode() + ", "
            + s.getPlatnomor() + " | "
            + namaMekanik + " | "
            + s.hitungBiaya());
}
}