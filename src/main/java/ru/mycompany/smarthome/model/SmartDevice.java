package ru.mycompany.smarthome.model;

import javax.persistence.*;

@Entity
@Table(name = "smart_device")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "device_type")
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
