package junit.monprojet.test;

import static org.junit.Assert.*;
import java.util.HashMap;
import junit.monprojet.PorteMonnaie;
import junit.monprojet.SommeArgent;

import org.junit.Assert;
import org.junit.Test;

public class JUnitPorteMonnaie {

	@Test
	public void testajouteSomme() {
		
	    
		PorteMonnaie p = new PorteMonnaie();
		p.ajouteSomme(new SommeArgent(100, "EUR"));
		p.ajouteSomme(new SommeArgent(50, "USD"));
		p.ajouteSomme(new SommeArgent(50, "USD"));
		
		PorteMonnaie p1 = new PorteMonnaie();
		p1.ajouteSomme(new SommeArgent(100, "EUR"));
		p1.ajouteSomme(new SommeArgent(100, "USD"));
		
		Assert.assertTrue(p.equals(p1));
		

	}

}
