package java8.labda;

public class LambdaExpression {

	public static void main(String[] args) {
	
		Demo d = (a,b,c)->a+b+c;
		System.out.println(d.m1(10, 20, 30));
	}
	
	
}
