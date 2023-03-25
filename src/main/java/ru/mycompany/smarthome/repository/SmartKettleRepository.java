package ru.mycompany.smarthome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mycompany.smarthome.model.SmartKettle;

public interface SmartKettleRepository extends JpaRepository<SmartKettle, Long> {
}
