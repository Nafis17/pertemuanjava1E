package id.ac.uniska;

public class StringJava {
    public static void main(String[] args){
        char[] uniskaChar ={'U','N','I','S','K','A'};
        String uniskaString = new String(uniskaChar);
        System.out.println(uniskaString);

        //---------------------------------------------------------

        String namalengkap = "Muhammad Nafis";

        System.out.println(namalengkap.length()); //panjang karakter
        System.out.println(namalengkap.indexOf("NIS"));
        System.out.println(namalengkap.substring(5)); //menghilangkan karakter n dari depan
        System.out.println(namalengkap.substring(2,3)); //menghilangkan karakter n dari depan dan belakang
        System.out.println(namalengkap.replace(" Nafis ", "Sabit"));
        System.out.println(namalengkap.toUpperCase());
        System.out.println(namalengkap.toLowerCase());
        System.out.println(namalengkap.charAt(3));
        System.out.println(namalengkap.length());

        String[] namaArray = namalengkap.split(" ");
        System.out.println(namaArray.length);
        for (String nama : namaArray)
        {
            System.out.println(nama);
        }

    }
}
