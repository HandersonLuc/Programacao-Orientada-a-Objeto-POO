import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getQuantidadeEstoque() { return quantidadeEstoque; }

    public void baixarEstoque(int qtd) {
        if (qtd <= quantidadeEstoque) {
            quantidadeEstoque -= qtd;
        } else {
            System.out.println("Estoque insuficiente para " + nome);
        }
    }
}

class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        produto.baixarEstoque(quantidade);
    }

    public double getSubtotal() {
        return produto.getPreco() * quantidade;
    }

    @Override
    public String toString() {
        return quantidade + "x " + produto.getNome() + " = R$ " + getSubtotal();
    }
}

class Pedido {
    private List<ItemPedido> itens = new ArrayList<>();
    private Pagamento pagamento;

    public void adicionarItem(Produto p, int qtd) {
        itens.add(new ItemPedido(p, qtd));
    }

    public double getTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void imprimirResumo() {
        System.out.println("\nResumo do Pedido:");
        for (ItemPedido item : itens) {
            System.out.println(item);
        }
        System.out.println("Total: R$ " + getTotal());
        if (pagamento != null) {
            pagamento.realizarPagamento(getTotal());
        }
    }
}
abstract class Pagamento {
    public abstract void realizarPagamento(double valor);
}

class PagamentoDinheiro extends Pagamento {
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento em dinheiro realizado. Valor: R$ " + valor);
    }
}

class PagamentoCheque extends Pagamento {
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento em cheque realizado. Valor: R$ " + valor);
    }
}

class PagamentoCartao extends Pagamento {
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento em cartão realizado. Valor: R$ " + valor);
    }
}


public class Q1_mercado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = sc.nextLine();

        System.out.print("Digite a quantidade do produto em estoque: ");
        int quan = sc.nextInt();

        System.out.print("Digite a quantidade que deseja comprar: ");
        int qtd = sc.nextInt();

        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();
        sc.nextLine();

        System.out.print("Método de pagamento (dinheiro/cartao/cheque): ");
        String metodo = sc.nextLine().toLowerCase();

        Produto produto = new Produto(nomeProduto, preco, quan);
        Pedido pedido = new Pedido();
        pedido.adicionarItem(produto, qtd);

        switch (metodo) {
            case "dinheiro":
                pedido.setPagamento(new PagamentoDinheiro());
                break;
            case "cartao":
                pedido.setPagamento(new PagamentoCartao());
                break;
            case "cheque":
                pedido.setPagamento(new PagamentoCheque());
                break;
            default:
                System.out.println("Método de pagamento inválido. Será usado dinheiro por padrão.");
                pedido.setPagamento(new PagamentoDinheiro());
        }

        pedido.imprimirResumo();
        sc.close();
    }
}
