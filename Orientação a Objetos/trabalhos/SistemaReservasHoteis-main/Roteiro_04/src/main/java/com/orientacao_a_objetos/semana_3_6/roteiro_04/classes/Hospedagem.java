package com.orientacao_a_objetos.semana_3_6.roteiro_04.classes;

import java.time.LocalDate;

public class Hospedagem {
    private LocalDate checkIn;
    private LocalDate checkOut;
    
    public Hospedagem(){
    }

    public Hospedagem(LocalDate checkIn, LocalDate checkOut) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }
    

 }
