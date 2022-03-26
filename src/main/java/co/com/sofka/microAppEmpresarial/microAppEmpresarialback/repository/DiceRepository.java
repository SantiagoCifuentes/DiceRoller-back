package co.com.sofka.microAppEmpresarial.microAppEmpresarialback.repository;

import co.com.sofka.microAppEmpresarial.microAppEmpresarialback.model.Dice;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

public interface DiceRepository extends ReactiveMongoRepository<Dice,String>
{
}
