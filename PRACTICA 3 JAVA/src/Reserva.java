import java.sql.Time;
import java.util.Date;

public class Reserva {
    private String libro;
    private Date fechaReserva; //ALOMEJOR PUEDO JUNTAR FECHA CON HORA
    private Time horaReserva;   //NO SE SI ES CORRECTO UTILIZAR DATE Y TIME

    public Reserva() {
    }

    public Reserva(String libro, Date fechaReserva, Time horaReserva) {
        this.libro = libro;
        this.fechaReserva = fechaReserva;
        this.horaReserva = horaReserva;
    }

    public Reserva(Reserva copiaReserva){
        this.libro = copiaReserva.libro;
        this.fechaReserva = copiaReserva.fechaReserva;
        this.horaReserva = copiaReserva.horaReserva;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Time getHoraReserva() {
        return horaReserva;
    }

    public void setHoraReserva(Time horaReserva) {
        this.horaReserva = horaReserva;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "libro='" + libro + '\'' +
                ", fechaReserva=" + fechaReserva +
                ", horaReserva=" + horaReserva +
                '}';
    }
}
