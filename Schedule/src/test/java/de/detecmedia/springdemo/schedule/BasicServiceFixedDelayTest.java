
package de.detecmedia.springdemo.schedule;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Ausführen des BasicServices.
 * 
 * @author mpt <mpt@detecmedia.de>
 */
public class BasicServiceFixedDelayTest {
    
    public static void main(String[] args) {
        /*
        Laden der Konfiguration aus den Resources -> /src/main/resources/basicServiceFixedDelay-config.xml
        */
        new ClassPathXmlApplicationContext("classpath:basicServiceFixedDelay-config.xml");
    }
    
}
