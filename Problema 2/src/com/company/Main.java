package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Palavra: ");
            String str = scanner.next();
            char palavra[];

            //rodarTexto(s);
            
            System.out.println(rodarTexto(str));

            
        }
       static String rodarTexto(String s) {
            char palavra[] = new char[(s.length())];

            for (int i = 0; i < s.length(); i++){
                int x=s.charAt(i);
                if (x<110){
                    char y= (char) (x+13);
                    palavra[i]=y;}
                if (x>=110){
                    char y= (char) (x-13);
                    palavra[i]=y;}
            }
            String ing= Arrays.toString(palavra) ;

            return (ing.replace("[","").replace("]","").replace(", ",""));
        }
}
