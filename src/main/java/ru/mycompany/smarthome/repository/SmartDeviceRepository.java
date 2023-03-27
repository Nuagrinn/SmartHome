package ru.mycompany.smarthome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mycompany.smarthome.model.SmartDevice;

@Repository
public interface SmartDeviceRepository extends JpaRepository<SmartDevice, Long> {
}
