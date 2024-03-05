/*File: AngkaSial.java
 * Deskriipsi: Program penggunaan exception buatan sendiri
 *              Pengenalan klausa 'throw' dan 'throws'
*/


public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println((angka+" bukan angka sial"));
    }
    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch(AngkaSialException ase){
            //methode getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("Hati-hati memasukkan angka");
        }
    }
}

/*Jawaban pertanyaan di modul 
 * 1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
 * jawab: Dieksekusi untuk angka = 10. untuk angka = 13 tidak akan dieksekusi.
 * ketika angka 10 akan menampilkan pesan " 10 bukan angka sial".
 * Tetapi ketika angka 13 dicek, program akan melempar ke methode AngkaSialException dan menampilkan pesan
 * "jangan masukkan angka 13 karena siall !!!" kemudian akan dicatch dan menampilkan pesan
 * "Hati-hati memasukkan angka".
 * Sehingga baris 12 tidak akan dieksekusi unutuk angka 13
 * 
 * 2. Apakah pada baris 21 akan dieksekusi?
 * jawab: akan dieksekusi ketika angka = 13 dan menampilkan pesan "Hati-hati memasukkan angka". Kemudian program
 * akan berhenti dengan tidak mengeksekuis angka = 12, karena program sudah keluar dari try dan masuk ke catch.
 * 
 * 3. Secara konsep ada yang kurang tepat pada program asersi2 di atas, yaitu?
 * jawab: penempatan assert kurang tepat secara konsep, meskipun hasil yang ditampilkannya benar.
 * seharusnya assert diletakkan pada konstruktor lingkaran, bukan dalam fungsi main. karena, untuk mengecek
 * jari-jari termasuk kedalam konstruktor lingkaran, sehingga alangkah lebih baiknya dimasukkan kedalam konstruktor lingkaran.
 * Maka ketika sudah include ke dalam konstruktor lingkaran, kapanpun fungsi lingkaran dipanggil
 * assert jari-jari juga bakal di cek include di dalamnya. tetapi jika disimpan dalam main untuk cek jari-jari,
 * ketika akan memanggil fungsi lingkaran, assert jari jari harus selalu di set untuk pengecekkan. Akan menimbulkan
 * keborosan progma, kurang efektif. 
 * 
 */
