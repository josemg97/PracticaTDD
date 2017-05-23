
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
		    
		    if(tam == 0){
		      primero = new Nodo();
		      primero.clave = clave;
		      primero.valor = valor;
		      primero.siguiente = null;
		      tam ++;
		      
		    }else{
		      
		      Nodo actual = primero;
		      Nodo sig = actual.siguiente;
		      
		      while (sig != null) {
		        actual = actual.siguiente;
		        sig = actual.siguiente;
		      }
		      
		       Nodo n = new Nodo();
		       n.clave = clave;
		       n.valor = valor;
		       n.siguiente = null;
		       tam ++;
		       actual.siguiente = n;
		       
		      tam++;
		    }

		  }
		  
		  public String get(String clave){
		    Nodo actual = primero;
		    String val = "";
		    while(actual != null){
		      if(actual!= null && actual.clave.equals(clave)){
		        val = actual.valor;
		      }
		      actual = actual.siguiente;
		    }
		    return val;
		  }

}
