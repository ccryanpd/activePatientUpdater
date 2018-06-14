package com.briarwooddental;

import org.springframework.jdbc.core.JdbcTemplate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

public class CreateActivePatientList {

    private List<Patient> patients;
    private JdbcTemplate jdbcTemplate;

    public CreateActivePatientList(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void patientList() {
        String SQL = "select * from bwdactivepatients";
        patients = jdbcTemplate.query(SQL, new PatientMapper());
        updatePatientListWithLocalDate(patients);
    }

    private void updatePatientListWithLocalDate(List<Patient> patients) {
        for (Patient patient : patients) {
            String date = patient.getLastDateOfService();
            if (!(date.equals(""))) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yy", Locale.ENGLISH);
                LocalDate localdate = LocalDate.parse(date, formatter);
                java.sql.Date.valueOf(localdate);
                patient.setDateFormattedLastDateOfService(localdate);
                System.out.println(patient.getDateFormattedLastDateOfService());
            }
        }
    }

}