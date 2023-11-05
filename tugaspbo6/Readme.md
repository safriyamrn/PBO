# JASPER REPORT 
JasperReport merupakan library di lingkungan Java untuk pemroses laporan. Dengan library ini, kita dapat menampilkan laporan dalam bentuk print preview, melakukan export ke beberapa format dokumen lain (antara lain PDF, HTML, text, Excel), menampilkan gambar, grafik maupun tabel. Berikut beberapa library lain yang digunakan juga dalam JasperReport : commons-beanutils.jar, commons-collections.jar, commons-digester.jar, commons-logging.jar, itext-1.02b.jar, jfreechart-0.9.21.jar.
# iREPORT 
iReport adalah merupakan perangkat lunak bantu untuk perancangan laporan secara visual yang nantinya dapat di kompilasi dengan menggunakan JasperReport sehingga menjadi file *.jasper atau *.jrxml yang dapat langsung dipanggil oleh program Java.

# STEPS PROJECT 
1. Pada lanjutan tugaspbo5 kemarin, klik kanan project lalu pilih report wizard. Namun 
sebelumnya harus sudah menginstall plugin ireport
2. Setelah itu klik next lalu pilih layout blank dengan ukuran kertas A4 lalu klik next.
3. Selanjutnya memberi nama pada file report wizard.
4. Pilih database JDBC connection sebagai datasource nya. Kalu klik next.
5. Lalu beri nama pada Database JDBC connerction lalu klik save.
6. Lalu masukkan query SELECT * FROM table yang sudah terhubung databse. Pada kasus 
ini nama table nya “mahasiswa”.
7. Selanjutnya akan muncul wizard report yang telah di setting, lalu masuk tahap designer.
Pada tahap ini mulai mendesain bagaiamana bentukan wizard report yang kita mau. 
Pertama saya ingin memberi tampilan seperti kop surat pada bagian title. Lalu memberi 
garis pada bagian page header.
![Screenshot 2023-10-01 111512](https://github.com/safriyamrn/PBO/assets/148854440/7964c767-3fb0-4e0e-a57d-510d7d6d5cb1)
8. Kemudian memasukkan field database supaya tersambung dengan report nya. Bedanya 
disini saya ingin mendesain recordnya dalam bentuk rectangel supaya mudah dibaca, rapi 
dan terdapat estetikanya pula.
![Screenshot 2023-10-01 114846](https://github.com/safriyamrn/PBO/assets/148854440/2e93f5b2-45f4-4e6c-82e4-baf804d236de)
9. Langkah selanjutnya, saya ingin memberi tempat dan tanggal surat, dimana tanggal surat 
mengikuti tanggal ketika report tersebut diakses.
![Screenshot 2023-10-01 115925](https://github.com/safriyamrn/PBO/assets/148854440/6b38f324-13bd-40a0-b4bf-779999d397c6)
10. Pada tempat penambahan tanggal, terdapat banyak pilihan model pemformatan yang 
diinginkan. Lalu klik ‘Apply’
![Screenshot 2023-10-01 120006](https://github.com/safriyamrn/PBO/assets/148854440/14532f28-7a72-4263-8cb5-38ed2f4c5d64)
11. Setelah itu pada properties klik text field expression lalu masukkan new java.util.Date() 
untuk mengimport format date nya. Lalu klik ok.
![Screenshot 2023-10-01 120214](https://github.com/safriyamrn/PBO/assets/148854440/e44281e6-3656-45fc-bd3c-a2c06bba0966)
12. Sekiranya desain yang diinginkan sudah cukup, Run program lalu klik cetak dan akan 
muncul report dari database yang telah ada dan tersambung beserta tanggal sesuai dimana 
data tersebut di akses.
![Screenshot 2023-10-01 122038](https://github.com/safriyamrn/PBO/assets/148854440/c3d192b1-974f-416e-8f66-b827431d4be3)

