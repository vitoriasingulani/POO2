package EXPLICAÇÃO;

class Pessoa {
    public String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
}
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João");
        System.out.println(pessoa.getNome());
    }
}
