
/**
 * Escreva uma descrição da classe Ingrediente aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Ingrediente
{
    private String nome;
    private String medida;
    private double quantidade;
    
    public Ingrediente(String nome, String medida, double quantidade){
        this.nome = nome;
        this.medida = medida;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getMedida(){
        return this.medida;
    }
    
    public double getQuantidade(){
        return this.quantidade;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setMedida(String medida){
        this.medida = medida;
    }
    
    public void setQuantidade(double quantidade){
        this.quantidade =  quantidade;
    }
    
    public String toString() {
        return "Nome: " + this.nome + 
        "\nQuantidade: " + this.quantidade + 
        "\nMedida: " + this.medida;
    }
}