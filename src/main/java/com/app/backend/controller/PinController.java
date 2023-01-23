package com.app.backend.controller;

import com.app.backend.model.Pin;
import com.app.backend.repo.PinRepo;
import com.app.backend.service.PinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pin")
@CrossOrigin(origins = "http://localhost:4200")
public class PinController {

    private final PinService pinService;

    @Autowired
    private PinRepo pinRepo;

    public PinController(PinService pinService) {
        this.pinService = pinService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Pin>> getAllPins() {
        List<Pin> pins = pinService.findAllPins();
        return new ResponseEntity<>(pins, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Pin> getPinById(@PathVariable("id") Integer id) {
        Pin pin = pinService.findPinById(id);
        return new ResponseEntity<>(pin, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Pin> addPin(@RequestBody Pin pin) {
        Pin newPin = pinService.addPin(pin);
        return new ResponseEntity<>(newPin, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Pin> updatePin(@RequestBody Pin pin) {
        Pin updatePin = pinService.updatePin(pin);
        return new ResponseEntity<>(updatePin, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePin(@PathVariable("id") Integer id) {
        pinService.deletePin(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



//    @PostMapping("/pin")
//    public ResponseEntity<Pin> savePins(@RequestBody Pin pin) {
//        return ResponseEntity.ok(pinRepo.save(pin));
//    }



}



