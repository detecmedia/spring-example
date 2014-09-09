package de.detecmedia.springdemo.schedule;

import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 
 * @author mpt <mpt@detecmedia.de>
 */
public class BasicServiceFixedDelay {
    
   @Scheduled(fixedDelay = 5000)
   public void demoService() {
       System.out.println("Mehtode wird alle 5 Sekunden ausgefuehrt. Aktuelle Zeit ist -> "+ new Date());
   } 
}
