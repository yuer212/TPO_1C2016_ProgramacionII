package implementacion;

import tda.TDACola;

public class ColaEstaticaString implements TDACola{
	
	String [] a ;
	int indice;
	
	public void inicializar(){
		a = new String [100];
		indice = 0;
	}
	public void acolar(String valor){
		a[indice] = valor;
		indice++;
	}
	public void desacolar(){
	for ( int i = 0; i < indice -1; i ++)
		a[i] = a[i +1];
		indice --;
	}
	public boolean colaVacia(){
	return (indice == 0) ;
	}
	public String primero(){
	return a[0];
	}

}
