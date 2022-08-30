package poo;


public class POO {
    
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        
        meuCarro.setCor("Preto");
        meuCarro.setNumPortas(2);
        meuCarro.setPlaca("AACD-2335");
        meuCarro.setTipo("Porshe");
        
        System.out.println("----------------CARRO--------------");
        System.out.println("Cor: "+ meuCarro.getCor());
        System.out.println("Número de portas: "+ meuCarro.getNumPortas());
        System.out.println("Placa: "+ meuCarro.getPlaca());
        System.out.println("Tipo: "+ meuCarro.getTipo());
        
        Pessoa voceMesmo = new Pessoa();
        
        voceMesmo.setNome("Você");
        voceMesmo.setAltura(2.04);
        voceMesmo.setBioTipo("Gordo");
        voceMesmo.setIdade(14);
        
        System.out.println("----------------CARRO--------------");
        System.out.println("Nome: "+ voceMesmo.getNome());
        System.out.println("Altura: "+ voceMesmo.getAltura());
        System.out.println("Biotipo: "+ voceMesmo.getBioTipo());
        System.out.println("Idade: "+ voceMesmo.getIdade());
        
    }
    
}
