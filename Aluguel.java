import java.util.Date;

public class Aluguel{
    private double valorAcertado;
    private int vencimento;
    private Date validadeContrato;
    private int numeroContrato;
    private double pagamentoMensais;

public Aluguel(double valorAcertado, int vencimento, Date validadeContrato, int numeroContrato, double pagamentoMensais){
    
    this.valorAcertado = valorAcertado;
    this.vencimento  = vencimento;
    this.validadeContrato = validadeContrato;
    this.numeroContrato = numeroContrato;
    this.pagamentoMensais = pagamentoMensais;
}

public double getValorAcertado(){
    return valorAcertado;
}

public void  setValorAcertado(double valorAcertado){
    this.valorAcertado = valorAcertado;
}

public int getVencimento(){
    return vencimento;
}

public void setVencimento( int vencimento){
    this.vencimento = vencimento;
}

public Date getValidadeContrato(){
    return validadeContrato;    
}

public void setValidadeContrato( Date validadeContrato){
    this.validadeContrato = validadeContrato;
}

public int getNumeroContrato(){
    return numeroContrato;
}

public void setNumeroContrato( int numeroContrato){
    this.numeroContrato = numeroContrato;
}

public double getPagamentoMensais(){
    return pagamentoMensais;
}

public void setPagamentoMensais( double pagamentoMensais){
    this.pagamentoMensais = pagamentoMensais;
}


}
