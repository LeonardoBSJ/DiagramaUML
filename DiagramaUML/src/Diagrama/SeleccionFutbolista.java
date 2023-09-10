package Diagrama;

import java.util.ArrayList;

public class SeleccionFutbolista {

    protected int id;
    protected String nomSeleccion;
    private ArrayList<Futbolista> listaFutbolista = new ArrayList();

    public SeleccionFutbolista(int id, String nomSeleccion, Futbolista futbolista) {
        this.id = id;
        this.nomSeleccion = nomSeleccion;
        listaFutbolista.add(futbolista);
    }

    public void agregar(Futbolista futbolista) {
        listaFutbolista.add(futbolista);
                
    }
    
     public void mostrar(){
         System.out.println("Los datos son: ");
        System.out.println("seleccion"+nomSeleccion+"(id. "+id+")"+listaFutbolista.toString());
    }

    @Override
    public String toString() {
        return "SeleccionFutbolista{" + "id=" + id + ", nomSeleccion=" + nomSeleccion + ", listaFutbolista=" + listaFutbolista + '}';
        
    }

}
