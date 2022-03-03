package testalmacen;

import java.util.Objects;

/**
 *
 * @author Ibai Ocaña
 * @version 1.0
 * @since 03-03-2022
 */
public class Producto {
     private static double precioMinimo = 5; //especifico de la clase
     
     private String nombre;  // especifico pra cada objeto
     private double precioBase;// valen cero por defecto
     private double tipoIva;//valen cero por defecto
    
     public Producto(){//constructor por defecto
         
     }
     
     /**
      * Constuctor principal del objeto producto.
      * @param nombre El nombre del producto.
      * @param precioBase El precio del producto.
      * @param tipoIva El tipo de iva del producto.
      */
     
    public Producto(String nombre, double precioBase, double tipoIva){ // no devuelve nada y no es void
        this.nombre = nombre;
       // this.precioBase = precioBase;
       this.setPrecioBase(precioBase);
       this.setTipoIva(tipoIva);
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        
//        if (!Objects.equals(this.nombre, other.nombre)) {
//            return false;
//        }

        if(!this.nombre.equalsIgnoreCase(other.getNombre())){
            return false;
        }
        return true;
    }
     
    public double precioVentaPublico(){
        return precioBase + precioBase*tipoIva/100;
        
    }
    
    public void setPrecioBase(double precio){//parámetro del mismo tipo que el atributo
        if (precio < precioMinimo){
            precio = precioMinimo;
        }
        this.precioBase = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoIva(double tipoIva) {
        if(tipoIva < 3.3 ){
            tipoIva = 3.3;
        }
        this.tipoIva = tipoIva;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getTipoIva() {
        return tipoIva;
    }

    public static void setPrecioMinimo(double precioMinimo) {
        Producto.precioMinimo = precioMinimo;
    }

    public static double getPrecioMinimo() {
        return precioMinimo;
    }

    @Override
    public String toString() {
        return  nombre +" , "+ precioBase +" , "+ tipoIva;
    }
    
    
    
}
