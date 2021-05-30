package pertemuan.ke2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException {
        Mahasiswa mhs = new Mahasiswa();
        SimpleDateFormat formatTanggal = new SimpleDateFormat("dd-MM-YYYY");

        mhs.npm = "19631141";
        mhs.nama = "Muhammad Nafis";
        mhs.tanggalLahir = formatTanggal.parse("04-09-2000");

                System.out.println("NPM"+mhs.npm) ;
                System.out.println("Nama"+mhs.nama) ;
                System.out.println("Tanggal Lahir"+formatTanggal.format(mhs.tanggalLahir)) ;


        System.out.println("====================================================================")   ;

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.npm = "19631242";
        mhs2.nama = "Muhammad Hafizi";
        mhs2.tanggalLahir = formatTanggal.parse("09-04-2000");

        System.out.println("NPM"+mhs2.npm) ;
        System.out.println("Nama"+mhs2.nama) ;
        System.out.println("Tanggal Lahir"+formatTanggal.format(mhs2.tanggalLahir)) ;



    }
}
