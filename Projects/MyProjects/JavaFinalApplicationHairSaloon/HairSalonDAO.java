package com.evergent.coreJava.JavaFinalApplicationHairSaloon;

import java.sql.*;

public class HairSalonDAO {
    Connection con = null;
    PreparedStatement pstmt = null;

    public int addService(HairSalonBean service) {
        try {
            con = HairSalonDBConnection.getConnection();
            String ins_str = "INSERT INTO salon_services VALUES (?, ?, ?)";
            pstmt = con.prepareStatement(ins_str);
            pstmt.setInt(1, service.getServiceId());
            pstmt.setString(2, service.getServiceName());
            pstmt.setDouble(3, service.getPrice());
            int updateCount = pstmt.executeUpdate();
            con.close();
            return updateCount;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return 0;
        }
    }

    public String getService(int serviceId) {
        try {
            con = HairSalonDBConnection.getConnection();
            String query = "SELECT * FROM salon_services WHERE service_id = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, serviceId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return "Service ID: " + rs.getInt(1) + ", Name: " + rs.getString(2) +
                        ", Price: " + rs.getDouble(3);
            }
            con.close();
            return "Service not found";
        } catch (Exception e) {
            System.out.println(e.toString());
            return "Error retrieving service information";
        }
    }

    public int bookAppointment(AppointmentBean appointment) {
        try {
            con = HairSalonDBConnection.getConnection();
            String ins_str = "INSERT INTO appointments VALUES (?, ?, ?, ?)";
            pstmt = con.prepareStatement(ins_str);
            pstmt.setInt(1, appointment.getAppointmentId());
            pstmt.setString(2, appointment.getCustomerName());
            pstmt.setString(3, appointment.getServiceName());
            pstmt.setString(4, appointment.getAppointmentDate());
            int updateCount = pstmt.executeUpdate();
            con.close();
            return updateCount;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return 0;
        }
    }

    public String getAllAppointments() {
        try {
            con = HairSalonDBConnection.getConnection();
            String query = "SELECT * FROM appointments";
            pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            StringBuilder appointmentsList = new StringBuilder();
            while (rs.next()) {
                appointmentsList.append("ID: ").append(rs.getInt(1))
                        .append(", Customer: ").append(rs.getString(2))
                        .append(", Service: ").append(rs.getString(3))
                        .append(", Date: ").append(rs.getString(4)).append("\n");
            }
            con.close();
            return appointmentsList.toString();
        } catch (Exception e) {
            System.out.println(e.toString());
            return "Error retrieving appointments";
        }
    }
}

