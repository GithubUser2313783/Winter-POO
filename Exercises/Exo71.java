import java.util.Scanner;
public class Exo71 {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			String[] dishes = {"Shrimps", "Salad", "Fries", "Hamburger", "Cake"};
			float[] price = {(float) 8.99, (float) 5.60, (float) 6.40, (float) 10.99, (float) 7.99};
			while(true)			
			System.out.println("1. ADD ITEM");
			System.out.println("2. DESTROY ITEM");
			System.out.println("3. SHOW RECEIPT");
			System.out.println("4. TERMINATE");
			String choice = scanner.next();
			System.out.println("YOU HAVE CHOSEN : " + choice);
			System.out.println("ACTIVATE ENTER");
			System.out.println("\n\n");
			if(choice == `1`){
				for(int i = 0 ; i < dishes.length ; i++){
					String priceFormat = String.format("%.02f$", price[i]);
					System.out.println((i+1) + ". " + dishes[i] +
						" ".repeat(24 - dishes[i].length() - priceFormat.length()) + price[i]);
				}
				System.out.println("ENTER DISH: ");
				choice = scanner.next();
				check.add(dishes[Integer.parseInt(choice) - 1]);
			}
			else if(choice.equals("3")){
				for(int i = 0 ; i < check.size() ; i++){
					String priceFormat = String.format("%.02f$", price[i]);
					
					System.out.println((i+1) + ". " + check.get(i) + " ".repeat(24 - check.get(i).length() - priceFormat.length()) + priceFormat);
					
				}
				System.out.println("-".repeat(27));
				String totalFormat = String.format("%.02f$",total);
				System.out.println("Total" + " ".repeat(22 - totalFormat.length()) + totalFormat);
				System.out.println("1. ADD ITEM");
			}
		}
	}
