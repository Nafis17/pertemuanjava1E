package pertemuan.ke2;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Hewan {
    String nama, jenis;
    int jumlahKaki;


    public Hewan(String nama, String jenis, int jumlahKaki) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        this.nama = nama;
        this.jenis = jenis;
        this.jumlahKaki = jumlahKaki;

        System.out.println(nama+" "+jenis+" "+jumlahKaki);
    }
}
