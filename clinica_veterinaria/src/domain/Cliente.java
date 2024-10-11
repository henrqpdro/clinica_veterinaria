package domain;

import java.util.List;

public class Cliente extends Pessoa {

    private String endereco;
    private Atendente cadastradoPor;
    private List<Pet> pets;
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Atendente getCadastradoPor() {
        return cadastradoPor;
    }
    public void setCadastradoPor(Atendente cadastradoPor) {
        this.cadastradoPor = cadastradoPor;
    }
    public List<Pet> getPets() {
        return pets;
    }
    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
    @Override
    public String toString() {
        return "Cliente [endereco=" + endereco + ", cadastradoPor=" + cadastradoPor + "]";
    }
    public Cliente(String nome, String telefone, String endereco, Atendente cadastradoPor) {
        super(nome, telefone);
        this.endereco = endereco;
        this.cadastradoPor = cadastradoPor;
    }

    
}
