package com.practice.Student_Management_System;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import student.Utility.StudentHibernateUtility;
import student.entity.StudentVehicles;

public class SetStudentVehicles {

    public void setVehicleDetails() {

        SessionFactory Factory = StudentHibernateUtility.getSessionFactory();
        Session session = Factory.openSession();
        Transaction transaction = session.beginTransaction();

        // Code to set vehicle details for students
        StudentVehicles vehicle = new StudentVehicles();

        vehicle.setVehicleId(1);
        vehicle.setVehicleName("Honda Civic");
        vehicle.setVehicleType("Car");
        System.out.println("Vehicle Details: " + vehicle.toString());
        System.out.println("Vehicle details have been set successfully.");

        transaction.commit();
        session.close();
    }

}
