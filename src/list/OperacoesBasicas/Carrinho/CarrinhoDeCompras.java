package list.OperacoesBasicas.Carrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributo
    private List<Item> itemList;

    //construtor
    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        //Item item = new Item(nome,preco,quantidade); outra forma de fazer mas tem que por o
        //this.itemList.add(item) dessa forma fica com mais linhas de código.

        itemList.add(new Item(nome,preco,quantidade));//dessa forma fica em uma linha
    }


    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        for(Item item : itemList){
            if (item.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(item);
            }

        }
        itemList.removeAll(itemParaRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        if(!itemList.isEmpty()){
            for(Item item : itemList){
                double valorItem = item.getPreco()*item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        }else
            throw new RuntimeException("A lista está vazia");

    }

    public void exibirItens(){
        if(!itemList.isEmpty()){
            System.out.println(this.itemList);
        }else{
            System.out.println("A lista está vazia");
        }

    }

    public String toString(){
        return "CarrinhoDeCompras{" +
                "itemList=" + itemList +
                '}';
    }
    public static void main(String[] args) {
        //Criando uma instancia do carrinho de compras

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("PS5 30th anos",5900d,1);
        carrinhoDeCompras.adicionarItem("XBOX Galaxy Black",4700d,1);
        carrinhoDeCompras.adicionarItem("Caixa de som JBL Boombox 3",1700d,1);

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Caixa de som JBL Boombox 3");
        carrinhoDeCompras.exibirItens();

        System.out.println(" O valor total das compras é: R$ " + carrinhoDeCompras.calcularValorTotal());

    }


}
