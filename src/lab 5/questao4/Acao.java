package questao4;

import java.util.ArrayList;
import java.util.List;

public class Acao implements AcaoSubject {
    private String nome;
    private double preco;
    private List<InvestidorObserver> investidores;

    public Acao(String nome, double precoInicial) {
        this.nome = nome;
        this.preco = precoInicial;
        this.investidores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
        System.out.println("\npreco da acao" + this.nome + "alterado para R$" + this.preco);
        notificarInvestidores();
    }

    @Override
    public void registrarInvestidor(InvestidorObserver i) {
        investidores.add(i);
    }

    @Override
    public void removerInvestidor(InvestidorObserver i) {
        investidores.remove(i);
    }

    @Override
    public void notificarInvestidores() {
        for (InvestidorObserver investidor : investidores) {
            investidor.atualizar(this, this.preco);
        }
    }
}
