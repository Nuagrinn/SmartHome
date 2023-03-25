package ru.mycompany.smarthome.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class DeviceMessageConsumer {

    @Autowired
    private SmartKettleService smartKettleService;

    @KafkaListener(topics = "smart-kettle")
    public void consumeSmartKettle(String message) {
        smartKettleService.processStatusUpdate(message);
    }
}
