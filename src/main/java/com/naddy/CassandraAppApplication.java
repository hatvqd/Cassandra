package com.naddy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Import;

import com.naddy.configuration.CassandraConfiguration;

import com.naddy.repository.CompanyRepository;

@SpringBootApplication
@Import(CassandraConfiguration.class)
public class CassandraAppApplication implements CommandLineRunner {

    @Autowired
    @Qualifier("companyRepository")
    private CompanyRepository companyRepository;

    public static void main(final String[] args) {
        SpringApplication.run(CassandraAppApplication.class, args);
    }

    @Override
    public void run(final String... strings) throws Exception { }
}
