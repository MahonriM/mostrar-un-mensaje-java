package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    String mensaje;
        Scanner mess=new Scanner(System.in);
        System.out.print("Ingresa un mensaje");
        mensaje=mess.next();
        System.out.print("\nEl mensaje que ingresaste es "+ mensaje);
    }
}
