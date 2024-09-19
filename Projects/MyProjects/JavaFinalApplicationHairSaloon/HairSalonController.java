package com.evergent.coreJava.JavaFinalApplicationHairSaloon;

import java.util.Scanner;

public class HairSalonController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice, continueChoice = 1;

        HairSalonService salonService = new HairSalonService();

        System.out.println("---------- WELCOME TO HAIR SALON MANAGEMENT SYSTEM ----------");
        while (continueChoice != 0) {
            System.out.println("1. Add New Service");
            System.out.println("2. View Service Details");
            System.out.println("3. Book Appointment");
            System.out.println("4. View All Appointments");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Service ID:");
                    int serviceId = scanner.nextInt();
                    System.out.println("Enter Service Name:");
                    String serviceName = scanner.next();
                    System.out.println("Enter Service Price:");
                    double price = scanner.nextDouble();
                    int result = salonService.addService(serviceId, serviceName, price);
                    System.out.println(result + " Service Added Successfully");
                    break;
                case 2:
                    System.out.println("Enter Service ID:");
                    serviceId = scanner.nextInt();
                    String serviceDetails = salonService.viewService(serviceId);
                    System.out.println(serviceDetails);
                    break;
                case 3:
                    System.out.println("Enter Appointment ID:");
                    int appointmentId = scanner.nextInt();
                    System.out.println("Enter Customer Name:");
                    String customerName = scanner.next();
                    System.out.println("Enter Service Name:");
                    String appointmentService = scanner.next();
                    System.out.println("Enter Appointment Date:");
                    String appointmentDate = scanner.next();
                    result = salonService.bookAppointment(appointmentId, customerName, appointmentService, appointmentDate);
                    System.out.println(result + " Appointment Booked Successfully");
                    break;
                case 4:
                    String allAppointments = salonService.viewAllAppointments();
                    System.out.println("All Appointments:\n" + allAppointments);
                    break;
                default:
                    System.out.println("Enter Valid Choice");
                    break;
            }
            System.out.println("\nEnter 1 to perform More Operations and 0 for Exit :");
            continueChoice = scanner.nextInt();
        }
        scanner.close();
    }
}

