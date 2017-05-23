import static org.junit.Assert.*;

import java.lang.reflect.Array;

import org.junit.Before;
import org.junit.Test;

public class AsocArrayTest {

		private AsocArray array;
		
	@Before
	public void setUp(){
		array=new AsocArray();
		}
		
		
	@Test
	public void CreaciondeArrayAsociativoVacio(){
		assertEquals(0,array.size());
	}
	
	
	@Test
	  public void CreacionDeArrayAsociativoUnDato(){
	    array.put("paco", "martin");
	    assertEquals("martin", array.get("paco"));
	  }
	
	@Test
	public void CreacionDeArrayAsociativoConVariosDatos(){
	    array.put("paco", "martin");
	    array.put("maria", "perez");
	    assertEquals("martin", array.get("paco"));
	    assertEquals("perez",array.get("maria"));
	}
	
	@Test
	public void InsertarunNodoConLaMismaClaveModificasuValor(){
	    array.put("paco", "martin");
	    array.put("maria", "perez");
	    array.put("maria", "dominguez");
	    assertEquals("martin", array.get("paco"));
	    assertEquals("dominguez",array.get("maria"));
	    assertEquals(2,array.size());
		
	}
	
	
	@Test(expected=UndefinedKeyException.class)
	public void NoSeEncuentraClaveySeEleveUnaExcepcion(){
		array.get("paco");
	}
	
	@Test
	public void FuncionGetOrElseDevuelveValorSiEncuentraClave(){
		array.put("paco", "martin");
	    array.put("maria", "perez");
	    assertEquals("martin", array.getOrElse("paco","no hay valor"));
	}
	
	@Test
	public void FuncionGetOrElseDevuelveValorPorDefectoSiNoEncuentraClave(){
		array.put("paco", "martin");
	    assertEquals("no hay valor", array.getOrElse("pedro","no hay valor"));
		
	}
	
	@Test
	public void FuncioncontainsKeyDevuelveTrueSiEncuentraClave(){
		array.put("paco", "martin");
		assertEquals(true, array.containsKey("paco"));
	}
	
	@Test
	public void BorrarNodoDelArrayConUnElementoDevuelveTrue(){
		array.put("paco", "martin");
		assertEquals(true, array.remove("paco"));
		assertEquals(0,array.size());
	}
	
	@Test
	public void BorrarNodoDelArrayConVariosElementosDevuelveTrue(){
		array.put("paco", "martin");
		array.put("maria", "perez");
		array.put("juan", "dominguez");
		assertEquals(true, array.remove("paco"));
		assertEquals(2,array.size());
	}
	
}
