package exercicio;

public class MiniMercado {

    private Funcionario[] funcionarios; // criando um array de Funcionario
    private Produto[] produtos = new Produto[100];//
    private Cliente[] clientes = new Cliente[100];//

    //Construtor da classe
    public MiniMercado(){
        funcionarios = new Funcionario[5]; //inicializando quando for chamada a classe
    }

    public void contratarFuncionario(Funcionario novoFuncionario){
        //criando um loop pra cadastra contrataçoes
        for(int i=0; i<funcionarios.length;i++){
            if(funcionarios[i] != null){

            }

        }//fim do for
    }//fim do method contrata funcionarios

    //controlar a entrada de um produto já cadastrado

    //dar baixa em estoque

    //Diminuir o dinheiro do cliente apos a compra



    @Override
    public String toString() {
        //return super.toString();
        String s = "";
        for(Funcionario listarFuncionario : funcionarios){//for eatch
            s += listarFuncionario.toString() + "\n";
        }//fim do for
        s += "";
        return s;
    }
}//fim da classe minimercado
