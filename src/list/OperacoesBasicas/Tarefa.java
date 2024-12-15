package list.OperacoesBasicas;

public class Tarefa {
    //atributo
    private String descricao;

    //construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    //getrs
    public String getDescricao() {
        return descricao;
    }

    //toString para aparecer a descrição correta das tarefas adicionadas
    @Override
    public String toString() {
        return descricao;
    }
}
