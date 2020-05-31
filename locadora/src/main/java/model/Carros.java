/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author SD
 */
public class Carros {

    private int portas;
    private int passageiros;
    private int malasGrandes;
    private int malaPequena;
    private boolean arCondicionado;
    private boolean vidrosEletrico;
    private boolean airBag;
    private boolean abs;
    private boolean travaEletrica;
    private boolean cambioAutomatico;
    private boolean disponivel;

    public Carros(int portas, int passageiros, int malasGrandes, int malaPequena, boolean arCondicionado, boolean vidrosEletrico, boolean airBag, boolean abs, boolean travaEletrica, boolean cambioAutomatico, boolean disponivel) {
        this.portas = portas;
        this.passageiros = passageiros;
        this.malasGrandes = malasGrandes;
        this.malaPequena = malaPequena;
        this.arCondicionado = arCondicionado;
        this.vidrosEletrico = vidrosEletrico;
        this.airBag = airBag;
        this.abs = abs;
        this.travaEletrica = travaEletrica;
        this.cambioAutomatico = cambioAutomatico;
        this.disponivel = disponivel;
    }



    public Carros() {
    }
    
    
    

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public int getMalasGrandes() {
        return malasGrandes;
    }

    public void setMalasGrandes(int malasGrandes) {
        this.malasGrandes = malasGrandes;
    }

    public int getMalaPequena() {
        return malaPequena;
    }

    public void setMalaPequena(int malaPequena) {
        this.malaPequena = malaPequena;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public boolean isVidrosEletrico() {
        return vidrosEletrico;
    }

    public void setVidrosEletrico(boolean vidrosEletrico) {
        this.vidrosEletrico = vidrosEletrico;
    }

    public boolean isAirBag() {
        return airBag;
    }

    public void setAirBag(boolean airBag) {
        this.airBag = airBag;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public boolean isTravaEletrica() {
        return travaEletrica;
    }

    public void setTravaEletrica(boolean travaEletrica) {
        this.travaEletrica = travaEletrica;
    }

    public boolean isCambioAutomatico() {
        return cambioAutomatico;
    }

    public void setCambioAutomatico(boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }

}
