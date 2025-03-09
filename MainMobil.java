import java.util.Scanner;
//untuk mengambil import pengguna

public class MainMobil {
    //mendeklarasikan kelas main mobil

    public static void main(String[] args) {
        //titik awal eksekusi program 
        
        //instan objek bernama m1
        Mobil m1 = new Mobil();
        //membuat objek m1 dari kelas mobil

        Scanner in = new Scanner (System.in);
        //untuk membaca input dari pengguna

        System.out.println("Masukan detail mobil 1 : ");
        //meminta pengguna memasukan detail mobil
        System.out.print("Manufaktur : ");
        //meminta pengguna memasukan manufaktur mobil
        m1.setManufaktur(in.nextLine());
        //menyimpan data ke objek m1
        System.out.print("Nomor Plat : ");
        //meminta pengguna memasukan nomor plat mobil
        m1.setNoPlat(in.nextLine());
        //menyimpan data ke objek m1
        System.out.print("Warna : ");
        //meminta pengguna memasukan warna mobil
        m1.setWarna(in.nextLine());
        //menyimpan data ke objek m1
        System.out.print("Kecepatan :");
        //meminta pengguna memasukan kecepatan mobil
        m1.setKecepatan(in.nextDouble());
        //menyimpan data ke objek m1
        System.out.print("Waktu dalam jam : ");
        //meminta pengguna memasukan waktu 
        m1.setWaktu(in.nextDouble());
        //menyimpan data ke objek m1
        m1.displayMessage();
        //menampilkan data mobil
        System.out.println("=========================");
        in.nextLine();
        //untuk baris baru setelah input 

        //instan objek baru bernama m2
        Mobil m2 = new Mobil();
        //membuat objek m2 dari kelas mobil

        //Mulai baris 50-65 memiliki fungsi sama seperti baris 11-42 namun, pada baris 50-65 untuk mobil kedua (m2)
        System.out.println("Masukan detail mobil 2 : ");
        //meminta pengguna memasukan detail mobil
        System.out.print("Manufaktur : ");
        m2.setManufaktur(in.nextLine());
        //menyimpan data ke objek m2
        System.out.print("Nomor plat : ");
        m2.setNoPlat(in.nextLine());
        System.out.print("Warna : ");
        m2.setWarna(in.nextLine());
        System.out.print("Kecepatan : ");
        m2.setKecepatan(in.nextDouble());
        System.out.print ("Waktu dalam jam : ");
        m2.setWaktu(in.nextDouble());
        m2.displayMessage();
        System.out.println("=========================");
        in.nextLine();

        //merubah warna dari objek m1 menjadi warna hijau
        System.out.println("mobil pada objek m1 di rubah menjadi hijau");
        m1.setWarna("Hijau");

        //menampilkan hasil/data perubahan warna mobl m1
        m1.displayMessage();

        //menutup scanner untuk mencegah kebocoran
        in.close();
    }

}
