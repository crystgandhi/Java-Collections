
public class BillGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Your Order");
		Pizaa basePizaa = new Pizaa(false);
		basePizaa.getPrice();
		basePizaa.addExtraCheese();
		basePizaa.addExtraToppings();
		basePizaa.takeAway();
		basePizaa.getBill();

	}

}
