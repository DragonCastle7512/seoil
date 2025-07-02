package springdatasource;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DriverManagerDataSource2 {
	
	public static void main(String[] args) throws Exception {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("springdatasource/setting.xml");
		DriverManagerDataSource ds = (DriverManagerDataSource)app.getBean("drivermanagerds2");
		System.out.println(ds.getConnection());
	}
}
