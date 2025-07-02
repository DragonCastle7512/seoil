package mybatis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zaxxer.hikari.HikariDataSource;

public class HikariDataSourceMain {

	public static void main(String[] args) throws Exception{
		//Hikaricp 라이브러리 추가
		ApplicationContext app = new ClassPathXmlApplicationContext("mybatis/setting.xml");
		HikariDataSource hds = (HikariDataSource)app.getBean("hikariDataSource");
		System.out.println(hds.getConnection());
	}

}
