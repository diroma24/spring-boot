package es.romadie.da2d1a.ejercicio3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SystemOutMessageService implements MessageService {
    @Override
    public void showMessage(String message) {
        System.out.println("[LOG]: " + message);
    }
}
