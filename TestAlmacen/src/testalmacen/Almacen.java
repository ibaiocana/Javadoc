package testalmacen;

import java.util.Arrays;

/**
 *
 * @author Ibai Ocaña
 * @version 1.0
 * @since 03-03-2022
 */
public class Almacen {
    
    private int nMax;
    private int nProductos;
    private Producto[] lista;
     
    
    
    public Almacen(int nMax){
        this.nMax = nMax;
        nProductos = 0;
        lista = new Producto[nMax];
        
    }

    public int getnMax() {
        return nMax;
    }

    public int getnProductos() {
        return nProductos;
    }
    
    public boolean insertaProducto(Producto p){
        if (nProductos < nMax) {
            lista[nProductos] = p;
            nProductos++;
            return true;

        } else {
            return false;
        }
      
    }
    
    public boolean insertaProductoOrdenado(Producto p){
        if (nProductos < nMax && !contieneProducto(p)) {
            lista[nProductos] = p;
            nProductos++;
            return true;

        } else {
            return false;
        }
      
    }
    
    public void ordena(){
        Producto aux;
        
        for(int j = 0; j < nProductos; j++){
            for (int i = 1; i < j; i++) {
                 if(lista[j].getNombre().compareToIgnoreCase(lista[i].getNombre()) < 0){
                     aux = lista[j];
                     lista[j] = lista[i];
                     lista[i] = aux;
                    }
                }
            }
        System.out.println(Arrays.toString(lista));
}
    
    public boolean contieneProducto(Producto p){
//        for (int i = 0; i < nProductos; i++) {
//            if(p.getNombre().equalsIgnoreCase(lista[i].getNombre())){
//                return true;
//            }
//            
//        }
        for (int i = 0; i < nProductos; i++) {
            if(p.equals(lista[i])){
                return true;
            }
            
        }
        return false;
    }
    
    //devuelve la suma de todos los precios base
    public double sumaBases() {
        double suma = 0;
        for (int i = 0; i < nProductos; i++) {
            suma += lista[i].getPrecioBase();
        }
        return suma;
    }
    
    
    //devuelve una cadena con los productos que están en la lista (cada uno en una linea), sin nulos 
    public String dameElementos(){
    String salida = "";
        for (int i = 0; i < nProductos; i++) {
            salida+= lista[i]+"\n";
        }
        return salida;
    }
    
    //devuelve la suma de todos lod pvp        
//    public double sumaPVP() {
//        
//    }
            
            
    

    @Override
    public String toString() {
        return  Arrays.toString(lista);
    }
    
    
    
    
}
