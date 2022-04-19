package com.company;

import static com.company.Direcao.*;
import static com.company.Ponto2D.*;

public class Robot {

    private int x,y;
    private Ponto2D(x,y);
    private Direcao atual= N;


    public void turnLeft(){
        switch(atual) {
            case N:
                atual =O;
                break;
            case E:
                atual =N;
                break;
            case S:
                atual =E;
                break;
            case O:
                atual =S;
                break;
    }}

    public void turnRight(){
            switch(atual) {
                case N:
                    atual =E;
                    break;
                case E:
                    atual =S;
                    break;
                case S:
                    atual =O;
                    break;
                case O:
                    atual =N;
                    break;}
    }

    public void move(){
        if (atual==N){
            movnorte();
        }
        if (atual==S){
            movsul();
        }
        if (atual==E){
            moveste();
        }
        if (atual==O){
            movoeste();
        }
        }



    //public Ponto2D getLocation(){
        //Array pont[2]={x,y}
        //return x,y;
    //}

    public String getDirecao(){
        String apredirecao = "";
        switch(atual) {
            case N:
                apredirecao = "Norte";
                break;
            case E:
                apredirecao = "Este";
                break;
            case S:
                apredirecao = "Sul";
                break;
            case O:
                apredirecao = "Oeste";
                break;

    }return apredirecao;
    }
}
