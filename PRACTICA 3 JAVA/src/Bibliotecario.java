import java.util.Scanner;

public class Bibliotecario extends Persona{
    private String puestoTrabajo;
    private String nif;
    private String contrasenya;

    public Bibliotecario() {
    }

    public Bibliotecario(String nombre, String apellido1, String apellido2, byte edad, String puestoTrabajo, String nif, String contrasenya) {
        super(nombre, apellido1, apellido2, edad);
        this.puestoTrabajo = puestoTrabajo;
        this.nif = nif;
        this.contrasenya = contrasenya;
    }

    public Bibliotecario(Bibliotecario copiaBibliotecario) {
        super(copiaBibliotecario); //Hay que hacer casting, no se si esta correcto asi
        this.puestoTrabajo = copiaBibliotecario.puestoTrabajo;
        this.nif = copiaBibliotecario.nif;
        this.contrasenya = copiaBibliotecario.contrasenya;
    }

    public String getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public void setPuestoTrabajo(String puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    @Override
    public String toString() {
        return "Bibliotecario{" +
                "puestoTrabajo='" + puestoTrabajo + '\'' +
                ", nif='" + nif + '\'' +
                ", contrasenya='" + contrasenya + '\'' +
                '}';
    }

    @Override
    public void solicitarDatosPersona() {
        super.solicitarDatosPersona();
        Scanner lector = new Scanner(System.in);
        System.out.println("Puesto de Trabajo : ");
        this.setPuestoTrabajo(lector.nextLine());
        System.out.println("NIF : ");
        this.setNif(lector.nextLine());
        System.out.println("Contraseña : ");
        this.setContrasenya(lector.nextLine());
    }
}

