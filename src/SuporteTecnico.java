public class SuporteTecnico implements ServicoTI, Comparable<ServicoTI>{
    private int duracao;
    private final double PRECO_POR_HORA = 100.00;

    public SuporteTecnico(int duracao) throws Exception{
        verificaDuracao(duracao);
        this.duracao = duracao;
    }

    private void verificaDuracao(int duracao) throws Exception {
        if (duracao < 1 || duracao > 8){
            throw new Exception("A duração deve ser maior que 1 e menor que 8!");
        }
    }

    @Override
    public double calcularPreco() {
        return duracao * PRECO_POR_HORA;
    }

    @Override
    public String getDescricao() {
        return "Suporte Técnico: " + duracao + " Horas," + " R$: " + calcularPreco();
    }

    @Override
    public int getDuracao() {
        return duracao;
    }

    @Override
    public int compareTo(ServicoTI outroServico)throws NullPointerException {
        if(outroServico == null){
            throw new NullPointerException("Deve exixtir mais de um serviço cadastrado");
        }
        return Double.compare(this.calcularPreco(), outroServico.calcularPreco());
    }
}
