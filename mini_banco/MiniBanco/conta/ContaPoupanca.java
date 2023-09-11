package MiniBanco.conta;
import MiniBanco.Menu;
import java.io.IOException;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String nome, String cpf, int codigoDaAgencia, int senha, Double valorDeDinheiroEmConta, int numeroDaConta) {
        super(nome, cpf, codigoDaAgencia, senha, valorDeDinheiroEmConta, numeroDaConta);
    }

    @Override
    public void sacar(Double valorSacado){
        if (valorSacado <= 0){
            throw new IllegalArgumentException("| Valor de saque invalido |");
        } else if (valorSacado > getValorDeDinheiroEmConta()) {
            System.out.println("");
            throw new IllegalArgumentException("| Saldo Indisponivel em conta |");
        } else {
            System.out.println("Sacando");
            setValorDeDinheiroEmConta(getValorDeDinheiroEmConta() - valorSacado);
        }
        try {
            Menu.opcoes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}