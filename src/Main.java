import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Metodo estatico se utiliza como si fuera parte de esta clase debido al import
        //showMenu();

        //model.Doctor
        Doctor myDoctor = new Doctor("Eduardo Flores", "edflor@gmail.com");
        myDoctor.addAvailableAppointment(new Date(), "3 pm");
        myDoctor.addAvailableAppointment(new Date(), "10 am");
        myDoctor.addAvailableAppointment(new Date(), "8 am");
        System.out.println(myDoctor);
        /*for (model.Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
         */

        System.out.println();
        System.out.println();

        //model.Patient
        Patient patient  = new Patient("Alejandra", "alejandra@gmail.com");
        System.out.println(patient);






    }


}
