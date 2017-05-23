import static org.junit.Assert.*;

import org.junit.Test;

public class AsocArrayTest {

	@Test
	public void CreaciondeArrayAsociativoVacio(){
		AsocArray array = new AsocArray();
		assertEquals(0,array.size());
	}
	
	
	@Test
	  public void CreacionDeArrayAsociativoUnDato(){
	    AsocArray array = new AsocArray();
	    array.put("paco", "martin");
	    assertEquals("martin", array.get("paco"));
	  }
	
	@Test
	public void CreacionDeArrayAsociativoConVariosDatos(){
		AsocArray array = new AsocArray();
	    array.put("paco", "martin");
	    array.put("maria", "perez");
	    assertEquals("martin", array.get("paco"));
	    assertEquals("perez",array.get("maria"));
	}
	
	@Test
	public void InsertarunNodoConLaMismaClaveModificasuValor(){
		AsocArray array = new AsocArray();
	    array.put("paco", "martin");
	    array.put("maria", "perez");
	    array.put("maria", "dominguez");
	    assertEquals("martin", array.get("paco"));
	    assertEquals("perez",array.get("maria"));
	    assertEquals(2,array.size());
		
	}
	
}
