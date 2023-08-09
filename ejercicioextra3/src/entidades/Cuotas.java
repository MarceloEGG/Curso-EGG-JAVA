/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;

/**
Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.).
 */
public class Cuotas {
    private int numCuota;
    private int montoTotal;
    private boolean pagada;
    private Date vencimiento;
    private String formaPago;

    public Cuotas() {
    }

    public Cuotas(int numCuota, int montoTotal, boolean pagada, Date vencimiento, String formaPago) {
        this.numCuota = numCuota;
        this.montoTotal = montoTotal;
        this.pagada = pagada;
        this.vencimiento = vencimiento;
        this.formaPago = formaPago;
    }

    public int getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Cuotas{" + "numCuota=" + numCuota + ", montoTotal=" + montoTotal + ", pagada=" + pagada + ", vencimiento=" + vencimiento + ", formaPago=" + formaPago + '}';
    }
}
