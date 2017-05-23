import static org.junit.Assert.*;

import org.junit.Test;

public class AsocArrayTest {

	@Test
	public void CreaciondeArrayAsociativoVacio(){
		AsocArray array = new AsocArray();
		assertEquals(0,array.size());
	}
}
