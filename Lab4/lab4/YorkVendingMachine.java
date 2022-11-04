package lab4;

/*
 * Requirements:
 * - Any use of Java library classes or methods (e.g., ArrayList, System.arraycopy) is forbidden.
 * 	 (That is, there must not be an import statement in the beginning of this class.)
 * Violation of this requirement will result in a 50% penalty of your marks.
 *  
 * - Use only if-statements and/or loops to manipulate primitive arrays (e.g., int[], String[]).
 */

public class YorkVendingMachine {
	
	
	public  String Message="Empty VM Started";
	
	
	public int Stock=0;
	
	
	public String Snack = "";
	
	
	public int Batch;
	
	
	public int KitkatS = 0;
	
	
	public int LaysS = 0;
	
	
	public int JuiceS = 0;
	
	
	public String ProdM;
	
	
	public int CokeS = 0;
	
	
	public boolean flag= false;
	

	public String getMessage() {
		return Message;
	}
	

	
	public String checkStock(String Snack) {
		if (Snack=="Kitkat Chunky Bar") {
			return  Snack+" ("+KitkatS+")";
		}
		else if(Snack == "Orange Juice" ) {
			return  Snack+" ("+JuiceS+")";
		}
		else if(Snack=="Lay's Classic Chips") {
			return  Snack+" ("+LaysS+")";
		}
		else if(Snack=="Coke") {
			return  Snack+" ("+CokeS+")";
		}
		else return "Invalid product: "+Snack; 
	}
	
	public String checkStock() {
		if(Snack == "Kitkat Chunky Bar" || Snack == "Orange Juice" || Snack == "Lay's Classic Chips" || Snack == "Coke" || Snack == "" ) {
		return "Stock: Coke ("+CokeS+"), Orange Juice ("+JuiceS+"), Kitkat Chunky Bar ("+KitkatS+"), Lay's Classic Chips ("+LaysS+")";
		}
		else {
		return "Stock: Coke ("+CokeS+"), Orange Juice ("+JuiceS+"), Kitkat Chunky Bar ("+KitkatS+"), Lay's Classic Chips ("+LaysS+")";
		
		}
	}
	
	public String addtoStock(String Snack, int Stock) {
		
		
		this.Snack = Snack;
		this.Stock=Stock;
		if (this.Snack=="Kitkat Chunky Bar") {
			KitkatS= KitkatS + Stock;
			flag = true;
			Message = "Product added: "+this.Snack+" ("+KitkatS+")";
		}
		else if(this.Snack == "Orange Juice" ) {
			JuiceS+=Stock;
			flag = true;
			Message = "Product added: "+this.Snack+" ("+JuiceS+")";
		}
		else if(this.Snack=="Lay's Classic Chips") {
			LaysS += Stock;
			flag = true;
			Message = "Product added: "+this.Snack+" ("+LaysS+")";
		}
		else if(this.Snack=="Coke") {
			CokeS+=Stock;
			flag = true;
			Message = "Product added: "+this.Snack+" ("+CokeS+")";
			
		}
		if(flag == false) {
			Message = "Invalid product: "+this.Snack;
		}
		return "";
	}
	
	
	public String addBatch(int Batch) {
		this.Batch=Batch;
		KitkatS += Batch;
		JuiceS += Batch;
		LaysS += Batch;
		CokeS += Batch;
		return "Stock: Coke ("+KitkatS+"), Orange Juice ("+JuiceS+"), Kitkat Chunky Bar ("+LaysS+"), Lay's Classic Chips ("+CokeS+")";
	}
	
	
	public String dispense(String Snack, int Stock) {
		this.Snack=Snack;
		this.Stock=Stock;
		if (Snack=="Kitkat Chunky Bar") {
			KitkatS= KitkatS - Stock;
			Message = "Product removed: "+Snack+" ("+Stock+")";
		}
		else if(Snack == "Orange Juice" ) {
			JuiceS-=Stock;
			Message = "Product removed: "+Snack+" ("+Stock+")";
		}
		else if(Snack=="Lay's Classic Chips") {
			LaysS -= Stock;
			Message = "Product removed: "+Snack+" ("+Stock+")";
		}
		else if(Snack=="Coke") {
			CokeS-=Stock;
			Message = "Product removed: "+Snack+" ("+Stock+")";
		}
		else {
			Message = "Invalid product: "+this.Snack;
		}
		return "Stock: Coke ("+KitkatS+"), Orange Juice ("+JuiceS+"), Kitkat Chunky Bar ("+LaysS+"), Lay's Classic Chips ("+CokeS+")";
	}
	
	public String clear() {
		KitkatS = 0;
		JuiceS = 0;
		LaysS = 0;
		CokeS = 0;
		return "Stock: Coke ("+KitkatS+"), Orange Juice ("+JuiceS+"), Kitkat Chunky Bar ("+LaysS+"), Lay's Classic Chips ("+CokeS+")";
	}
	
	
}
