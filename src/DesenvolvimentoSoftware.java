public class DesenvolvimentoSoftware implements ServicoTI{
    private String complexidade;
    private final double PRECO_SIMPLES = 5000.0;
    private final double PRECO_MEDIO = 10000.0;
    private final double PRECO_COMPLEXO = 20000.0;
    private final int DURACAO_SIMPLES = 7;
    private final int DURACAO_MEDIO = 14;
    private final int DURACAO_COMPLEXO = 30;

    public DesenvolvimentoSoftware(String complexidade) throws Exception {
        verificaNull(complexidade);
        this.complexidade = complexidade;
    }

    private void verificaNull(String complexidade) throws Exception {
        if (complexidade == null){
            throw new Exception("O nível de complexidade não pode ser vazio1");
        }
    }

    @Override
    public double calcularPreco() {
        double valor = 0;
        switch (complexidade){
            case "Simples":
                valor = PRECO_SIMPLES;
                break;
            case "Médio":
                valor = PRECO_MEDIO;
                break;
            case "Complexo":
                valor = PRECO_COMPLEXO;
                break;
        }
        return valor;
    }

    @Override
    public String getDescricao() {
        return "Desenvolvimento de Software: " + complexidade + ", Duração: " + getDuracao() + ", R$: " + calcularPreco();
    }

    @Override
    public int getDuracao() {
        int tempo = 0;
        switch (complexidade){
            case "Simples":
                tempo = DURACAO_SIMPLES;
                break;
            case "Médio":
                tempo = DURACAO_MEDIO;
                break;
            case "Complexo":
                tempo = DURACAO_COMPLEXO;
                break;
        }
        return tempo;
    }

    @Override
    public int compareTo(ServicoTI outroServico)throws NullPointerException {
        if(outroServico == null){
            throw new NullPointerException("Deve existir mais de um serviço cadastrado");
        }
        return Double.compare(this.calcularPreco(), outroServico.calcularPreco());
    }
}
