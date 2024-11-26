package org.example;

public class Main {
    public static void main(String[] args) {
        int [] number = {4, 5, 6, 8,};
        int count = 0;

        for (int i =0; i < number.length; i++) {
            if (number[i] %2 == 0) {
                count ++;
                if (count == 0 ) {
                    System.out.println("მასივში არ არის ლუწი რიცხვი");
                } else {
                    System.out.println("ამ მასივში არის ლუწი რიცხვი");
                }


            }
        }
    }
}
