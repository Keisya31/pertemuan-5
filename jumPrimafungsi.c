/*  Nama file: JumPrimafungsi.c
    Deskripsi: Menampilkan dan menjumlahkan deret bilangan prima dari sebuah bilangan integer
    Pembuat: Keisya Intan Nabila - 24060122130063
    Tgl pembuatan: Sabtu, 25 Maret 2023*/

//Menggunakan subprogram bentuk fungsi
int isprima(int x){
    // Kamus Lokal
    int i;

    // Algoritma
    for(i=2; i<x; i++){
        if(x % i == 0){
            return 0;
        }
    }
    return 1;

}

// program utama
int main(){
    // Kamus
    int n, j, Sn = 0;

    // Algoritma
    printf("-------PROGRAM MENAMPILKAN BILANGAN DAN HASIL JUMLAH BILANGAN PRIMAA (fungsi)-------\n");
    printf("Masukkan nilai n: ");
    scanf("%i", &n);

    if(n<=0){
        printf("Tidak Ada Bilangan Prima, sehingga Jumlahnya Sn=0");
    }
    else{
        for(j=2; j<=n; j++){
            if(isprima(j)){
                printf("%d + ", j);
                Sn = Sn + j;
            }
        }
        printf(" Dengan jumlah deret bilangannya adalah Sn = %d",Sn);
    }


    return 0;


}

