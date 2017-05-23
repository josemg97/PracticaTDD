import static org.junit.Assert.*;

import org.junit.Test;

public class AsocArrayTest {

	@Test
	public void CreaciondeArrayAsociativoVacio(){
		AsocArray array = new AsocArray();
		assertEquals(0,array.size());
	}
	
	
	@Test
	  public void creacionDeArrayAsociativoUnDato() throws Exception {
	    AsocArray array = new AsocArray();
	    array.put("paco", "46");
	    assertEquals("46", array.get("paco"));
	  }
}
