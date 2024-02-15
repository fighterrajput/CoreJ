package in.co.raysinterface;

class TestBusinessmen {
	public static void main(String[] args) {

		BusinessmenChild bc = new BusinessmenChild();
		bc.party();

		RichMan rm = new BusinessmenChild();
		rm.donation();
		rm.earnMoney();

		Businessmen bm = new BusinessmenChild();
		bm.donation();
		bm.earnMoney();
		bm.party();
		
		int a =  Businessmen.AVG_INCOME;
		System.out.println(Businessmen.AVG_INCOME);

	}
}
