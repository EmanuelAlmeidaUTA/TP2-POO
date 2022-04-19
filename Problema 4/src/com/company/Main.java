package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("numeros.txt"));
        int[] lista = new int[16];
        int i = 0, apenasum = 0;
        while (scanner.hasNextInt()) {
            lista[i] = scanner.nextInt();
            i++;
        }

        int[] listaord = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

        int saltar = 0;
        for (int c = 0; c < 16; c++) {
            for (int b = 0; b < 16; c++) {
                if (lista[c] == listaord[b])
                    apenasum += 1;
            }
            if (apenasum != 1) {
                saltar = 1;
                System.out.println("Existe elemento repetido ou nao existe um elemento");
                break;
            }
        }

        if (saltar==0) {
            int linha1,linha2,b=0;
            linha1=lista[b]+lista[b+1]+lista[b+2]+lista[b+3];
            b+=4;
            while (b<16 && saltar==0){
                linha2=lista[b]+lista[b+1]+lista[b+2]+lista[b+3];
                b+=4;
                if (linha1!=linha2){
                    saltar=1;
                }

            }

            int diagonal1,diagonal2;
            diagonal1=lista[b]+lista[b+4]+lista[b+8]+lista[b+12];
            diagonal2=lista[b]+lista[b+4]+lista[b+8]+lista[b+12];
            if (diagonal1!=diagonal2){
                    saltar=1;
                }

            int coluna1,coluna2;
            b=0;
            coluna1=lista[b]+lista[b+4]+lista[b+8]+lista[b+12];
            b++;
            while (b<16 && saltar==0){
                coluna2=lista[b]+lista[b+4]+lista[b+8]+lista[b+12];
                b++;
                if (coluna1!=coluna2){
                    saltar=1;
                }


            if (saltar==0){
                System.out.println("E possivel representar um quadrado magico");}
            if (saltar!=0){
                System.out.println("Nao e possivel representar um quadrado magico");}
            }

        }

    }
}

