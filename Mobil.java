public class Mobil {
    //membuat kelas mobil sebagai blueprint untuk objek mobil

    //mendeklarasikan atribut 
    private String noPlat; //untu nomor plat mobil
    private String warna;//untuk warna mobil
    private String manufaktur;//untuk menufaktur mobil
    private double kecepatan;//untuk kecepatan mobil
    private double waktu;//untuk waktu mobil
    private double jarakdlmMeter;//untuk jarak mobil dalam satuan meter
    private double jarak;//untuk jarak mobil dalam satuan Kilo meter

    //mengubah nomor plat bedasarkan input pengguna
    public void setNoPlat(String s){
        noPlat = s;
    }

    //mengubah warna mobil sesuai input pengguna 
    public void setWarna(String s){
        warna = s;
    }

    //mengubah manufaktur mobil sesuai input pengguna 
    public void setManufaktur(String a){
        manufaktur = a;
    }

    //mengubah kecepatan mobil sesuai input pengguna 
    public void setKecepatan(double i){
        kecepatan = i;
        rubahKecepatan();
    }

    //menbubah waktu tempuh mobil 
    public void setWaktu(double w){
        waktu = w;
        rubahSekon(waktu);//memanggil rubahSekon(waktu)
        hitungJarak();//memanggil hitung jarak, untuk mempermudah jika waktu berganti 
    }

    //mengubah waktu dari jam ke detik 
    private void rubahSekon(double waktu){  //menggunakan private agar hanya dapat dipakai pada kelas Mobil
        double sekon = waktu * 3600;  //menggunakan rumus waktu x 3600
        System.out.println("Waktu dalam sekon = " + String.format("%.2f", sekon) + " s");  //menampilkan 2 angka dibelakang koma
    }

    //mengubah kecepatan dari Km/jam menjadi m/s
    private void rubahKecepatan(){  //menggunakan private agar hanya dapat dipakai pada kelas Mobil
        double kmpers = (kecepatan * 1000) / 3600;
        System.out.println("Kecepatan dalam m/s = " + String.format("%.2f", kmpers) + " m/s");  //menampilkan 2 angka dibelakang koma

    }

    //menghitung jarak 
    private void hitungJarak(){  //menggunakan private agar hanya dapat dipakai pada kelas Mobil
        jarak = kecepatan * waktu;  //menghitung jarak dalam satuan meter
        jarakdlmMeter = jarak * 1000;  //menghitung jarak dalam satuan kilo meter 
        System.out.println("Jarak = " + jarakdlmMeter + " m");  //menampilkan jarak dalam meter

    }



    //menampilkan semua informasi mobil
    public void displayMessage(){
        System.out.println();
        System.out.println("Mobil anda bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memiliki warna " + warna);
        System.out.println("dengan jarak " + jarak + " km");
        System.out.println("dan mampu menempuh kecepatan " + kecepatan + " km/h");
        System.out.println();
}

} 
