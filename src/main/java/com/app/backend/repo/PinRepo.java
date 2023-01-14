package com.app.backend.repo;

import com.app.backend.controller.model.Pin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PinRepo extends JpaRepository<Pin, String> {

    Pin findByPinId(int id);
}
