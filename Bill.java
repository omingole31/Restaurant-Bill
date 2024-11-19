package RestaurantBill;
import java.util.*;

public class Bill {

	public static void main(String[] args)
	{
		Date d = new Date();
		System.out.println("\t\t\tWelcome");
		System.out.println("\t\t\tMEHFIL");
		System.out.println("\t\t\tRESTAURANT");
		System.out.println("\t\tS.R NAGAR,AMEERPET,HYD.");
		System.out.println("\t\tGST IN:36ABHFM3416C1ZM");
		System.out.println("INV.NO.: 0122");
		System.out.println("DATE: "+d);
		//System.out.println("\t\tS.R NAGAR,AMEERPET,HYD.");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("NAME:");
		String name=sc.nextLine().toUpperCase();
		
		System.out.print("DISH:");
		String Dish=sc.nextLine().toLowerCase();
		
		double price=129.52;
		
        System.out.print("QUANTITY:");
        int quantity=sc.nextInt();
        
		//System.out.println("PRICE:"+(price*quantity));
		System.out.print("TOTAL AMOUNT:"+(price*quantity)+"\n");
		System.out.println("----------------------------------------------");
		
		System.out.println("GST DETAILS");
		System.out.println("A CGST 2.5% Amount:"+"\t"+"Rs"+(((price*quantity)*2.5)/100));
		System.out.println("B CGST 2.5% Amount:"+"\t"+"Rs"+(((price*quantity)*2.5)/100));
		System.out.println("TOTAL AMOUNT:"+"\t\t"+"Rs"+(price*quantity));
		System.out.println("TOTAL TAX:"+"\t\t"+"Rs"+(((price*quantity)*2.5)/100)*2);
		System.out.println("NET AMOUNT:"+"\t\t"+"Rs"+((price*quantity)+(((price*quantity)*2.5)/100)*2));
		System.out.println("----------------------------------------------");
		
		System.out.println("TOTAL"+" "+quantity+" "+"QTY"+"\t\t"+"Rs"+((price*quantity)+(((price*quantity)*2.5)/100)*2)+"\n");
		System.out.println("\t"+"HAVE A NICE DAY"+"\t"+name);
		System.out.println("\t"+"THANKYOU VISIT AGAIN");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
