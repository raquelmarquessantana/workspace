public class Main {
    public static void main(String[] args) {
        // Aula introdutória de Orientação à Objetos
        // Criar objetos
        Pessoa adao = new Pessoa();
        // Declaração de objeto
        Pessoa qualquer;
        // Instanciação do objeto
        qualquer = new Pessoa();
        Pessoa adulta = new Pessoa();
        // Definir forma do objeto
        qualquer.nome = "Rita";
        qualquer.sobrenome = "Lee";
        // Definir comportamento do objeto
        qualquer.falar();
        adao.falar("baixo");
        // Criar mais objetos
        // Declarar objeto
        Pessoa rainha;
        // Instanciar objeto
        rainha = new Pessoa();
        // Definir formato do objeto
        rainha.nome = "Tina";
        rainha.sobrenome = " Tunner";
        // Definir comportamento
        rainha.falar();
        rainha.falar("auto");
        System.out.println(rainha.falar ("auto", "grave"));

        Animal cao = new Animal();
        cao.nome = "pluto";
        cao.comer();

        rainha.comer();

        // gerador de numero
        int numero = (int) Math.ceil(Math.random() * 60);
        System.out.println(numero);

        Produto pestisco = new Produto();
        Produto racao = new Produto(1);
        Produto remedio = new Produto(2, "vermifugo");
        Produto brinquedo = new Produto ("Bolinha");





    }
}