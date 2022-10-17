package program2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AllinOneTest {
	@Test
	public void check()
	{
		America A1 = new America();
		assertEquals(50,A1.no_state());
		assertEquals("str",A1.states());
		
		Australia A2 = new Australia();
		assertEquals(6,A2.no_state());
		assertEquals("str",A2.states());
		

		Egypt E1 = new Egypt();
		assertEquals(27,E1.no_state());
		assertEquals("str",E1.states());
		
		India I1 = new India();
		assertEquals(28,I1.no_state());
		assertEquals("str",I1.states());
		
		Nepal N1 = new Nepal();
		assertEquals(7,N1.no_state());
		assertEquals("str",N1.states());
		
		North_Korea NK = new North_Korea();
		assertEquals(9,NK.no_state());
		assertEquals("str",NK.states());
		
		Pakistan P1 = new Pakistan();
		assertEquals(8,P1.no_state());
		assertEquals("str",P1.states());
		
		South_Africa SA = new South_Africa();
		assertEquals(9,SA.no_state());
		assertEquals("str",SA.states());
	}

}
