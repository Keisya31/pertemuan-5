/*Nama:Keisya Intan Nabila
 * NIM:24060122130063
 * Lab:B2
 * File: Asersi.java
 * Deskripsi: Program untuk menunjukkan asersi
 */

 public class Asersi{
    public static void main(String[] args){
        int x = 0;
        if(x > 0){
            System.out.println("Nilai x = " + x);
        }
        else{
            assert(x < 0): "ada kesalahana kode";
            System.out.println("x bilangan negatif");
        }
    }
 }