# METHOD OVERLOADING
- Method overloading mempunyai nama method yang sama dengan method lain yang ada di class, namun parameternya atau tipe returnnya berbeda.
- Method overloading dibuat kembali di class yang sama dengan method pertama yang nama methodnya sama dengan method overloading tersebut.
- Method overloading digunakan untuk menghindari kode yang berlebihan.
- Method overloading menambah atau mengurangi atau memperluas perilaku method.
# METHOD OVERRIDING
- Method overriding mempunyai nama yang sama, parameter sama tetapi perintah dan fungsi yang dijalankan berbeda.
- Method overriding methodnya dibuat di class parent lalu dibuat kembali di class child (turunannya)
- Method overriding digunakan agar method di class parent dapat dibuat lagi di kelas child.
- method overriding mendefiniskan kembali atau mengubah perilaku method dengan sepenuhnya.

# STEPS PROJECT
1. Membuat rancangan diagram
2. Membuat kelas induk atau superclass "Orang" lalu memasukkan atribut. Setelah itu di getter setter dan membuat method "Bekerja".
3. Membuat subclass "WNA" yang implementasi dengan class interface Pengusaha Coffee, Konsultan, dan Virtual Assistant
4. Kemudian membuat subclass "WNI" yang extends dengan superclass "Orang" dan implements dengan interface PNS, Fotografer, dan Pedagang
5. Setelah itu membuat class Main pada beda package. Lalu mengimport semua class yang ada pada package “tugas3”, yakni class “Orang”, “WNI”, dan “WNA”
6. Setelah selesai semua, saatnya run program untuk melihat outputnya. 
