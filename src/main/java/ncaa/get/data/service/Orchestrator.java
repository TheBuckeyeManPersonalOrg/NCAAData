package ncaa.get.data.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Orchestrator {
    private final Logger log = LoggerFactory.getLogger(Orchestrator.class);
    
    @Value("${data.localsavepoint}")
    private String localSavePoint;


    public void executeScript(){
        log.info("Begining to execute the script...");
        try{
            
        } catch (RuntimeException e){
            log.error("Fatal error occured while attempting to run the script", e.getMessage(), e);
        }
    }
}
