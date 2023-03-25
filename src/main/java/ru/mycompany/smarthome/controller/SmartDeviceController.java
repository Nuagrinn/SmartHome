package ru.mycompany.smarthome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mycompany.smarthome.model.SmartDevice;
import ru.mycompany.smarthome.repository.SmartDeviceRepository;

import java.util.List;

@RestController
@RequestMapping("/devices")
public class SmartDeviceController {

    @Autowired
    private SmartDeviceRepository smartDeviceRepository;

    @GetMapping("/{id}")
    public SmartDevice getDevice(@PathVariable Long id) {
        return smartDeviceRepository.findById(id).orElse(null);
    }

    @GetMapping("/all")
    public List<SmartDevice> getAllDevices() {
        return smartDeviceRepository.findAll();
    }
}
