package pboif2.pkg10119065.latihan54.koordinat;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan objek Koordinat
 */
public class PBOIF210119065Latihan54Koordinat {
    
    public static void main(String[] args) {
        WarnaKoordinat warnaKoordinat = new WarnaKoordinat(10,4,"Jingga");
        System.out.println("Warna Koordinat : "+warnaKoordinat.getNamaWarna());
        System.out.println("Koordinat sumbu x : "+warnaKoordinat.getX() + ", y : "+warnaKoordinat.getY());
    }
    
}
