package exercicio;

public class Produto {

    private int codigo = 0;
    private String nome = " ";
    private double valorDeCompra = 0;
    private double valorDeVenda = 0;
    private int qtdEmEstoque = 0;
    private int estoqueMinimo = 0;

    // CRIANDO O CONSTRUTOR DA CLASSE
    public Produto(int codigo,String nome,double valorDeCompra, double valorDeVenda,int qtdEmEstoque, int estoqueMinimo){
        this.codigo = codigo;
        this.nome = nome;
        this.valorDeCompra = valorDeCompra;
        this.valorDeVenda = valorDeVenda;
        this.qtdEmEstoque = qtdEmEstoque;
        this.estoqueMinimo = estoqueMinimo;
    }

    //METODOS ACESSORES GET E SET
    public int getCodigo(){ return this.codigo;}
    public void setCodigo(int codigo) {this.codigo = codigo;}
    public String getNome() { return this.nome;}
    public void setNome(String nome){this.nome = nome;}
    public double getvalorDeCompra(){return this.valorDeCompra;}
    public void setValorDeCompra(double valorDeCompra ){ this.valorDeCompra = valorDeCompra; }
    public double getvalorDeVenda(){return this.valorDeVenda;}
    public void setValorDeVenda(double valorDeVenda ){ this.valorDeVenda = valorDeVenda; }
    public int getQtdEmEstoque() { return this.qtdEmEstoque; }
    public void setQtdEmEstoque(int qtdEmEstoque){ this.qtdEmEstoque = qtdEmEstoque;}
    public int getEstoqueMinimo() { return this.estoqueMinimo; }
    public void setEstoqueMinimo(int estoqueMinimo) { this.estoqueMinimo = estoqueMinimo; }

    @Override
    public String toString() {
        String s = " ";
        s += "----------------------------------------------\n";
        s += "- Codigo : " + getCodigo() + "\n";
        s += "- Nome : " + getNome() + "\n";
        s += "- Valor de compra : " + getvalorDeCompra() + "\n";
        s += "- Valor de venda : " + getvalorDeVenda() + "\n";
        s += "- Quantidade em estoque : " + getQtdEmEstoque() + "\n";
        s += "- Estoque minimo : " + getEstoqueMinimo() + "\n";
        s += "- --------------------------------------------------\n";
        return s;
    }
}//fim da class produto
