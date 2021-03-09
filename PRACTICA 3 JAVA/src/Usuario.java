import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Usuario extends Persona {
    private int telefono;
    private String direccion;
    private int codigoPostal;
    private String correoElectronico;
    private ArrayList<Reserva> listaReservas;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido1, String apellido2, int edad, int telefono, String direccion, int codigoPostal, String correoElectronico, ArrayList<Reserva> listaReservas) {
        super(nombre, apellido1, apellido2, edad);
        this.telefono = telefono;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.correoElectronico = correoElectronico;
        this.listaReservas = listaReservas;
    }

    public Usuario(Usuario copiaUsuario) {
        super(copiaUsuario); //Hay que hacer casting, no se si esta correcto asi
        this.setTelefono(copiaUsuario.getTelefono()); //SE HACE ASI
        this.direccion = copiaUsuario.direccion;
        this.codigoPostal = copiaUsuario.codigoPostal;
        this.correoElectronico = copiaUsuario.correoElectronico;
        this.listaReservas = copiaUsuario.listaReservas;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(ArrayList<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    @Override
    public String toString() { //cogemos el ToString del Padre return super.toString() +
            return super.toString() + "Usuario{" +  //puedo utilizar el toString a gusto del consumidor, puedo hacer que
                    "telefono=" + telefono +        //solo quiera imprimir (mediante un metodo) todos los atributos menos 1 por ejemplo
                    ", direccion='" + direccion + '\'' + //o que quiera imprimir solo 1 en concreto, esto utilizando el toString
                    ", codigoPostal=" + codigoPostal +
                    ", correoElectronico=" + correoElectronico +
                    ", listaReservas=" + listaReservas +
                    '}';
    }
    /*public String toString(int i){ //imprimir por cada numero un atributo diferente aprovechando el toString()
        String variableTemporal ="";
        if (i == 1){
            variableTemporal += telefono;

        }
        else if (i == 2){
            variableTemporal += direccion;
        }
        return variableTemporal;
    }*/

    @Override
    public void solicitarDatosPersona() {
        super.solicitarDatosPersona();
        Scanner lector = new Scanner(System.in);
        System.out.println("Telefono : ");
        this.setTelefono(lector.nextInt());
        System.out.println("Direccion : ");
        this.setDireccion(lector.nextLine());
        System.out.println("Codigo Postal : ");
        this.setCodigoPostal(lector.nextInt());
        System.out.println("Correo Electronico : ");
        this.setCorreoElectronico(lector.nextLine());
    }
}
