package com.orientacao_a_objetos.semana_3_6.roteiro_04.classes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {

    private String id;
    private Quarto quarto;
    private Hospede hospede;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private double valorTotal;

    public Reserva() {
        this.id = "";
        this.quarto = new Quarto();
        this.hospede = new Hospede();
        this.valorTotal = 0;
    }

    public Reserva(String id, Quarto quarto, Hospede hospede,
                   LocalDate checkIn, LocalDate checkOut) {
        this.id = id;
        this.quarto = quarto;
        this.hospede = hospede;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        calcularValorTotal();
    }

    public void calcularValorTotal() {
        long noites = ChronoUnit.DAYS.between(checkIn, checkOut);
        this.valorTotal = noites * quarto.getPreco();
    }
    public void atualizarValorTotal(){
        if(this.quarto!= null && this.checkIn!= null && this.checkOut != null){
            calcularValorTotal();
        }
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id='" + id + '\'' +
                ", hospede=" + hospede.getNome() +
                ", quarto=" + quarto.getNum() +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                ", valorTotal=R$ " + valorTotal +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
        atualizarValorTotal();
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
        atualizarValorTotal();
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
        atualizarValorTotal();
    }

    public double getValorTotal() {
        return valorTotal;
    }
}