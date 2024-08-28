package ProjectHospitalMang;

import java.util.ArrayList;
import java.util.Scanner;

public class HospitalManagement {
    private static ArrayList<Patient> patients = new ArrayList<>();
    private static ArrayList<Doctor> doctors = new ArrayList<>();
    private static ArrayList<Appointment> appointments = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int choice;
        do {            
            System.out.println("Hospital Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. View Patients");
            System.out.println("5. View Doctors");
            System.out.println("6. View Appointments");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addPatient(scanner);
                    break;
                case 2:
                    addDoctor(scanner);
                    break;
                case 3:
                    scheduleAppointment(scanner);
                    break;
                case 4:
                    viewPatients();
                    break;
                case 5:
                    viewDoctors();
                    break;
                case 6:
                    viewAppointments();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
        scanner.close();
        
    }
    static void addPatient(Scanner sc){
        System.out.print("Enter patient name: ");
        String name= sc.next();

        System.out.print("Enter patient age: ");
        int age= sc.nextInt();

        System.out.print("Enter patient gender: ");
        String gender= sc.next();

        Patient p=new Patient(name, age, gender);
        patients.add(p);
        System.out.println("Patient detail added sucessfully");
    }

    static void addDoctor(Scanner sc){
        System.out.print("Enter Doctor name: ");
        String name= sc.next();

        System.out.print("Enter Doctor speciality: ");
        String speciality= sc.next();

        Doctor d=new Doctor(name, speciality);
        doctors.add(d);
        System.out.println("Doctor detail added sucessfully");

    }
    
    private static void scheduleAppointment(Scanner scanner) {
        System.out.print("Enter Patient ID: ");
        int patientId = scanner.nextInt();
        System.out.print("Enter Doctor ID: ");
        int doctorId = scanner.nextInt();
        System.out.print("Enter Appointment Date (YYYY-MM-DD): ");
        String date = scanner.next();

        Patient patient = findPatientById(patientId);
        Doctor doctor = findDoctorById(doctorId);

        if (patient != null && doctor != null) {
            Appointment appointment = new Appointment(patient, doctor, date);
            appointments.add(appointment);
            System.out.println("Appointment scheduled successfully!");
        } else {
            System.out.println("Invalid Patient ID or Doctor ID.");
        }
    }

    private static void viewPatients() {
        System.out.println("List of Patients:");
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    private static void viewDoctors() {
        System.out.println("List of Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }

    private static void viewAppointments() {
        System.out.println("List of Appointments:");
        for (Appointment appointment : appointments) {
            System.out.println(appointment);
        }
    }

    private static Patient findPatientById(int id) {
        for (Patient patient : patients) {
            if (patient.getid() == id) {
                return patient;
            }
        }
        return null;
    }

    private static Doctor findDoctorById(int id) {
        for (Doctor doctor : doctors) {
            if (doctor.getId() == id) {
                return doctor;
            }
        }
        return null;
    }


}
