/* File: AngkaSialException.java 
 * Deskripsi: Eksepsi buatan sendiri, menolak masukkan angka 13
*/

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan masukkan angka 13 karena siall !!!");
    }
}
