package exercicios;

public class AreaCircTeste {
	public static void main(String[] args) {
		AreaCirc a = new AreaCirc(5.6);
//		a.pi = 10;
		System.out.println(a.area());
	
//		AreaCirc b = new AreaCirc(10.0);
		
//		AreaCirc.PI = 3.1415;
//		b.pi = 5;
//		System.out.println(b.area());
		System.out.println(AreaCirc.area(100));
		System.out.println(AreaCirc.pi);
		System.out.println(Math.PI);
	
	}
}
