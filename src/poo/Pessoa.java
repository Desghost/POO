package poo;

public class Pessoa {
    String nome;
    double altura;
    String bioTipo;
    int idade;

    void imprimeDadosDaPessoa(){
        System.out.println("----------------PESSOA--------------");
        System.out.println("Nome: "+ nome);
        System.out.println("Altura: "+ altura);
        System.out.println("Biotipo: "+ bioTipo);
        System.out.println("Idade: "+ idade);
    }
    
    
    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public String getBioTipo() {
        return bioTipo;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBioTipo(String bioTipo) {
        this.bioTipo = bioTipo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    
}
