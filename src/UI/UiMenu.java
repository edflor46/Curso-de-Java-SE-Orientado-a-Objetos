package UI;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UiMenu {
    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static Doctor doctorLogged;
    public static Patient patientLogged;

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
                    response = 0;
                    authUser(1);
                    break;

                case 2:
                    response = 0;
                    authUser(2);
                    break;

                case 0:
                    System.out.println("Thank you for you visit");

                default:
                    System.out.println("Please select correct answer");
            }
        } while (response != 0);
    }
    private static void  authUser(int userType){
        //UserType = 1 Doctor
        //UserType = 2 Patient

        //Datos de los Doctores
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Eduardo Flores", "eduardoFlores@gmail.com"));
        doctors.add(new Doctor("Karen Sosa", "karens@gmail.com"));
        doctors.add(new Doctor("Rocio Gomez", "rociog@gmail.com"));

        //Datos de los pacientes
        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Eduardo Ramirez", "eduRamirez@gmail.com"));
        patients.add(new Patient("Roberto Rodriguez", "robertp@gmail.com"));
        patients.add(new Patient("Carlos Sanchez", "Carlos@gmail.com"));

        //Flag emailCorrect
        boolean emailCorrect = false;

        //Ejecutar hasta hacer match con algun email
        do {
            System.out.println("Insert Your email: [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            //Si viene entonces es un doctor
            if (userType == 1){
                //Reccore la coleccion de datos
                for (Doctor d: doctors){
                    if (d.getEmail().equals(email)){
                        emailCorrect = true;
                        //Obtener el usuario loggeado
                        doctorLogged = d;
                        //ShowDoctorMenu
                        UIDoctorMEnu.showDoctorMenu();

                    }
                }
            }
            //Si es dos entonces es un paciente
            if (userType == 2){
                //Reccore la coleccion de datos
                for (Patient p: patients){
                    if (p.getEmail().equals(email)){
                        emailCorrect = true;
                        //Obtener el usuario loggeado
                        patientLogged = p;
                        //ShowPatientMenu


                    }
                }
            }
        }while (!emailCorrect);//Si el email no es correcto ejecutar el bucle
    }

    static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
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
