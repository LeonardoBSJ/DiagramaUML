package Diagrama;

import java.util.ArrayList;

public class DiagramaUML {

    public static void main(String[] args) {
        Futbolista futbolista1 = new Futbolista(" Chivas ") {};
        futbolista1.setCantidadIntegrantes(18);
        futbolista1.setNombre(" Juan ");
        futbolista1.setNumPlayera(17);
        futbolista1.setPosicion(" Delantero ");

        Futbolista futbolista2 = new Futbolista(" América ");
        futbolista2.setCantidadIntegrantes(19);
        futbolista2.setNombre(" max ");
        futbolista2.setNumPlayera(17);
        futbolista2.setPosicion(" Defenza ");
         
        Futbolista futbolista3 = new Futbolista(" pumas ");
        futbolista3.setCantidadIntegrantes(18);
        futbolista3.setNombre(" Hugo ");
        futbolista3.setNumPlayera(7);
        futbolista3.setPosicion(" medio ");
        
        SeleccionFutbolista seleccion1 = new SeleccionFutbolista(4," Mexico ",futbolista1);
        seleccion1.agregar(futbolista2);
        seleccion1.agregar(futbolista3);
        seleccion1.mostrar();
        
    }

}
