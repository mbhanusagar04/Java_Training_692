package com.evergent.coreJava.JavaFinalApplicationHairSaloon;

public class HairSalonService {
    HairSalonDAO salonDAO = new HairSalonDAO();

    public int addService(int serviceId, String serviceName, double price) {
        HairSalonBean service = new HairSalonBean();
        service.setServiceId(serviceId);
        service.setServiceName(serviceName);
        service.setPrice(price);
        return salonDAO.addService(service);
    }

    public String viewService(int serviceId) {
        return salonDAO.getService(serviceId);
    }

    public int bookAppointment(int appointmentId, String customerName, String serviceName, String appointmentDate) {
        AppointmentBean appointment = new AppointmentBean();
        appointment.setAppointmentId(appointmentId);
        appointment.setCustomerName(customerName);
        appointment.setServiceName(serviceName);
        appointment.setAppointmentDate(appointmentDate);
        return salonDAO.bookAppointment(appointment);
    }

    public String viewAllAppointments() {
        return salonDAO.getAllAppointments();
    }
}


