package UI;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {
    public static void showPatientMenu(){
        int response = 0;

        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome: " + UiMenu.patientLogged.getName());
            System.out.println("1. Book an appointment");
            System.out.println("2- My appointment");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    showBookAppointMenu();
                    break;
                case 2:
                    showPAtientMyAppointmets();
                    break;

                case 0:
                    UiMenu.showMenu();
                    break;
            }

        }while (response != 0);
    }

    private static  void showBookAppointMenu(){
        int response = 0;
        do {
            System.out.println(":: Book an appointment");
            System.out.println(":: Select date");
            //Numeracion de la lista de fechas
            //Indice de la fecha seleccionada
            //[Doctos]
            //1.- Doctor1
                //Fecha1
                //Fecha2
            //2.- Doctor2
            //Fecha1
            //Fecha2
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < UIDoctorMEnu.doctorsAvailableAppointments.size(); i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments =
                        UIDoctorMEnu.doctorsAvailableAppointments.get(i).getAvailableAppointments();

                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();
                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k + "." + availableAppointments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j), UIDoctorMEnu.doctorsAvailableAppointments.get(i));
                    doctors.put(Integer.valueOf(k), doctorAppointments);
                }
            }
            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());

            Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("", "");

            for (Map.Entry<Integer, Doctor> doc:doctorAvailableSelected.entrySet()) {
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();
            }

            System.out.println(doctorSelected.getName() +
                            ". Date" + doctorSelected.getAvailableAppointments().get(indexDate).getDate() +
                            ". Time: " + doctorSelected.getAvailableAppointments().get(indexDate).getTime());
            System.out.println("Confirm your appointments:\n1. Yes \n2. Change Data");
            response = Integer.valueOf(sc.nextLine());

            if (response == 1){
                UiMenu.patientLogged.addAppointmentDoctors(doctorSelected, doctorSelected.
                        getAvailableAppointments().get(indexDate).getDate(null),
                        doctorSelected.getAvailableAppointments().get(indexDate).getTime());

                showPatientMenu();

            }

        }while (response != 0);
    }

    private  static  void showPAtientMyAppointmets(){
        int response = 0;
        do {
            System.out.println("::My Aooiubtnebts");
            if (UiMenu.patientLogged.getAppointmentDoctors().size() == 0){
                System.out.println("Don´t have appointments");
                break;
            }

            for (int i = 0; i < UiMenu.patientLogged.getAppointmentDoctors().size(); i++) {
                int j = i + 1;
                System.out.println(j + ". " +
                        "Date: "+UiMenu.patientLogged.getAppointmentDoctors().get(i).getDate() +
                        "Time: " + UiMenu.patientLogged.getAppointmentDoctors().get(i).getTime() +
                        "\n Doctor: " + UiMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor().getName());
            }
            System.out.println("0. Return");
        }while (response != 0);
    }
}
