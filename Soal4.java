// Soal 4 - Operators (1) - Konversi tipe data besar ke kecil
class Soal4 {

    // Method untuk konversi long -> int -> short
    static short methodOne(long l) {
        int i = (int) l;
        return (short) i;
    }

    public static void main(String[] args) {
        double d = 10.25;
        float f = (float) d;          // double -> float: 10.25
        byte b = (byte) methodOne((long) f);  // float -> long -> int -> short -> byte
        System.out.println(b);
    }
}

/*
 * OUTPUT:
 * 10
 *
 * JAWABAN PERTANYAAN:
 *
 * 1. Penjelasan output nilai variable b:
 *    Proses konversinya step by step:
 *    - d = 10.25 (double)
 *    - f = (float) d = 10.25 (double -> float, nilai tetap)
 *    - (long) f = 10 (float -> long, bagian desimal .25 HILANG, dibuang/truncate)
 *    - methodOne(10L):
 *        - i = (int) 10L = 10 (long -> int, nilai tetap karena masih kecil)
 *        - return (short) 10 = 10 (int -> short, nilai tetap karena masih kecil)
 *    - b = (byte) 10 = 10 (short -> byte, nilai tetap karena 10 masih dalam range byte)
 *    Jadi output: 10
 *
 * 2. Apa yang berubah dari variable d menjadi variable b setelah di-cast:
 *    - TIPE DATA berubah: dari double (64-bit floating point) menjadi byte (8-bit integer)
 *    - NILAI DESIMAL hilang: d = 10.25, b = 10 (bagian .25 hilang saat cast ke long)
 *    - UKURAN menyusut drastis: dari 64-bit menjadi 8-bit
 *    - Kalau nilai d lebih besar dari 127 atau kurang dari -128 (range byte),
 *      maka hasilnya bisa tidak sesuai karena overflow.
 */
