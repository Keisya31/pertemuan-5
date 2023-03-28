/*  Nama file: JumPrimaprosedur.c
    Deskripsi: Menampilkan dan menjumlahkan deret bilangan prima dari sebuah bilangan integer
    Pembuat: Keisya Intan Nabila - 24060122130063
    Tgl pembuatan: Senin, 27 Maret 2023*/

#include<stdio.h>
#include<stdlib.h>

#include <stdio.h>
#include <stdlib.h>

// Menggunakan subprogram bentuk prosedur
void isprima(int x) {
    // Kamus Lokal
    int i;

    // Algoritma
    for(i=2; i<x; i++){
        if(x % i == 0){
            return;
        }
    }
    printf("%d + ", x);
}

// Program utama
int main(){
    // Kamus
    int n, j, Sn = 0;

    // Algoritma
    printf("-------PROGRAM MENAMPILKAN BILANGAN DAN HASIL JUMLAH BILANGAN PRIMA (prosedur)-------\n");
    printf("Masukkan nilai n: ");
    scanf("%i", &n);

    if(n<=1){
        printf("Tidak Ada Bilangan Prima, sehingga Jumlahnya Sn=0");
    }
    else{
        for(j=2; j<=n; j++){
            isprima(j);
            if(j == 2) {
                Sn = Sn + j;
            }
            else if(j > 2 && j%2 != 0) {
                Sn = Sn + j;
            }
        }
        printf(" Dengan jumlah deret bilangannya adalah Sn = %d",Sn);
    }
    return 0;
}
