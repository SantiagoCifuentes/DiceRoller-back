package co.com.sofka.microAppEmpresarial.microAppEmpresarialback.service;

import co.com.sofka.microAppEmpresarial.microAppEmpresarialback.dto.DiceDto;
import co.com.sofka.microAppEmpresarial.microAppEmpresarialback.model.Dice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import co.com.sofka.microAppEmpresarial.microAppEmpresarialback.repository.DiceRepository;

@Service
public class DiceService

{
    @Autowired
    public DiceRepository diceRepository;

    public Mono<Dice>agregarDado()
    {
        Dice dice= new Dice();
        
        return diceRepository.save(dice);
    }

}
