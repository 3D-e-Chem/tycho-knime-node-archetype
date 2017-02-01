package ${package};

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ${package}.${node}Factory;

public class ${node}FactoryTest {
	
	@Test
    public void testGetNrNodeViews() {
		${node}Factory factory = new ${node}Factory();
		
		int nrviews = factory.getNrNodeViews();
		
		assertEquals(1, nrviews);
	}
}