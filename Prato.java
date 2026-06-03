
/**
 * Escreva uma descrição da classe Prato aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Prato
{
    private String nome;
    private double valor;
    private Ingrediente [] vetIngredientes;
    private int index;
    
    public Prato(String nome, double valor, int quantidade){
        this.nome = nome;
        this.valor = valor;
        this.vetIngredientes = new Ingrediente[quantidade];
        this.index = 0;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    // A partir daqui métodos a serem adicionados
}