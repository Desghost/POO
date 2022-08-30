package poo;

public class Carro {
    String tipo;
    String cor;
    String placa;
    int numPortas;
    
    void imprimeDadosDoCarro(){
        System.out.println("----------------CARRO--------------");
        System.out.println("Cor: "+ cor);
        System.out.println("Número de portas: "+ numPortas);
        System.out.println("Placa: "+ placa);
        System.out.println("Tipo: "+ tipo);
    }
    
    
    
    public String getTipo() {
        return tipo;
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
}
