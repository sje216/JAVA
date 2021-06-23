package sec9;

public class CasherDesk {

	public static void main(String[] args) {
		Buyer casher = new Buyer();
		casher.buy(new Audio());
		casher.buy(new Tv2());
		casher.buy(new PlayStation());
		casher.buy(new Audio());
		casher.buy(new PlayStation());
		casher.buy(new Audio());
		casher.buy(new Computer());
		casher.buy(new Audio());
		casher.buy(new Computer());
		casher.summary();

	}

}
