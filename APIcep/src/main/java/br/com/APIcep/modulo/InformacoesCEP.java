package br.com.APIcep.modulo;

public record InformacoesCEP(String cep, String logradouro, String bairro, String localidade, String uf, String ddd) {

    @Override
    public String toString() {
        return "CEP: "+this.cep +
                " | Logradouro: "+this.logradouro +
                " | Bairro: " + this.bairro +
                " | Local: " + this.localidade +
                " | UF: " + this.uf +
                " | DDD: ("+this.ddd + ") ";
}

}
