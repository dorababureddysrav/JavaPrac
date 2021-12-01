package JAVAPACK;

public class Testbank {

	public static void main(String[] args) 
	{
		System.out.println(USbank.minbal);
		HSBCBank hs =new HSBCBank();
		hs.credit();
		hs.carloan();
		hs.educ();
		hs.debit();
		
		
		USbank us = new HSBCBank();
		us.credit();
		us.debit();
		
		
}
}
