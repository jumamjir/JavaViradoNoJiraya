package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private final int VALOR;
    private String nomerelatiorio;

    TipoCliente(int valor, String nomerelatiorio) {
        this.VALOR = valor;
        this.nomerelatiorio = nomerelatiorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomerelatiorio) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomerelatiorio().equals(nomerelatiorio)) {
                return tipoCliente;
            }
        }
        return null;
    }

    public int getVALOR() {
        return VALOR;
    }

    public String getNomerelatiorio() {
        return nomerelatiorio;
    }
}
