package ru.mycompany.smarthome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mycompany.smarthome.model.SmartDevice;

public interface SmartDeviceRepository extends JpaRepository<SmartDevice, Long> {
}

