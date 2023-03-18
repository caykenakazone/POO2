package Ex3;

public class Pessoa {
    private String nome, sobrenome;
    public Pessoa(){}

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }


    //Metodos

    public String getNomeCompleto(){
        return nome+" "+sobrenome;
    }

    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }


}
