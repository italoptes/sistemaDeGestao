public class ConsultoriaTI implements ServicoTI{
    private int qtdReunioes;
    private final double PRECO_BASE = 3000.0;
    private final double PRECO_POR_REUNIAO = 500.00;
    private final int DURACAO_BASE = 5;

    public ConsultoriaTI(int qtdReunioes) throws Exception {
        verificaReunioes(qtdReunioes);
        this.qtdReunioes = qtdReunioes;
    }
    private void verificaReunioes(int qtdReunioes) throws Exception {
        if (qtdReunioes < 1){
            throw new Exception("A quantidade de reuniões deve ser maior que 1!");
        }
    }

    @Override
    public double calcularPreco() {
        if (qtdReunioes > 5){
            int reunioesExtra = qtdReunioes - 5;
            return PRECO_BASE + (PRECO_POR_REUNIAO * reunioesExtra);
        }
        return PRECO_BASE ;
    }

    @Override
    public String getDescricao() {
        int reunioesExtra = 0;
        if (reunioesExtra > 5){
            reunioesExtra = qtdReunioes - 5;
        }
        return "Consultoria TI: " + "Duração: " + getDuracao() + " R$: " + calcularPreco() + ", Reuniões Extras: " + reunioesExtra;
    }

    @Override
    public int getDuracao() {
        if (qtdReunioes > 5){
            return qtdReunioes;
        }
        return 5;
    }

    @Override
    public int compareTo(ServicoTI outroServico)throws NullPointerException {
        if(outroServico == null){
            throw new NullPointerException("Deve exixtir mais de um serviço cadastrado");
        }
        return Double.compare(this.calcularPreco(), outroServico.calcularPreco());
    }
}
