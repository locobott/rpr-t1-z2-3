package ba.unsa.etf.rpr.t1;

import java.util.Scanner;

public class Main {

    static int sumaCifara(int n){
        int rez = 0;
        while (n > 0){
            rez += n % 10;
            n /= 10;
        }
        return rez;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var broj = sc.nextInt();
        for (int i = 1; i<broj; i++){
            if (i % sumaCifara(i)==0){
                System.out.println(i);
            }

        }


    }
}
