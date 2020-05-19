package bebidas;

import java.util.ArrayList;

public class Almacen{


	Estanterias almacen[];
	
	public Almacen() {
		
	}
	public double calcularPrecioTotal() {
		int i, j;
		double resultado = 0;
		for (i = 0; i < almacen.length; i++) {
			for (j = 0; j < almacen.length; j++) {
				resultado += almacen.length;
			}
		}
		return resultado;
		
	}
	

	public void agregarProducto(Productos producto) {
		int i, j;
		for(i = 0; i < almacen.length; i++) {
			for(j = 0; j < almacen.length; j++) {
				if(producto.id != almacen.length) {
					almacen.length;
				}
			}
		}
	}

}
