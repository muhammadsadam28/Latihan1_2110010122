
package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika sadam = new Matematika(2,2);
        
        
        System.out.println("Hasil penjumlahan: " +sadam.setPenjumlahan());
        System.out.println("Hasil penjumlahan: " +sadam.setPengurangan());
        System.out.println("Hasil penjumlahan: " +sadam.setPerkalian());
        System.out.println("Hasil penjumlahan: " +sadam.setPembagian());
    }
}
