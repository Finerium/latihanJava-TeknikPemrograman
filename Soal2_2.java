// Soal 2 - Variables (Class Constants2)
// Menggunakan public static final double -> konstanta class-level
public class Soal2_2 {
    public static final double CM_PER_INCH = 2.54;

    public static void main(String[] args) {
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
 * Sama persis dengan class Constants.
 * Bedanya, CM_PER_INCH di sini bisa diakses dari class lain
 * dengan cara: Constants2.CM_PER_INCH
 */
