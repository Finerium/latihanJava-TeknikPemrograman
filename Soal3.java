// Soal 3 - Operators (Math.round)
class Soal3 {
    public static void main(String[] args) {
        double x = 92.98;
        int nx = (int) Math.round(x);

        System.out.println("Nilai x  = " + x);
        System.out.println("Nilai nx = " + nx);
    }
}

/*
 * OUTPUT:
 * Nilai x  = 92.98
 * Nilai nx = 93
 *
 * JAWABAN PERTANYAAN:
 *
 * 1. Nilai nx setelah Math.round(x):
 *    Math.round(92.98) membulatkan 92.98 ke bilangan bulat terdekat = 93.
 *    Jadi nx = 93.
 *
 * 2. Kenapa dibutuhkan cast (int)?
 *    Karena Math.round(double) mengembalikan tipe data LONG (64-bit),
 *    sedangkan variabel nx bertipe INT (32-bit).
 *    Long tidak bisa langsung masuk ke int (ukurannya lebih besar),
 *    jadi perlu di-cast secara eksplisit dengan (int) supaya
 *    Java tahu kita sengaja mengecilkan tipe datanya.
 *    Tanpa cast (int), program akan error saat compile.
 */
