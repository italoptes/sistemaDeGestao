import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestorDeServicosTI {
    List<ServicoTI> servicos = new ArrayList<>();

    public GestorDeServicosTI(List<ServicoTI> servicos) {
        this.servicos = servicos;
    }

    public void adicionaServico(ServicoTI servico){
        servicos.add(servico);
    }

    public double calculaCustoTotal(){
        double total = 0;
        for (ServicoTI s : servicos){
            total += s.calcularPreco();
        }
        return total;
    }

    public String listarServicos(){
        String servicosListados = "";
        for (ServicoTI s : servicos){
            servicosListados += s.getDescricao() + "\n";
        }
        return servicosListados;
    }

    public ServicoTI buscarServicoMaisCaro(){
        Collections.sort(servicos);
        return servicos.getLast();
    }
}
