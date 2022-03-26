package co.com.sofka.microAppEmpresarial.microAppEmpresarialback.controller;

import co.com.sofka.microAppEmpresarial.microAppEmpresarialback.model.Dice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import co.com.sofka.microAppEmpresarial.microAppEmpresarialback.service.DiceService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class DiceController
{
    @Autowired
    DiceService diceService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/lanzar")
    public Mono<Dice> save()
    {
        return diceService.agregarDado();
    }




}
