## ISCO 
ISCO adalah aplikasi yang digunakan untuk manajemen sumbangan buku, peminjaman, dan skripsi

## FITUR FITUR
- Login dan Register
- Dapat mengetahui data banyaknya Buku, Skripsi, Peminjaman, Pengembalian pada dashboard
- Dapat melakukan transaksi peminjaman
- Menambahkan, menghapus, mengupdate, dan mencetak laporan data buku dan skripsi
- Koneksi database menggunakan persistence

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

