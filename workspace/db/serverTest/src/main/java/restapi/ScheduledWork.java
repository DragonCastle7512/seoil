package restapi;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class ScheduledWork {
	
	@Autowired
	RestApiService service;
	
	@Scheduled(cron="0/10 * * * * ?")
	public void updateDB() throws IOException {
		InputStream in = new URL("https://jsonplaceholder.typicode.com/users").openStream();
		int read = 0;
		String data = "";
		while ((read = in.read()) != -1)
			data += (char)read;
		ObjectMapper mapper = new ObjectMapper();
		ExternalMember[] members = mapper.readValue(data, ExternalMember[].class);
		service.deleteAll();
        service.saveAll(members);
	}
}