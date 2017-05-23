
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
		      boolean encontrado = false;
		      
		      while (sig != null && !encontrado) {
		        actual = actual.siguiente;
		        sig = actual.siguiente;
		        if(actual.clave.equals(clave)){
		          actual.valor = valor;
		          encontrado = true;
		        }
		      }
		      
		      if(!encontrado){
		         Nodo n = new Nodo();
		         n.clave = clave;
		         n.valor = valor;
		         n.siguiente = null;
		         actual.siguiente = n;
		         tam ++;
		      }
		    }

		  }
		  
		  public String get(String clave){
		    Nodo actual = primero;
		    boolean encontrado = false;
		    String val = "";
		    while(actual != null && !encontrado){
		      if(actual!= null && actual.clave.equals(clave)){
		        val = actual.valor;
		        encontrado = true;
		      }
		      actual = actual.siguiente;
		    }
		    if(!encontrado){
		    	throw new UndefinedKeyException();
		    }
		    return val;
		  }



		public String getOrElse(String clave, String valorPorDefecto) {
		    Nodo actual = primero;
		    boolean encontrado = false;
		    String val = "";
		    while(actual != null && !encontrado){
		      if(actual!= null && actual.clave.equals(clave)){
		        val = actual.valor;
		        encontrado = true;
		      }
		      actual = actual.siguiente;
		    }
		    if(!encontrado){
		    	val=valorPorDefecto;
		    }
		    return val;
			
		}



		public boolean containsKey(String clave) {
		    Nodo actual = primero;
			boolean encontrado = false;
			while(actual != null && !encontrado){
				if(actual.clave.equals(clave)){
			        encontrado=true;
			}
		}
			return encontrado;

}



		public Object remove(String string) {
			// TODO Auto-generated method stub
			return null;
		}
}
