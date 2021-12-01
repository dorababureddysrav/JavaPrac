package JAVAPACK;

public class HSBCBank implements USbank,Brazilbank
{
 public void credit()
 {
	 System.out.println("hsbc credit");
 }
 public void debit()
 {
	 System.out.println("debit money");
 }
 public void trans()
 {
	 System.out.println("transfer money");
 }
 public void educ()
 {
	 System.out.println("edu loan");
 }
 public void carloan()
 {
	 System.out.println("car loan");
 }
 public void mutual()
 {
	 System.out.println("mutualfunds");
 }
}
