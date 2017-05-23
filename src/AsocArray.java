
public class AsocArray {

	 private class Nodo {
		       String clave;
		       String valor;
		         Nodo siguiente;
		    }
		     
		    private Nodo primero;
		    private int tam;
		 
		public AsocArray() {
		    tam=0;
		    this.primero = null;
		     }
		    
		    
		    
		public int size() {
		// TODO Auto-generated method stub
		return tam;
	}



		public void put(String clave, String valor){
		    primero = new Nodo();
		    primero.clave = clave;
		    primero.valor = valor;
		    primero.siguiente = null;
		    tam ++;
		  }



		  public String get(String clave){
			    Nodo actual = primero;
			    String val = "";
			    if(actual!= null && actual.clave.equals(clave)){
			      val = actual.valor;
			    }
			    return val;
			  }

}
