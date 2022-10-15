import java.util.Arrays; //library Arrays

public class piket { //class piket

    public static void main(String[] args) { //class main
        String[] nama = { "Badrun", "Evan", "Triandi", "Cahyo", "Zaki", "Wendi", "Susanto", "Nanda", "Imron", "Adhim",
                "Rizki", "Dimas", "Gilang", "Indra", "Abid", "Hakim", "Andika", "Rendi", "Hadi", "Fandi", "Mamad",
                "Yusron", "Jeje", "Febri" }; //deklarasi nilai nama
        String temp; //deklarasi temp
        String key = "Mamad"; //deklarasi key
        System.out.println("Sebelum Diurutkan = " + Arrays.toString(nama)); //output
        for (int i = 0; i < nama.length; i++) { //perulangan for
            for (int j = i + 1; j < nama.length; j++) { //perulangan for
                if (nama[i].compareTo(nama[j]) < 0) { //seleksi nilai
                    temp = nama[i]; //menukar niai
                    nama[i] = nama[j]; //menukar nilai
                    nama[j] = temp; //menukar nilai
                }
            }
        }
        String[] name = nama; //menukar nilai
        System.out.println("\nSesudah Di Urutkan = " + Arrays.toString(name)); //output
        System.out.println(" "); //output

        for(int i = 0; i<name.length; i++){ //perulangan for
            if(key == name[i]){ //seleksi nilai
                System.out.println("piket mamat ke-" + i); //output 
            }
        }
    }
}