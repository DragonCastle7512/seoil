package datasource;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Properties prop = new Properties();
        InputStream input = new FileInputStream("src/main/java/datasource/db.properties");
        prop.load(input);

        String driver = prop.getProperty("jdbc.driverClassName");
        String url = prop.getProperty("jdbc.url");
        String user = prop.getProperty("jdbc.username");
        String password = prop.getProperty("jdbc.password");
        System.out.println(driver);
        System.out.println(url);
        System.out.println(user);
        System.out.println(password);
        
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(user);
        ds.setPassword(password);
        
        Connection con = ds.getConnection();
        System.out.println(con);
        
        DataSource interds = (DataSource)ds;
        Connection con2 = interds.getConnection();
        System.out.println(con2);
	}

}
