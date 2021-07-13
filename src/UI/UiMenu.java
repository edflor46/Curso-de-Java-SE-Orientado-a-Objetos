package UI;

import java.util.Scanner;

public class UiMenu {
    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    //Metodos estaticos
    public static void showMenu() {
        System.out.println("Welcome to my Appointments");
        System.out.println("Seleccion de opcion deseada");

        int response = 0;

        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("Doctor");
                    break;

                case 2:
                    response = 0;
                    showPatientMenu();
                    break;

                case 0:
                    System.out.println("Thank you for you visit");

                default:
                    System.out.println("Please select correct answer");
            }
        } while (response != 0);
    }

    static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointment");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("::Book an appointment");
                    //Lista de los 3 primeros meses
                    for (int i = 0; i <= 2; i++) {
                        System.out.println(i + ". " + MONTHS[i]);
                    }
                    break;

                case 2:
                    System.out.println(":My appointments");
                    break;

                case 0:
                    showMenu();
                    break;

            }
        } while (response != 0);
    }
}