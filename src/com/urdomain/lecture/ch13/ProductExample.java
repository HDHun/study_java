package com.urdomain.lecture.ch13;

public class ProductExample {

	public static void main(String[] args) {
		Product<String, Integer> product = new Product<>();

		product.setKind("밴츠");
		product.setModel(400);
		System.out.println("내 차는" + product.getKind() + product.getModel());
	
		Product<Tv, String> product2 = new Product<>();
		
		Tv tv = new Tv();
		product2.setKind(tv);
		product2.setModel("OLED TV");
		// product2 > setKind > field 로 대입
	
		Tv rtTv = product2.getKind();
		String rtString = product2.getModel();
		
		System.out.println(rtTv + ":" + rtString );
		
		
		Product<Car, String> product3 = new Product<>();
		
		product3.setKind(new Car());
		product3.setModel("소나타");
		
		Car rtCar = product3.getKind();
		String rtString2 = product3.getModel();
		System.out.println(rtCar + rtString2);
	}

}
