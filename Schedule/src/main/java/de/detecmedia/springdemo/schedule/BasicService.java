/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.detecmedia.springdemo.schedule;

import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 
 * @author mpt <mpt@detecmedia.de>
 */
public class BasicService {
    
   @Scheduled(fixedDelay = 5000)
   public void demoService() {
       System.out.println("Mehtode wird alle 5 Sekunden ausgefuehrt. Aktuelle Zeit ist -> "+ new Date());
   } 
}
