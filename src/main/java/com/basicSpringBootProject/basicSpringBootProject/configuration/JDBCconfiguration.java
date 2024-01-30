package com.basicSpringBootProject.basicSpringBootProject.configuration;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JDBCconfiguration {

	@Bean public static DataSource source()
    {
  
        DataSourceBuilder<?> dSB
            = DataSourceBuilder.create();
        dSB.driverClassName("org.postgresql.Driver");
  
        // MySQL specific url with database name
        dSB.url("jdbc:postgresql://localhost:5632/nclat");
  
        // MySQL username credential
        dSB.username("posgres");
  
        // MySQL password credential
        dSB.password("posgress");
  
        return dSB.build();
    }
	
}
