JAWABAN PRAKTIKUM 1 5.2
1. Kode tersebut berfungsi untuk menukar dua elemen data agar urut dari nilai kecil ke besar.
2. Kode pencarian nilai minimum pada selection sort:
if (data[j] < data[idxMin]) {
    idxMin = j;
}
3. Kondisi pada insertion sort bertujuan membandingkan dan menggeser data yang lebih besar dari nilai sementara.
4. Perintah data[j] = temp; digunakan untuk meletakkan nilai pada posisi yang benar.

JAWABAN PRAKTIKUM 1 5.5
1. Tambah data digunakan untuk memasukkan data dosen ke dalam array dataDosen.
2. Tampil data menampilkan seluruh data dosen yang tersimpan.
3. Sorting ASC mengurutkan data dosen berdasarkan usia dari termuda ke tertua menggunakan Bubble Sort.
4. Sorting DSC mengurutkan data dosen berdasarkan usia dari tertua ke termuda menggunakan Selection Sort.

JAWABAN PRAKTIKUM 5.3.4
1. A Kenapa i < length-1
Karena elemen terakhir otomatis sudah terurut setelah proses sebelumnya
1. B Kenapa j < length-i
Karena setiap iterasi, bagian belakang sudah terurut
1. C Jika 50 data
Perulangan i = 49 kali
Tahap bubble sort = 49 tahap
2. Modifikasi input keyboard
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan NIM: ");
nim = sc.nextLine();

JAWABAN PRAKTIKUM 5.3.7 
1. Baris program tersebut digunakan untuk:
Menukar posisi data minimum dengan posisi saat ini
Agar data menjadi terurut

JAWABAN PRAKTIKUM 5.4.3 
1. Agar descending, ubah:
data[j] > temp
menjadi:
data[j] < temp