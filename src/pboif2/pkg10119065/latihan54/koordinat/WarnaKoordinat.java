package pboif2.pkg10119065.latihan54.koordinat;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan objek Koordinat
 */
public class WarnaKoordinat extends Koordinat{
    public String namaWarna;
    
    public WarnaKoordinat(int x, int y, String namaWarna)
    {
        super(x,y);
        this.namaWarna = namaWarna;
    }

    public String getNamaWarna() {
        return namaWarna;
    }

    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
}
