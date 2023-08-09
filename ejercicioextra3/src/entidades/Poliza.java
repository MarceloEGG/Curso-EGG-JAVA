/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;

/**
Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
muchos a uno o de muchos a muchos.
 */
public class Poliza {
    private Vehiculo Vehiculo;
    private Cliente Cliente;
    private Cuotas Cuotas;
    private int numeroPoliza;
    private Date fechaInicio;
    private Date fechaFin;
    private int cantidadCuotas;
    private String formaDePago;
    private int MontoTotalAsegurado;
    private boolean granizo;
    private String covertura;

    public Poliza() {
        Cuotas =new Cuotas();
    }

    public Vehiculo getVehiculo() {
        return Vehiculo;
    }

    public void setVehiculo(Vehiculo Vehiculo) {
        this.Vehiculo = Vehiculo;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public int getMontoTotalAsegurado() {
        return MontoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(int MontoTotalAsegurado) {
        this.MontoTotalAsegurado = MontoTotalAsegurado;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public String getCovertura() {
        return covertura;
    }

    public void setCovertura(String covertura) {
        this.covertura = covertura;
    }
      public Cuotas getCuotas() {
        return Cuotas;
    }

    public void setCuotas(Cuotas Cuotas) {
        this.Cuotas = Cuotas;
    }

    public Poliza(Cuotas Cuotas) {
        this.Cuotas = Cuotas;
    }

    @Override
    public String toString() {
        return "Poliza{" + "Vehiculo=" + Vehiculo + ", Cliente=" + Cliente + ", numeroPoliza=" + numeroPoliza + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", cantidadCuotas=" + cantidadCuotas + ", formaDePago=" + formaDePago + ", MontoTotalAsegurado=" + MontoTotalAsegurado + ", granizo=" + granizo + ", covertura=" + covertura + '}';
    }
    
}
