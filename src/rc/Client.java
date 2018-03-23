  package rc;


public class Client {

	public static void main(String[]args) throws InvalidAmount,InsufficientAmount {
		int amount=1000;
		int bal=0;
		if(amount<900) { 
			throw new InvalidAmount("valid amount");
		
		}
		else if(amount>bal) {
			throw new InsufficientAmount ("invalid amount");
		}
		else {
		System.out.println("enter exact bal");
		}
		

	}

}
