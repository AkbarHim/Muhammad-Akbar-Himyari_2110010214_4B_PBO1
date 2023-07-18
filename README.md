# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Orang`, `Murid`, dan `Main` adalah contoh dari class.

```bash
public class Orang {
    ...
}

public class Murid extends Orang {
    ...
}

public class Main {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `Orang orang= new Orang(nama, umur);` adalah contoh pembuatan object.

```bash
Orang orang = new Orang(nama, umur);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `umur` adalah contoh atribut.

```bash
String nama;
String umur;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Orang` dan `Murid`.

```bash
public Orang(String nama, Int umur) {
    this.nama = nama;
    this.umur = umur;
}

public Murid(String nama, Int umur, String tinggi) {
    super(nama, umur);
    this.tinggi = tinggi;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setUmur` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setUmur(String umur) {
    this.umur = umur;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getUmur`, getTinggi adalah contoh method accessor.

```bash
public String getTinggi() {
    return tinggi;
}


7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `umur` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private Int umur;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Murid` mewarisi `Orang` dengan sintaks `extends`.

```bash
public class Murid extends Orang {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. 

```bash
Orang anotherOrang = new Murid("Putri", 22,""); {
        anotherOrang.introduce();
}

10. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
Orang[] people = new Orang[3];{
        people[0] = orang;
        people[1] = murid;
        people[2] = anotherOrang;
}
        for (Orang p : people) {
            p.introduce();
        }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Perulangan     |    5    |
|     | **TOTAL**      | **55** |

## Pembuat

Nama: Muhammad Akbar Himyari
NPM: 2110010214

