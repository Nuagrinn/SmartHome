package ru.mycompany.smarthome.model;

import javax.persistence.*;

@Entity
@Table(name = "smart_kettle")
@DiscriminatorValue("smart_kettle")
public class SmartKettle extends SmartDevice {

    @Column(name = "status")
    private String status;

    // getters and setters
}
