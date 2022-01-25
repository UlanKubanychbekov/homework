package com.company;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;


public class Main{

    public static void main(String[] args) {

        System.out.println(uch(600));

    } static int uch(int a){
        int counter=0;
        for(int i=1;i<=a;i++){
            if (i%3==0&&i%4==0&i%5==0){
                counter+=i;
            if (i != a) {
                System.out.print(i + " + ");
            }
            if (i == a) {
                System.out.print(i + " = ");
            }}



}return counter;
        }

    }







