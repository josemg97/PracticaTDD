
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

}
