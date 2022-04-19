package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	int[] num;
    num = new int[10];
        Random rand = new Random();

        for (int i=0; i < num.length; i++) {
            int randomNum = rand.nextInt(20) + 1;
            num[i] = randomNum;
        }

        try {
            FileWriter texto = new FileWriter("filename.txt");
            texto.write("Problema 3 \n");
            texto.write("Lista: ");
            for (int i=0; i < num.length; i++) {
                texto.write(i+"-"+num[i]+"   ");
            }

            //indice pares
            texto.write("\nIndices pares: ");
        for (int i=0;i<10;i++) {


            if (i % 2 == 0) {
                texto.write(i+"-"+num[i]+"   ");
            }
        }

            //Numeros pares

            texto.write("\nNumeros pares: ");

        for (int i=0;i<10;i++) {
            if (num[i] % 2 == 0) {
                texto.write(i+"-"+num[i]+"   ");
            }
        }
            texto.write("\n");

            //inverso
            texto.write("Lista em sentido inverso:  ");
    for (int i=num.length-1;i!=-1;i--){
        texto.write(-(i-9)+"-"+num[i]+"   ");
        }
            //primeiro e ultimo
            texto.write("\nPrimeiro elemento: "+num[0]);
            texto.write("\nUltimo elemento: "+num[num.length-1]+"   ");

            texto.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
