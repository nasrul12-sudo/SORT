public class optimalitation { // class optimalitation
    static void buble(int[] array) { // fungsi
        boolean swap = true; // type data boolean untuk parameter looping
        while (swap) { // looping dengan while
            swap = false; // update nilai boolean swap
            for (int i = 0; i < array.length - 1; i++) { // perulangan menggunakan for
                if (array[i] > array[i + 1]) { //selekasi nilai
                    int temp = array[i]; //pertukaran nilai dari temp ke array[i]
                    array[i] = array[i + 1]; //pertukaran nilai dari array[i] ke array[i+1]
                    array[i + 1] = temp; //pertukaran nilai[i+1] ke temp
                    swap = true; //mengupdate nilai swap
                }
            }
        }
        System.out.print("input setelah sorting = "); //output
        for (int Value : array) { //perulangan forEach
            System.out.print(Value + " "); //output
        }
    }

    public static void main(String[] args) { //class main
        int[] array = { 3, 7, 11, 5, 12, 6, 16, 9 }; //deklarasi nilai array
        buble(array); //memanggil fungsi buble
    }
}
