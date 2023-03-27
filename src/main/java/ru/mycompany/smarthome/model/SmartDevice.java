package ru.mycompany.smarthome.model;

import javax.persistence.*;

@Entity
@MappedSuperclass
@Table(name = "smart_device")
public abstract class SmartDevice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    public void setStatus(String status) {
    }

    // getters and setters
}
