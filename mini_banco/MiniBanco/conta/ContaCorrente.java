package MiniBanco.conta;
import MiniBanco.Menu;
import java.io.IOException;

public class ContaCorrente extends Conta{
    public ContaCorrente(String nome, String cpf, int codigoDaAgencia, int senha, Double valorDeDinheiroEmConta, int numeroDaConta) {
        super(nome, cpf, codigoDaAgencia, senha, valorDeDinheiroEmConta, numeroDaConta);
    }

    @Override
    public void sacar(Double valorSacado) throws IOException {
        if (valorSacado <= 0){
            System.out.println("");
            throw new IllegalArgumentException("| Valor de saque invalido |");

        } else if (valorSacado > getValorDeDinheiroEmConta()) {
            System.out.println("");
            throw new IllegalArgumentException("| Saldo Indisponivel em conta |");
        } else {
            System.out.println("");
            System.out.println("| Sacando |");
            setValorDeDinheiroEmConta(getValorDeDinheiroEmConta() - valorSacado);
            Menu.opcoes();
        }
    }
}
