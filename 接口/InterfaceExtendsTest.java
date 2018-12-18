package ½Ó¿Ú;

interface InterfaceA {
	int PROP_A = 5;
}

interface InterfaceB {
	int PROP_B = 6;
}

interface InterfaceC {
	int PROP_C = 7;
}

public class InterfaceExtendsTest{
	public static void main(String[] args) {
		System.out.println(InterfaceA.PROP_A);
		System.out.println(InterfaceB.PROP_B);
		System.out.println(InterfaceC.PROP_C);
	}
}
