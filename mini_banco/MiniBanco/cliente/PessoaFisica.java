package MiniBanco.cliente;

import java.util.ArrayList;
import java.util.List;

public class PessoaFisica {
    private String nome;
    private String cpf;

    
    public PessoaFisica(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
