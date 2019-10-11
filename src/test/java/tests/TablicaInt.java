package tests;

import java.util.Arrays;

public class TablicaInt {

    public static void main(String[] args) {

    int[] tablica = {55, 12, 26, 2, 5, 102, 1, 66, 3, 87};

//    int n = tablica.length;
//    System.out.println(n/2);
//    int suma = 0;
//    Arrays.sort(tablica);
//    for(int i = 1; i<n-1;i++){
//        suma= suma + tablica[i];
        int n = tablica.length;
        int suma = 0;
        Arrays.sort(tablica);
        for(int i = 1;  i<n; i++ ){
            suma = suma + tablica[i];


    }

//        for (int i=0;i>=n;i++){
//            if(tablica[0]>tablica[1]){
//                tablica[1]=tablica[0];
//            }
//            System.out.println(Arrays.toString(tablica));
//        }
    System.out.println(Arrays.toString(tablica));
        System.out.println(suma);

}
}

