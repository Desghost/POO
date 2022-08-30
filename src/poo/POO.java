package poo;


public class POO {
    
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        
        meuCarro.setCor("Preto");
        meuCarro.setNumPortas(2);
        meuCarro.setPlaca("AACD-2335");
        meuCarro.setTipo("Porshe");
        
        meuCarro.imprimeDadosDoCarro();
        
        Pessoa voceMesmo = new Pessoa();
        
        voceMesmo.setNome("Você");
        voceMesmo.setAltura(2.04);
        voceMesmo.setBioTipo("Gordo");
        voceMesmo.setIdade(14);
        
        voceMesmo.imprimeDadosDaPessoa();
        
    }
    
}
