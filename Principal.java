import java.util.Date;

public class Principal{
    
    public static void main(String[] args){
        Endereco endereco1 = new Endereco("R Dr Otavio Santos", 900, "Jacarandas,330,Ap1005", "itu coinma", "Porto Alegre", "91210000");
        
        Endereco endereco2 = new Endereco( "R Dr otavio santos", 1200, "Jardim das palmeiras III,571,Ap901", "itu coinma", "Porto Alegre", "9121001");
    
        Corretor corretor1 = new Corretor("João" ,"1", "994758295", endereco1, "não encontrado", 0.10);
        System.out.println(corretor1.getNome());
        
        Cliente pessoa1 = new Cliente("Pedro", "2", "993390019", endereco2 ,1200);
        System.out.println(pessoa1.getNome());
        
        Date data = new Date();
        
        imovel imovel1= new imovel( true, 900,  "1501", endereco1);
        
        System.out.println(imovel1.getEndereco().getLogradouro());
        
        Anuncio anuncio1 = new  Anuncio(pessoa1, imovel1, corretor1, 600, data);
        
        System.out.println(anuncio1.getData());
        
        Aluguel aluguel1 = new Aluguel(1200,3025,data,404,600);
        
        System.out.println(aluguel1.getValidadeContrato());
    }
    
    
}