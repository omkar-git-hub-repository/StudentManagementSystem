package com.practice.Student_Management_System;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import student.Utility.StudentHibernateUtility;
import student.entity.StudentVehicles;
import student.entity.Students;

public class SetStudentVehicles {

    public void setVehicleDetails() {

        SessionFactory Factory = StudentHibernateUtility.getSessionFactory();
        Session session = Factory.openSession();
        Transaction transaction = session.beginTransaction();

        // Code to set vehicle details for students
        StudentVehicles vehicle = new StudentVehicles();

        vehicle.setVehicleName("Honda Civic");
        vehicle.setVehicleType("Car");
        System.out.println("Vehicle Details: " + vehicle.toString());
        System.out.println("Vehicle details have been set successfully.");

        Students student = new Students();
      
        student.setName("John clove");
        student.setEmail("john.clove@example.com");
        student.setCourse("Computer Science");
        student.setMarks(85);

         student.setVehicle(vehicle);

       // session.persist(vehicle);
        session.persist(student);
        transaction.commit();
        session.close();
    }

}
