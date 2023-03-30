package junit.monprojet;

public class SommeArgent {
	private int quantite;
	private String unite;
	public SommeArgent(int amount, String currency) {
		quantite = amount;
		unite = currency;
	}
	public int getQuantite() {
		return quantite;
	}
	public String getUnite() {
		return unite;
	}
	public SommeArgent add(SommeArgent m) throws UniteDistincteException {
		if (!m.getUnite().equals(this.getUnite())) {
		throw new UniteDistincteException(this, m);
		}
		else return new SommeArgent(getQuantite()+m.getQuantite(), getUnite());
	}
	public boolean equals(Object anObject) {
		SommeArgent sa = (SommeArgent) anObject;
		return (sa != null && sa.getQuantite() == this.quantite && sa.getUnite() == this.unite);
	}
	public String toString() {
		return "Quantit�= "+this.quantite+" Unit�= "+this.unite;
	}

}
