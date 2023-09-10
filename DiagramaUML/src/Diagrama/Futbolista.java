package Diagrama;

public class Futbolista extends Club  {
    public String nombre;
    public int numPlayera;
    private String posicion;

    public Futbolista(String nombreClub){
        super(nombreClub);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPlayera() {
        return numPlayera;
    }

    public void setNumPlayera(int numPlayera) {
        this.numPlayera = numPlayera;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String getNombreClub() {
        return nombreClub;
    }

    @Override
    public void setNombreClub(String nombreClub) {
        this.nombreClub = nombreClub;
    }

    @Override
    public int getCantidadIntegrantes() {
        return cantidadIntegrantes;
    }

    @Override
    public void setCantidadIntegrantes(int cantidadIntegrantes) {
        this.cantidadIntegrantes = cantidadIntegrantes;
    }

    @Override
    public String toString() {
        return "Futbolista{" + "nombre=" + nombre + ", numPlayera=" + numPlayera + ", posicion=" + posicion + ", NombreClub=" +nombreClub+'}';
    }

   

    @Override
    public void entrenar(String velocidad) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void entrenar(String velocidad, String Fuerza) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

   

}
