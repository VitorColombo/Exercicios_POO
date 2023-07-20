public class Pessoa {
    private String nome;
    private int idade;
    private  String sobrenome;
    private String zap;


    public Pessoa(){

    }
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sobrenome='" + sobrenome + '\'' +
                ", zap='" + zap + '\'' +
                '}';
    }
}
