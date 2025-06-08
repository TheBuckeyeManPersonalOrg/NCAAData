package ncaa.get.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ncaa.get.data.service.Orchestrator;

@SpringBootApplication
public class DataApplication {

	private static final Logger log = LoggerFactory.getLogger(DataApplication.class);

	public static void main(String[] args) {

		int exitCode = 0;
		ConfigurableApplicationContext context = null;
		try{
			context = SpringApplication.run(DataApplication.class, args);

			//Run the services
			Orchestrator orchestrator = context.getBean(Orchestrator.class);
			orchestrator.executeScript();

			log.info("Application Executed Successfully!");
		
		} catch (Exception e) {
			log.error("Error starting application, application will not run..", e.getMessage(), e);
			exitCode = 1;

		} finally {
			if (context != null){
				SpringApplication.exit(context);
			}
			log.info("Exiting the script with exit code: " + exitCode);
			System.exit(exitCode);
		}
	}
}
