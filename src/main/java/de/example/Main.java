package de.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean run = true;

        while(run){
            Set<String> set = new HashSet<>();
            System.out.println("LISTE: Gib die Liste aus, ENDE: beendet das Programm");
            System.out.println("Bitte gib einen Namen ein:");
            String inputUser = scan.next();
            if(inputUser.equals("LISTE")){
                System.out.println(printList(set));
            }
            if(inputUser.equals("ENDE")) run = false;


            if(set.add(inputUser)){
                set.add(inputUser);

            }else {
                System.out.println("Der Name:" + inputUser + " ist bereits in der Liste!");
            }
        }

        scan.close();

    }

    public static StringBuilder printList(Set<String> set){
        StringBuilder sb = new StringBuilder();
        sb.append("Deine Liste:" + "\n");
        for (int i = 0; i < set.size(); i++) {
            sb.append(set);
        }
        return sb;
    }
}