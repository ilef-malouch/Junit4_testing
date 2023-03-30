package junit.monprojet;

import java.util.HashMap;

public class PorteMonnaie {
	
	private HashMap<String, Integer> contenu;
	
	public HashMap<String, Integer> getContenu() {
		return contenu;
	}
	
	public PorteMonnaie() {
		contenu = new HashMap<String, Integer>();
	}
	
	public void ajouteSomme(SommeArgent sa) {
		 String unite = sa.getUnite();
		 int quantite = sa.getQuantite();
	
		 if (contenu.containsKey(unite)) {
			 int sommeExistante = contenu.get(unite);
		     contenu.put(unite, sommeExistante + quantite);
		 } else {
		     contenu.put(unite, quantite);
		 }
	}
	
	public String toString() {
		String result ="Le contenu du porte monnaie :\n";
		for (HashMap.Entry<String, Integer> entry : this.contenu.entrySet()) {
		   SommeArgent s = (SommeArgent) entry;
		   result = result + s.toString()+'\n';
		}
	    return result ;
		
	}
	public boolean equals(Object obj) {
		PorteMonnaie p = (PorteMonnaie)obj;
		
		if (p.getContenu().size() != this.contenu.size()) {
	        return false;
	    }
		
		for (HashMap.Entry<String, Integer> entry : this.contenu.entrySet()) {
		    String unite = entry.getKey();
		    int quantite = entry.getValue();
		    if(!p.getContenu().containsKey(unite) || p.getContenu().get(unite) != quantite) {
		    	return false;
		    }
		}
		return true;
	}

}