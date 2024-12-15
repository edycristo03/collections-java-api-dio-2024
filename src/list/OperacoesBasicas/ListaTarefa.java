package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    //construtor
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    //metodo(função)
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    //metodo(função)
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }

        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    //metodo(função)
    public int oberNumeroTotalTarefas(){
        return tarefaList.size();
    }

    //metodo(função)
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de tarefas é: " + listaTarefa.oberNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("Estudar este video novamente");
        listaTarefa.adicionarTarefa("Revidsar o video");
        listaTarefa.obterDescricoesTarefas();
        listaTarefa.removerTarefa("Estudar este video novamente");
        listaTarefa.obterDescricoesTarefas();

        System.out.println("O número total de tarefas é: " + listaTarefa.oberNumeroTotalTarefas());
    }

}
