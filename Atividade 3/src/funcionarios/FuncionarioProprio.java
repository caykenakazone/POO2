package funcionarios;

public class FuncionarioProprio {
    private String nome;
    private double horasTrabalhadas;
    private double valorPorHora;

    // getters e setters

    public double calcularPagamento() {
        return horasTrabalhadas * valorPorHora;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
}
