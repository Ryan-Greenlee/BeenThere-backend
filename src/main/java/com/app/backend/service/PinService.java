package com.app.backend.service;

import com.app.backend.exception.PinNotFoundException;
import com.app.backend.model.Pin;
import com.app.backend.repo.PinRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PinService {
    private final PinRepo pinRepo;

    @Autowired
    public PinService(PinRepo pinRepo) {
        this.pinRepo = pinRepo;
    }

    public Pin addPin(Pin pin) {
        return pinRepo.save(pin);
    }

    public List<Pin> findAllPins() {
        return pinRepo.findAll();
    }

    public Pin updatePin(Pin pin) {
        return pinRepo.save(pin);
    }

    public Pin findPinById(Integer id) {
        return pinRepo.findPinById(id)
                .orElseThrow(() -> new PinNotFoundException("Pin " + id + "was not found"));
    }

    public void deletePin(Integer id) {
        pinRepo.deletePinById(id);
    }

}
