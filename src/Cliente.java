public class Cliente {
    // Atributos
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private final String rg;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;

    public Cliente(String nome, String email, String telefone, String cpf, String rg, String logradouro, String bairro, String cidade, String uf, String cep) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rg = rg;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    }

    public Cliente() {
        this.nome = "";
        this.email = "";
        this.telefone = "";
        this.cpf = "";
        this.rg = "";
        this.logradouro = "";
        this.bairro = "";
        this.cidade = "";
        this.uf = "";
        this.cep = "";
    }

    // Método de acesso
    // Leitura
    public String getNome() {
        return nome;
    }

    //Alteração
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getBairro() {
       return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }


    // Método
    public String obterContatos() {
        return String.format("Nome: %s \nE-mail: %s \nTelefone: %s", this.getNome(), this.getEmail(), this.getTelefone());
    }

    public String obterEndereco() {
        return String.format("Nome: %s\nLogradouro: %s\nBairro: %s\nCidade: %s \nUF: %s\nCEP: %s", this.getNome(), this.getLogradouro(), this.getBairro(), this.getCidade(), this.getUf(), this.getCep());
    }

}
