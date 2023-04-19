
public class Pizaa {

	private int price;
	private Boolean veg;
	
	private int extraCheesePrice=3;
	private int extraToppingsPrice=5;
	
	private int packingPrice =1;
	
	private Boolean extraCheeseAdded=true;
	private Boolean extraToppingsAdded=true;
	private Boolean packingPriceAdded=false;

	public Pizaa(Boolean veg) {
		this.veg = veg;
		if (this.veg) {
			this.price = 15;
		} else {
			this.price = 25;
		}
	}
	public void getPrice() {
		System.out.println("basePrice :" +"$ "+ this.price);
	}
	public void addExtraCheese() {
		if(extraCheeseAdded) {
		System.out.println("Extra Cheese Added :" +"$ " +extraCheesePrice);
		this.price+=extraCheesePrice;
		}
	}
	public void addExtraToppings() {
		if(extraToppingsAdded) {
		System.out.println("Extra Toppings Added :" +"$ " +extraToppingsPrice);
		this.price+=extraToppingsPrice;
		}
	}
	public void takeAway() {
		packingPriceAdded=true;
		System.out.println("packing Charge:"  +"$ " +packingPrice );
		this.price+=packingPrice;
	}
	public void getBill() {
		System.out.println("Total Amount: " +"$ "+ this.price);

}
}
