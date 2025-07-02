package springdatasource;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class SimpleDataSourceMain {

	public static void main(String[] args) throws Exception {
		ApplicationContext app = new ClassPathXmlApplicationContext("springdatasource/setting.xml");
		SimpleDriverDataSource sds = (SimpleDriverDataSource)app.getBean("ds");
		Connection con = sds.getConnection();
		System.out.println(con);
		
		DataSource ds = sds;
		Connection con2 = ds.getConnection();
		System.out.println(con2);
	}

}
