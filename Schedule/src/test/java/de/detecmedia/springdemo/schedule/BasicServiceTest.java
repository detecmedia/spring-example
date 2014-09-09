/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.detecmedia.springdemo.schedule;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Ausführen des BasicServices.
 * 
 * @author mpt <mpt@detecmedia.de>
 */
public class BasicServiceTest {
    
    public static void main(String[] args) {
        /*
        Laden der Konfiguration aus den Resources -> /src/main/resources/basicservice-config.xml
        */
        new ClassPathXmlApplicationContext("classpath:basicservice-config.xml");
    }
    
}
