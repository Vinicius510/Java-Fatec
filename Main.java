public class Funcionario {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public void baterPonto() {
        System.out.println("Ponto batido por " + nome);
    }
}

public class Gerente extends Funcionario {
    public Gerente(String nome) {
        super(nome);
    }

    public void fecharCaixa() {
        System.out.println("Caixa fechado por gerente " + getNome());
    }

    public void realizarPlanejamento() {
        System.out.println("Planejamento realizado por gerente " + getNome());
    }
}

public class Vendedor extends Funcionario {
    public Vendedor(String nome) {
        super(nome);
    }

    public void realizarVenda() {
        System.out.println("Venda realizada por vendedor " + getNome());
    }

    public void atenderCliente() {
        System.out.println("Cliente atendido por vendedor " + getNome());
    }
}

public class Faxineiro extends Funcionario {
    public Faxineiro(String nome) {
        super(nome);
    }

    public void solicitarMaterial() {
        System.out.println("Material solicitado por faxineiro " + getNome());
    }

    public void realizarLimpeza() {
        System.out.println("Limpeza realizada por faxineiro " + getNome());
    }
}