package com.example.freighttrackerapi.controller;

import com.example.freighttrackerapi.model.Shipment;
import com.example.freighttrackerapi.service.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shipments")
public class ShipmentController {

    @Autowired
    private ShipmentService shipmentService;

    @GetMapping
    public List<Shipment> getAllShipments() {
        return shipmentService.getAllShipments();
    }

    @PostMapping
    public Shipment addShipment(@RequestBody Shipment shipment) {
        return shipmentService.addShipment(shipment);
    }

    @DeleteMapping("/{id}")
    public boolean deleteShipment(@PathVariable Long id) {
        return shipmentService.deleteShipment(id);
    }
}
