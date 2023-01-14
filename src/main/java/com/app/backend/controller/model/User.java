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
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="userId")
    private int id;

    @Column(name = "userName")
    private String userName;

    @Column(name="password")
    private String password;

    public int getid() {
        return id;
    }
}
