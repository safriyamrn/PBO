## ISCO 
ISCO adalah aplikasi yang digunakan untuk manajemen sumbangan buku, peminjaman, dan skripsi

## FITUR FITUR
- Login dan Register
- Dapat mengetahui data banyaknya Buku, Skripsi, Peminjaman, Pengembalian pada dashboard
- Dapat melakukan transaksi peminjaman
- Menambahkan, menghapus, mengupdate, dan mencetak laporan data buku dan skripsi
- Koneksi database menggunakan persistence
- Dapat mencetak laporan peminjaman terbanyak
- Dapat mencetak laporan peminjaman bulanan
- Mencetak laporan buku dan skripsi berdasarkan angkatan
- Mencetak laporan buku dengan berdasarkan kategori yang paling banyak dipinjam

## PREVIEW 
1. Tampilan Login
   
   ![Screenshot 2023-11-12 215030](https://github.com/safriyamrn/PBO/assets/148854440/4b702506-b354-4675-94bc-8198782bf3e9)

   - Login Valid
   
   ![Screenshot 2023-11-12 215713](https://github.com/safriyamrn/PBO/assets/148854440/5cad0558-5e95-48f3-8b66-0200f3ddd0e9)
   - Login Invalild
     
   ![Screenshot 2023-11-12 225527](https://github.com/safriyamrn/PBO/assets/148854440/a4b20756-2083-450c-a846-79098d5d4c8a)

3. Tampilan Register
   
   ![Screenshot 2023-11-12 215234](https://github.com/safriyamrn/PBO/assets/148854440/2d6f3b23-34a9-4012-baab-7bdb61103a42)
4. Tampilan Halaman Utama
   
   ![Screenshot 2023-11-12 215512](https://github.com/safriyamrn/PBO/assets/148854440/3cee78fa-1d4d-4f61-8d20-d80ded58b934)
5.  Tampilan Dashboard
   
   ![Screenshot 2023-11-12 215735](https://github.com/safriyamrn/PBO/assets/148854440/afddd45d-861c-473d-b2c6-f5726db7016c)
5. Tampilan Menu Buku
  
   ![Screenshot 2023-11-12 215804](https://github.com/safriyamrn/PBO/assets/148854440/4ec38127-e930-4c27-9446-286504ea6424)
6. Tampilan tombol Tambah pada Menu Buku

   ![Screenshot 2023-11-12 215832](https://github.com/safriyamrn/PBO/assets/148854440/8baf8993-838d-4320-bad1-cbc843d0525f)
7. Tampilan Menu Skripsi

   ![Screenshot 2023-11-12 215858](https://github.com/safriyamrn/PBO/assets/148854440/46dde66a-869f-4564-b123-ddc2357465cc)
8. Tampilan tombol Tambah pada Menu Skripsi

   ![Screenshot 2023-11-12 215912](https://github.com/safriyamrn/PBO/assets/148854440/a6ab5c63-e95f-44c6-a7b3-390f903b133f)

Kali ini saya akan melanjutkan progress saya 

9. Pada pertemuan sebelumnya saya menyelesaikan operasi CRUD pada aplikasi yang saya 
buat. Pada progress kali ini saya menyelesaikan searching insensitive variable. Artinya 
apabila kita mencari sebuah data meskipun menggunakan huruf kecil ataupun kapital 
akan tetap terdeteksi data yang ada sesuai dengan keyword yang dimasukkan. 

![Screenshot 2023-11-19 222319](https://github.com/safriyamrn/PBO/assets/148854440/3469ba01-2d6d-4101-92a0-6a522ea17c5f)

![Screenshot 2023-11-19 222330](https://github.com/safriyamrn/PBO/assets/148854440/405e885f-6813-4502-b9db-ef5281f175ac)

10. Setelah itu saya menyelesaikan form peminjaman buku. Dimana pada field tanggal 
peminjaman dan pengembalian saya menggunakan jDateChooser untuk memilih 
tanggalnya.

![Screenshot 2023-11-19 223357](https://github.com/safriyamrn/PBO/assets/148854440/6dc53599-33a2-4a0e-832c-bbc0d9326dff)

11. Kemudian saya melanjutkan untuk membuat report menggunakan jasperReport. Pada 
report kali ini dapat dicetak berdasarkan apa yang kita cari.

![Screenshot 2023-11-19 222455](https://github.com/safriyamrn/PBO/assets/148854440/1a5ba999-1036-4cfb-a1f6-9c2ba9f4da69)

![Screenshot 2023-11-19 222445](https://github.com/safriyamrn/PBO/assets/148854440/b5b5b879-d588-4967-b290-667fd475dd12)

Kali ini saya melanjutkan progres nya 

12. Pada progress sebelumnya saya telah menyelesaikan mencetak sebuauh laporan 
menggunakan jasper report dan mencetak berdasarkan sorting by. Pada progress kali ini 
saya ingin menambahkan parameter yang dapat muncul pada saat laporan di cetak supaya 
dapat mengetahui hasil cetakan tersebut berdasarkan sorting apa. Pertama kita membuat parameter baru pada button cetak
![Screenshot 2023-11-26 230518](https://github.com/safriyamrn/PBO/assets/148854440/eafda4c6-f7f2-4a94-83d2-7cfd7887f996)

13. Tapi sebelumnya kita harus mendeklarasikan terlebih dahulu
![Screenshot 2023-11-26 230618](https://github.com/safriyamrn/PBO/assets/148854440/178009c4-99df-4de8-bda1-ee92c36a99ec)

14. Setelah sudah, kita menuju ke design jasper dan klik report inspector lalu klik kanan pada 
menu parameter lalu klik add parameter
![Screenshot 2023-11-26 230755](https://github.com/safriyamrn/PBO/assets/148854440/40e3f6a2-b7f0-4e24-ab36-f588b5318162)

15. Kemudian menambah parameter dengan penamaan sesuai query tadi yakni querySearch 
dan searchBy
![Screenshot 2023-11-26 230826](https://github.com/safriyamrn/PBO/assets/148854440/6bfae9c9-6a96-4e03-aed9-6e4bc3be9ebe)

16. Setelah itu pada design jasper beri textField static untuk memanggil parameter
![Screenshot 2023-11-26 231048](https://github.com/safriyamrn/PBO/assets/148854440/aabc1a02-39bb-4560-bbca-36219af649c2)

17. Kemudian lakukan clean and build lalu run project
![Screenshot 2023-11-26 231231](https://github.com/safriyamrn/PBO/assets/148854440/2c8b8ac7-c403-43eb-a2b9-ef1b42464485)

Maka hasil dari query tersebut menunjukkan bahwa report yang dicetak adalah 
berdasarkan Judul Buku yang memiliki kata ‘Ma'


# Perancangan Aplikasi Final

1. Package
•	META-INF: berisi parsistence.xml sebagai penghubung antara aplikasi java dengan database PostgreSQL.
•	Asset: berisi gambar/ icon yang digunakan dalam aplikasi ini
•	Utama: berisi menu menu yang akan ditampilkan pada aplikasi
2. Form Login
   Login dengan memasukkan username dan password. Source code dari tampilan ini lengkapnya ada di package utama di kelas LoginFrame.java

   ![image](https://github.com/safriyamrn/PBO/assets/148854440/b8cb6436-8f6b-40e0-8762-f8abf308913f)
3. Form Register
   Register dengan memasukkan NIM/NIP, Nama, Username, dan Password. Source code dari tampilan ini lengkapnya ada di package utama di kelas Register.java

   ![image](https://github.com/safriyamrn/PBO/assets/148854440/24063d7a-3da7-4cb0-b5cc-fb3c10b5fac7)

4. Menu Utama
   Pada menu utama terdapat beberapa menu yaitu dashboard, Transaksi, Cetak Laporan, dan Logout.
   a. Dashboard
   Pada menu dashboard menampilkan jumlah koleksi buku, skripsi, peminjaman buku, dan peminjaman skripsi.
   ![image](https://github.com/safriyamrn/PBO/assets/148854440/d3ee8aba-01ad-434b-82a4-4231975cdb02)
   b. Buku
   Pada menu DashBoard terdapat sub menu dashboard, buku, skripsi, dan kategori yang berfungsi untuk menginput data.
   ![image](https://github.com/safriyamrn/PBO/assets/148854440/475f374d-33a0-472f-8ca3-d6a28c75f0e2)

   ![image](https://github.com/safriyamrn/PBO/assets/148854440/29c45a96-2bdf-4487-9460-e2d47f7003b4)

   ![image](https://github.com/safriyamrn/PBO/assets/148854440/5abef85c-f6b4-489b-b147-d02df61ba344)

   c. Skripsi
   
   ![image](https://github.com/safriyamrn/PBO/assets/148854440/ef7a3121-6e11-4a46-b551-ca9edd7533fd)

   d. Kategori

   ![image](https://github.com/safriyamrn/PBO/assets/148854440/364e0729-5359-4d33-a4ab-75e7307c8313)

   e. Peminjaman Buku

   ![image](https://github.com/safriyamrn/PBO/assets/148854440/fcf31a28-ca19-4c24-9494-0c1197f5ed6c)

   f. Peminjaman Skripsi

   ![image](https://github.com/safriyamrn/PBO/assets/148854440/fd765c53-360c-4566-a3ac-67178046277e)

   g. Cetak Laporan
   Pada menu cetak ini terdapat beberapa sub menu yang berfungsi sebagai laporan dari data data yang dibutuhkan

   - Buku: Mengambil data koleksi buku yang ada
  ![image](https://github.com/safriyamrn/PBO/assets/148854440/f1a1f56c-ce56-45da-95b3-94c34cbb404b)

laporannya:
![image](https://github.com/safriyamrn/PBO/assets/148854440/4096f0c3-6d39-4f25-acce-893c1473d55d)

   - Skripsi
yang berarti sebagai laporan dari data skripsi yang ada di Isco.
![image](https://github.com/safriyamrn/PBO/assets/148854440/dc1386ca-37b3-4585-89c2-57d5b2a2c995)

laporannya:
![image](https://github.com/safriyamrn/PBO/assets/148854440/09876878-bc70-4e66-b337-ab15c82cfc36)

   - Peminjaman Buku
Yang berisi data-data untuk laporan peminjaman buku. Didalamnya juga terdapat laporan untuk mencetak jumlah buku yang dipinjam, dari sana maka kita bisa tau buku mana yang paling banyak dipinjam. Juga ada cetak laporan untuk kategori buku, yang dapat memudahkan dalam mengetahui kategori mana yang sering dipinjam.

![image](https://github.com/safriyamrn/PBO/assets/148854440/49bdb268-0c9b-44bb-a307-584b762d0867)

Laporannya:

![image](https://github.com/safriyamrn/PBO/assets/148854440/c3519521-e48c-4253-ba5b-65aa9593eab3)

Jika ingin mencetak laporan jumlah buku yang terbanyak dipinjam 

![image](https://github.com/safriyamrn/PBO/assets/148854440/40934003-96fa-4683-87b4-aa4b21a9f37b)

Jika ingin mencetak jumlah kategori terbanyak yang dipinjam

![image](https://github.com/safriyamrn/PBO/assets/148854440/8fc61050-5ac2-40c2-855e-b78f0c9c001f)

   - Peminjaman Skripsi
Yang berisi data-data untuk laporan peminjaman skripsi. Didalamnya juga terdapat laporan untuk mencetak jumlah skripsi yang dipinjam, dari sana maka kita bisa tau skripsi mana yang paling banyak dipinjam.

![image](https://github.com/safriyamrn/PBO/assets/148854440/17af24a7-fef6-42bf-a1d8-686a8f3270b6)

Laporannya:

![image](https://github.com/safriyamrn/PBO/assets/148854440/a0a2bc99-fca0-48a3-8a0f-7fdc1c6caf38)

Jika ingin mencetak laporan jumlah skripsi yang paling banyak dipinjam 

![image](https://github.com/safriyamrn/PBO/assets/148854440/c2955826-d55b-4fe2-bed9-4b3edbbeda80)

   -   Bulanan Buku
Yaitu berisi laporan bulanan buku dipinjam. Pada menu ini user dapat menentukan ingin mencetak laporan peminjaman buku mulai dari tanggal berapa sampai tanggal berapa, untuk itu maka user diminta untuk menginput tanggalnya.

![image](https://github.com/safriyamrn/PBO/assets/148854440/ca6e92a8-2b83-4d21-b3ea-4a913f09c4fb)

Laporannya disini saya memberi contoh untuk laporan bulan desember
Dari tanggal 1 Desember 2023
Sampai tanggal 31 Desember 2023

![image](https://github.com/safriyamrn/PBO/assets/148854440/04b9e4ea-79a0-49d7-9901-c4d67180cd9b)

   - Bulanan Peminjaman Skripsi
Yaitu berisi laporan bulanan skripsi dipinjam. Pada menu ini user dapat menentukan ingin mencetak laporan peminjaman skripsi mulai dari tanggal berapa sampai tanggal berapa, untuk itu maka user diminta untuk menginput tanggalnya.

![image](https://github.com/safriyamrn/PBO/assets/148854440/32148b56-0d46-45ca-806e-004b90e8534f)

Laporannya disini saya memberi contoh untuk laporan bulan desember
Dari tanggal 1 Desember 2023
Sampai tanggal 31 Desember 2023

![image](https://github.com/safriyamrn/PBO/assets/148854440/705d1a0e-7d0b-4643-9070-c031adcca1e7)

h. LogOut

Pada menu ini ketika kita mengklik menu logout ini maka akan muncul pesan apakah yakin akan logout seperti dibawah ini

![image](https://github.com/safriyamrn/PBO/assets/148854440/81fb9791-f882-49c5-80d8-79c2092fddfa)

Apabila no, maka akan Kembali ke menu terakhir kita akses. Apabila yes maka akan Kembali ke menu Login

![image](https://github.com/safriyamrn/PBO/assets/148854440/efd8998e-ff41-41ba-b42e-0479dab1b4eb)



   



   









