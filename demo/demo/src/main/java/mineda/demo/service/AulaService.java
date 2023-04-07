package mineda.demo.service;

import mineda.demo.repository.AulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AulaService {

    @Autowired
    private AulaRepository Aula;

}
