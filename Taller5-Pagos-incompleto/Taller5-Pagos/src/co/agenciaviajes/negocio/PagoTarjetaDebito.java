package co.agenciaviajes.negocio;

/**
 * Pago con tarjeta débito
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio A. Hurtado
 */
public class PagoTarjetaDebito extends Pago {
    private String codigo,banco, numeroCuenta;

    public PagoTarjetaDebito() {
    }

    public PagoTarjetaDebito(String codigo, String banco, String numeroCuenta) {
        this.codigo = codigo;
        this.banco = banco;
        this.numeroCuenta = numeroCuenta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public void registrarPago() {
        System.out.println("------------------------------------------------------");
        Cliente cliente = new Cliente("125478546", "Fernanda Maria", "Benavides", "F", "fer@gmail.com");
        this.setCliente(cliente);
        this.setBanco("Bancolombia");
        this.setCodigo("1254578");
        this.setNumeroCuenta("3154-123485-12547");
        this.setValor(45600122); 
        System.out.println("Pago con tarjeta débito registrado en el sistema con éxito.");
        System.out.println("Cliente: " + this.getCliente().toString());
        System.out.println("Código del cliente: "+this.getCodigo());
        System.out.println("Banco: "+this.getBanco());
        System.out.println("Numero de Cuenta:"+this.getNumeroCuenta());
        System.out.println("Valor: "+this.getValor());
    }
    
    

}
