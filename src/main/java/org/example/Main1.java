package org.example;

public class Main1 {
    public static void main(String[] args) {
        String s = "abcdryeygvdbz";
        int i = 0;

        while (i < s.length()){
            System.out.println(s.charAt(i));
            i +=3;

            if (i < s.length() && s.charAt(i)== 'z') {
                System.out.println('z');
                break;
            }



        }




    }

}
