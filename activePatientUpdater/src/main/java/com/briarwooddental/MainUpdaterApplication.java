package com.briarwooddental;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;


@SpringBootApplication
public class MainUpdaterApplication implements CommandLineRunner {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    public static void main(String args[]) {
        SpringApplication.run(MainUpdaterApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception{
        CreateActivePatientList createActivePatientList = new CreateActivePatientList(jdbcTemplate);
        createActivePatientList.patientList();
    }


}

