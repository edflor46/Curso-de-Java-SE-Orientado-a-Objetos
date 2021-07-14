package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //Atributo
    private String speciality;
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

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
    public void addAvailableAppointment(String date, String time) {
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
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        //Get y Set
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate(String DATE) {
            return date;
        }

        public String getDate() {
            return format.format(date);
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

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        @Override
        public String toString(){
            return "Available Appointments \nDate: " + date + "\nTime: " + time;
        }
    }
}
