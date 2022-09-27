class Father{
	int money = 10000;
	public void spendMoney(){
		money = money - 1000;
	}	
}

class Son extends Father{
	int money = 5000;
	public void spendMoney(){
    //money = money - 2000;
		super.money = super.money - 2000;
	}	

	public void showFatherMoney(){
		System.out.println("Father's Account: "+super.money);
	}

	public static void main(String[] args)
	{
		Son s = new Son();
		s.spendMoney();
		s.spendMoney();
		System.out.println("Son's Account: "+s.money);
		s.showFatherMoney();
	}
}
