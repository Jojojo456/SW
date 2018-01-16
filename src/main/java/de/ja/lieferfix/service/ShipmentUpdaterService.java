package de.ja.lieferfix.service;

import javax.ejb.Schedule;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 * @author Johannes Albert <OTH Regensburg>
 */

@Singleton
public class ShipmentUpdaterService {
    
    @Inject
    private ShipmentStateService shipmentService;
    
    @Schedule(second = "*/5", minute = "*", hour = "*", persistent = false)
    public void updateShipmentState(){
        System.out.println("____SCHEDULER____");
        shipmentService.updateShipmentStates();
    }
    
}
