JAWABAN PERTANYAAN 6.2.3
1. Perbedaan tampilDataSearch & tampilPosisi
tampilPosisi → menampilkan index data
tampilDataSearch → menampilkan isi data
2. Fungsi break
Untuk menghentikan loop saat data ditemukan
3. Fungsi variabel pos
Menyimpan posisi/index data yang ditemukan
4. Jika data sama lebih dari satu
Yang ditampilkan adalah data pertama yang ditemukan
5. Jika break dihapus
Program akan terus mencari sampai akhir → bisa dapat data terakhir

JAWABAN PERTANYAAN 6.3.3
1. Proses Divide
mid = (left + right) / 2;
2. Proses Conquer
return findBinarySearch(cari, left, mid - 1);
return findBinarySearch(cari, mid + 1, right);
3. Fungsi left, right, mid
left → batas kiri
right → batas kanan
mid → tengah
4. Jika data tidak urut
❌ Binary search TIDAK AKAN BENAR
Karena harus terurut
5. Jika data descending
Harus ubah kondisi:
if (listMhs[mid].ipk < cari)
6. Data tidak ditemukan
Jika left > right → return -1
7. Input dinamis
Gunakan Scanner:
int n = sc.nextInt();
