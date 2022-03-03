/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testalmacen;

/**
 *
 * @author Juan Carlos
 */
public class TestAlmacen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Almacen almacen;
        
        almacen = new Almacen(10);
        System.out.println("nmax:"+almacen.getnMax());
        System.out.println("nmax:"+almacen.getnProductos());
        
        Producto pro, p;
        
        pro = new Producto("Alcachofas", 3.5, 8.5);
        p = new Producto("Alcaparras", 9, 1.21);
        
        almacen.insertaProducto(pro);
        almacen.insertaProducto(p);
        p = new Producto("Pan", 5, 8);
        almacen.insertaProducto(p);
        p = new Producto("Batido", 5, 8);
        almacen.insertaProducto(p);
        p = new Producto("Cepillo", 5, 8);
        almacen.insertaProducto(p);
        System.out.println("productos : "+almacen.toString());
        
        
//        p.setNombre("Leche");
        
        almacen.insertaProductoOrdenado(p);
        almacen.insertaProductoOrdenado(p);
        
        System.out.println("productos : "+almacen.toString());
        System.out.println(almacen.dameElementos());
        
        almacen.ordena();

    }
    
}
