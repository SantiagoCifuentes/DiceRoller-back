package co.com.sofka.microAppEmpresarial.microAppEmpresarialback.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "diceroller")
public class Dice
{
    @Id
    private String id;

    private Double valor;
    private LocalDateTime date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }


    public Dice() {
        this.valor = lanzarDado();
        this.date = LocalDateTime.now();
    }

    public Double lanzarDado()
    {
        double dado = Math.floor(Math.random() * 6) + 1;
        System.out.println(dado);
        return dado;


    }
}
