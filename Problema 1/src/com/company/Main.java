package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x1,x2,y1,y2;
        ArrayList<Double> Lista = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        for (int i = 0; i<4; i++) {
            System.out.println("Introduza x:");
            double x = input.nextDouble();
            Lista.add(x);
            System.out.println("Introduza y:");
            double y = input.nextDouble();
            Lista.add(y);
        }


        for (int i = 0; i < 8; i+=4){
            System.out.println("A distancia entre os pontos: "+distanciaDePontos(Lista.get(i),Lista.get(i+1),Lista.get(i+2),Lista.get(i+3)));
        }





    }
    static float distanciaDePontos(double x1, double y1, double x2, double y2){
        float distancia;
        distancia= (float) Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        return distancia;
    }
}