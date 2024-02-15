package in.co.raysinterface;

public abstract class RichMan implements Businessmen{

	@Override
	public void earnMoney() {
		System.out.println("Businessmen earns money");
		
	}

	@Override
	public void donation() {
		System.out.println("Businessmen donates");
		
	}

	public abstract void party();

}
