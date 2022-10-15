public class selection { //class selection
    static void select(int[] array) { //fungsi selec dengan nilai pengembalian
        for (int i = 0; i < array.length - 1; i++) { //perulangan dengan menggunakan for 
            int index = i; //deklarasi index dengan type data int
            for (int j = i + 1; j < array.length; j++) { //looping for
                if (array[j] < array[index]) { //selecsi nilai
                    index = j; //penukaran nilai
                }
            }
            int smallNumber = array[index]; //pertukaran nilai
            array[index] = array[i]; //pertukaran nilai
            array[i] = smallNumber; //pertukaran nilai
        }
    }

    public static void main(String[] args) { //class mian
        int[] input = { 10, 5, 532, 610, 31, 74, 1 }; //declarasi nilai input
        System.out.println("sebelum sorting"); //output
        for (int i : input) { //perulangan for
            System.out.print(i + " "); //output
        }
        System.out.println(" "); //output
        select(input); //memanggil fungsi selec
        System.out.println("setelah sorting = "); //output
        for (int i : input) { //looping forEach
            System.out.print(i + " "); //output
        }
    }
}
