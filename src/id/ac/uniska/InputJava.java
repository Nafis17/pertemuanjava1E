package id.ac.uniska;

import java.util.Scanner;
public class InputJava {

    public static void main(String[] args){

        String namaLeng;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nama Lengkap Anda : ");
        namaLeng = input.nextLine();

        System.out.println("Nama Lengkap Anda Adalah " + namaLeng);
    }
}
