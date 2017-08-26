class Tradesman extends Employee{

	private String trade;

	Tradesman(){}

	Tradesman(String name, String depratment, String trade){
		super(name, depratment);
		this.trade = trade;
	}

	void put(){
		super.put();
		System.out.print(", Trade: " + trade);
	}

	private String getTrade(){
		return trade;
	}

	boolean equals(Tradesman t){
		if(super.equals(t)){
			return trade.equals(t.getTrade());
		}
		return false;
	}
}