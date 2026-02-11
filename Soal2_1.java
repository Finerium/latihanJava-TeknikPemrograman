// Soal 2 - Variables (Class Constants)
// Menggunakan final double -> konstanta lokal di dalam method main
public class Soal2_1 {
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54;
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: " +
            paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
}

/*
 * OUTPUT:
 * Paper size in centimeters: 21.59 by 27.94
 *
 * JAWABAN PERTANYAAN:
 *
 * 1. Output dari class Constants dan Constants2 sama:
 *    "Paper size in centimeters: 21.59 by 27.94"
 *    Karena perhitungan dan nilainya samna/mirip.
 *
 * 2. Perbedaan final double vs public static final double:
 *
 *    - final double (di class ini):
 *      Konstanta LOKAL, cuman bisa diakses di dalam method main().
 *      Tidak bisa dipakai di method lain atau class lain.
 *
 *    - public static final double (di Constants2):
 *      Konstanta CLASS-LEVEL (milik class, bukan milik method).
 *      "public" = bisa diakses dari class lain.
 *      "static" = bisa diakses tanpa buat objek (langsung Constants2.CM_PER_INCH).
 *      "final"  = nilainya tidak bisa diubah (konstanta).
 *      Cocok dipakai kalau konstantanya dibutuhkan di banyak tempat.
 */
