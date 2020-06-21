package com.kp.exfive;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num[] = new int[3];
        int x = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(" " + num[i]); // Выводим на экран, полученный массив
        }
        System.out.println();
        for (int i = 0; i < num.length; i++){
            if(num[i]%2 == 0){
                x++;
            }
        }
        System.out.println(x==2 ? "true": "false");
        }


    }




