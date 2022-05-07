import java.util.Date;

public class Anuncio{
    
        private Pessoa locatorio;
        private imovel imovel;
        private Corretor corretor;
        private double valor;
        private Date data;

public Anuncio(Pessoa locatorio, imovel imovel,Corretor corretor, double valor, Date data){
        
        this.locatorio = locatorio;
        this.imovel = imovel;
        this.corretor = corretor;
        this.valor = valor;
        this.data = data;
}

    public Pessoa getLocatorio(){
        return locatorio;
    }
    
    public void setLocatorio(Pessoa locatorio){
        this.locatorio = locatorio;
    }

    public imovel getImovel(){
        return imovel;
    }
    
    public void setImovel(imovel imovel){
        this.imovel = imovel;
    }
    
    public Corretor getCorretor(){
        return corretor;
    }
    
    public void setCorretor(Corretor corretor){
        this.corretor = corretor;
    }

    public double getvalor(){
        return valor;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public Date getData(){
        return  data;
    }
    public void setData(Date data){
        this.data = data;
    }
    
    
}
