package com.app.backend.repo;

import com.app.backend.model.Pin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PinRepo extends JpaRepository<Pin, Integer> {
    void deletePinById(Integer id);

    Optional<Pin> findPinById(Integer id);
}
