
package Diagrama;

public abstract class Club implements Entrenamientos {

public String nombreClub;
public int cantidadIntegrantes;

    public Club(String nombreClub) {
        this.nombreClub = nombreClub;
    }

    public String getNombreClub() {
        return nombreClub;
    }

    public void setNombreClub(String nombreClub) {
        this.nombreClub = nombreClub;
    }

    public int getCantidadIntegrantes() {
        return cantidadIntegrantes;
    }

    public void setCantidadIntegrantes(int cantidadIntegrantes) {
        this.cantidadIntegrantes = cantidadIntegrantes;
    }

}
