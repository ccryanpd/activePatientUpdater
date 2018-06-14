package com.briarwooddental;

import java.time.LocalDate;

public class Patient {

    private int patientId;
    private String patientName;
    private String lastDateOfService;
    private LocalDate dateFormattedLastDateOfService;

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getLastDateOfService() {

        return lastDateOfService;
    }

    public LocalDate getDateFormattedLastDateOfService() {
        return dateFormattedLastDateOfService;
    }

    public void setDateFormattedLastDateOfService(LocalDate dateFormattedLastDateOfService) {
        this.dateFormattedLastDateOfService = dateFormattedLastDateOfService;
    }

    public void setLastDateOfService(String lastDateOfService) {
        this.lastDateOfService = lastDateOfService;
    }
}