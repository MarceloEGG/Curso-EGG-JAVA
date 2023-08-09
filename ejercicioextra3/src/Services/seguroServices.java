/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import entidades.Cliente;
import entidades.Poliza;
import entidades.Vehiculo;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import utilidades.Marcas;

/**
     private String nombre;
    private String apellido;
    private long dni;
    private String mail;
    private String domicilio;
    private int telefono;
 */
public class seguroServices {
    Scanner leer = new Scanner(System.in).useDelimiter("/n");
    //
    public Cliente crearListaCliente(ArrayList<Cliente> clientes){
        Cliente c1=new Cliente();
        System.out.println("Ingrese Nombre del cliente");
        c1.setNombre(leer.next());
        System.out.println("Ingrese Apellido del cliente");
        c1.setApellido(leer.next());
        System.out.println("Ingrese DNI");
        c1.setDni(leer.nextLong());
        System.out.println("Ingrese domicilio");
        c1.setDomicilio(leer.next());
        System.out.println("Ingrese numero de telefono sin guiones");
        c1.setTelefono(leer.nextInt());
        
        clientes.add(c1);
        return c1;
        
    }
    public Vehiculo CrearVehiculo (ArrayList<Vehiculo> Vehiculos){
 
    Vehiculo v1= new Vehiculo();
        System.out.println("ingrese marca");
       
        System.out.println(Marcas.values());
        
         String mar=leer.next();
        for (Marcas aux: Marcas.values()) {
            if (aux.toString().equalsIgnoreCase(mar)){
                v1.setMarca(mar);
            }
        }
        System.out.println("Ingrese modelo");
        v1.setModelo(leer.next());
        System.out.println("Ingrese año");
        v1.setAnio(leer.nextInt());
        System.out.println("Ingrese numero de motor");
        v1.setNumeroMotor(leer.nextInt());
        System.out.println("Ingrese numero de chasis");
        v1.setChasis(leer.nextInt());
        System.out.println("Ingrese color");
        v1.setColor(leer.next());
        System.out.println("Ingrese tipo");
        v1.setTipo(leer.next());
        
        Vehiculos.add(v1);
        return v1;
    }
    public void crearPoliza(Cliente Cliente, Vehiculo Vehiculo,ArrayList<Cliente> Clientes,ArrayList<Vehiculo> Vehiculos){
//    private Vehiculo Vehiculo;
//    private Cliente Cliente;
//    private int numeroPoliza;
//    private Date fechaInicio;
//    private Date fechaFin;
//    private int cantidadCuotas;
//    private String formaDePago;
//    private int MontoTotalAsegurado;
//    private boolean granizo;
//    private String covertura;
Poliza polizax = new Poliza();
polizax.setCliente(crearListaCliente(Clientes));
polizax.setVehiculo(CrearVehiculo (Vehiculos));
        System.out.println("Ingrese numero de poliza");
        polizax.setNumeroPoliza(leer.nextInt());
        System.out.println("Ingrese fecha de inicio");
        polizax.setFechaInicio(new Date());
        polizax.setFechaFin(new Date(leer.nextInt(),leer.nextInt(),leer.nextInt()));
        System.out.println("Ingrese cantidad de cuotas");
        polizax.setCantidadCuotas(leer.nextInt());
        System.out.println("Ingrese forma de pago");
        polizax.setFormaDePago(leer.next());
        System.out.println("Ingrese monto toal asegurado");
        polizax.setMontoTotalAsegurado(leer.nextInt());
        System.out.println("Asegurado contra granizo S/N");
        polizax.setGranizo(leer.next().equalsIgnoreCase("s"));
        System.out.println("Ingrese tipo de covertura");
        polizax.setCovertura(leer.next());
    }
}
