public class Produto {
    // Atributo
    int codigo;
    String nome;
    double valor;

    //construtor padrão
    Produto(){}
    // Sobrecarga do método construtor
    Produto(int _codigo){
        this.codigo = _codigo;
    }
    //mais uma sobrecarga
    Produto(int _codigo, String _nome){
        this.codigo = _codigo;
        this.nome = _nome;
    }
    public Produto(String nomeProduto) {
        this.nome = nomeProduto;
    }
}
