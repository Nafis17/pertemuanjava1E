package pertemuan.ke2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MahasiswaBeraksiMethod {
    public static void main(String[] args) throws ParseException{

        Mahasiswa mhs2 = new Mahasiswa();
        SimpleDateFormat formatTanggal = new SimpleDateFormat(("dd-MM-yyyy"));
        mhs2.npm ="20631141";
        mhs2.nama ="Sabit";
        mhs2.tanggalLahir = formatTanggal.parse("04-09-2000");

        mhs2.tampilkanIdentitasDiri();

        System.out.println("Usia "+mhs2.nama+"Adalah "+mhs2.hitungUsia()+"tahun");
        //System.out.println(mhs2.hitungUsiaKali((7, 9)));

        mhs2.SapaNama("Muhammad Nafis");
    }
}
