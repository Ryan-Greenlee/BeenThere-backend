package com.app.backend.controller.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="login_user")
@AllArgsConstructor
@Data
@DynamicUpdate
@DynamicInsert
@NoArgsConstructor

public class Pin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="pinID")
    private int id;

    private String locationName;

    private String arrivalDate;

    private String departureDate;

    private double latitude;

    private double longitude;

    private String details;

    private String imageUrl;

    public int getPinId() {
        return id;
    }
}
