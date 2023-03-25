package ru.mycompany.smarthome.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mycompany.smarthome.model.SmartKettle;
import ru.mycompany.smarthome.repository.SmartKettleRepository;

@Service
public class SmartKettleService {

    @Autowired
    private SmartKettleRepository smartKettleRepository;

    public void processStatusUpdate(String status) {
        SmartKettle smartKettle = smartKettleRepository.findById(1L).orElse(null);
        if (smartKettle != null) {
            smartKettle.setStatus(status);
            smartKettleRepository.save(smartKettle);
        }
    }
}

