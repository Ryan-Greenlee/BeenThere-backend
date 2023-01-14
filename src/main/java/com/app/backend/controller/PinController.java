package com.app.backend.controller;

import com.app.backend.controller.model.Pin;
import com.app.backend.repo.PinRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pin")
@CrossOrigin(origins = "http://localhost:4200")
public class PinController {

    @Autowired
    private PinRepo repo;

    @PostMapping("/pins")
    public ResponseEntity<Pin> createPin(@RequestBody Pin pin) { return ResponseEntity.ok(repo.save(pin));}

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody Pin pinData) {
        Pin pin =repo.findByPinId(pinData.getPinId());
        return ResponseEntity.ok(pin);
    }
}
