package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //Atributo
    private String speciality;

    //Pasar el nombre
   public Doctor(String name, String email) {
        super(name, email);
        //System.out.println("El nombre del doctor asignado es: " + name);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //Comportamientos
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    @Override
    public String toString(){
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable" + availableAppointments.toString();
    }

    //CLASS AvailableAppointment
    public static class AvailableAppointment {
        //Available appointment
        private int id;
        private Date date;
        private String time;

        //Get y Set
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        @Override
        public String toString(){
            return "Available Appointments \nDate: " + date + "\nTime: " + time;
        }
    }
}
