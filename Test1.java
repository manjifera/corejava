package demo;

class A {
	public int i;
	public int j;
	A(){
		i=1;
		j=2;
		System.out.println("running constructor");
	}
	A(int i){
		this();	
		}
}

class B extends A{
	int a;
	B(){
		super(2);
	}
}

class Test1{

public static void main(String[] args) {
	
	B obj  = new B();
	System.out.println(obj.i+" "+obj.j);
}
}