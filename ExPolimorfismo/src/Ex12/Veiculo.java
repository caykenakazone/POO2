package Ex12;

import Ex10.Animal;

import java.util.ArrayList;
import java.util.List;

public class Veiculo {
    private String marca, modelo;
    private int ano;


    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    //Métodos

    public void ligar(){
        System.out.println("O veiculo ligou");
    }

    public void desligar(){
        System.out.println("O veiculo desligou");
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
