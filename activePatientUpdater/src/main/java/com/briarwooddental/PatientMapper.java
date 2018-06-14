package com.briarwooddental;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientMapper implements RowMapper<Patient> {
    public Patient mapRow(ResultSet rs, int rowNumber) throws SQLException {
        Patient patient = new Patient();
        patient.setPatientId(rs.getInt("ID"));
        patient.setPatientName(rs.getString("Name"));
        patient.setLastDateOfService(rs.getString("Date"));
        return patient;
    }
}
