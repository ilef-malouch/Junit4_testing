package junit.monprojet.test;

import junit.monprojet.SommeArgent;
import junit.monprojet.UniteDistincteException;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JUnitSommeArgent {
	
	SommeArgent m12CHF; 
	SommeArgent m14CHF;
	SommeArgent m14USD;
	
	public static int nbTest = 0;
	
	@Before
	public void initilisation() {
		 nbTest = nbTest+1;
		 System.out.println(nbTest+"ime passage avant exécution d'une méthode de test\r\n");
		 m12CHF= new SommeArgent(12, "CHF");
		 m14CHF= new SommeArgent(14, "CHF");
		 m14USD= new SommeArgent(14, "USD");
		 
	}

	@Test
	public void testAdditionSommeArgent() throws UniteDistincteException {
		SommeArgent expected = new SommeArgent(26, "CHF");
		SommeArgent result = m12CHF.add(m14CHF); // (2)
		Assert.assertTrue(expected.equals(result)); // (3)

	}

	@Test
	public void testEqualsSommeArgent() {
		Assert.assertTrue(!m12CHF.equals(null));
		Assert.assertEquals(m12CHF, m12CHF);
		Assert.assertEquals(m12CHF, new SommeArgent(12, "CHF")); // (1)
		Assert.assertTrue(!m12CHF.equals(m14CHF));
		Assert.assertTrue(!m14USD.equals(m14CHF));
	}
	@Test(expected = UniteDistincteException.class)
	public void testAddWithDifferentUnits() throws UniteDistincteException {
	    SommeArgent m1 = new SommeArgent(100, "EUR");
	    SommeArgent m2 = new SommeArgent(50, "USD");
	    m1.add(m2);
	}
	
	@After
	public void Finalisation() {
		 System.out.println(nbTest+"ime passage aprés exécution d'une méthode de test\r\n");
	}
}
