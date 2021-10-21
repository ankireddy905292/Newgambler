public class GamblerUC1{
	int everydayStake=100;
	int everyGameBet=1;

	public static void main(String[] args)
	{
		GamblerUC1 uc1=new GamblerUC1();
		System.out.println("Welcome Gambler");
		System.out.println("The user can start for the day is:"+uc1.everydayStake+"$");
		System.out.println("Minimum amount user can bet every game is:"+uc1.everyGameBet+"$");
		
	}
}