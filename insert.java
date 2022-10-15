import java.util.Arrays; //memanggil library Arrays

public class insert { //class insert
    public static void main(String[] args) { //class main
        String[] input = { "n", "u", "s", "a", "n", "t", "a", "r", "a" }; //deklarasi nilai input
        System.out.println(Arrays.toString(input)); //output
        String temp; // deklarasi temp
        for (int i = 0; i < input.length; i++) { //perulangan for
            for (int j = i + 1; j < input.length; j++) { //perulangan for
                if (input[i].compareTo(input[j]) > 0) { //seleksi nilai
                    temp = input[i]; //menukar nilai
                    input[i] = input[j]; //menukar nilai
                    input[j] = temp; //menukar nilai
                }
            }
        }
        System.out.println(Arrays.toString(input)); //output
    }
}
