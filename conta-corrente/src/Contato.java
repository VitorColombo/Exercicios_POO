public class Contato {
    private String descricao;
    private String telefone;
    private int tipo;

    public Contato(int tipo, String descricao, String telefone) {
        this.descricao = descricao;
        this.telefone = telefone;
        this.tipo = tipo;
    }

    public void imprimirContato() {
        if (tipo == 1){
            System.out.println("Contato Residencial- " + "descricao: " + descricao + ", telefone: " + telefone);
        }
        else if (tipo == 2){
            System.out.println("Contato Comercial- " + "descricao: " + descricao + ", telefone: " + telefone);
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
