package com.oracle.dto;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID empId;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name="last_name",nullable = false)
    private String lastName;

    public UUID getEmpId() {
        return empId;
    }

    private void setEmpId(UUID empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
