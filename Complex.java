class Complex
{  
	double rp;
	double ip;
	Complex()
	{ 
		rp = 0.0;
		ip = 0.0; 
	}
	Complex(double r,double i)
	{ 
		rp = r;
		ip = i; 
	}
	public void add(Complex c1,Complex c2)
	{ 
		rp = c1.rp + c2.rp;
		ip = c1.ip + c2.ip; 
	}
	public void sub(Complex c1,Complex c2)
	{ 
		rp = c1.rp - c2.rp;
		ip = c1.ip - c2.ip;
	}
	public void print()
	{ 
		System.out.println("\n("+rp+","+ip+")");
	}
	public static void main(String arg[])
	{ 
		Complex c1 = new Complex(5.4,7);
		Complex c2 = new Complex(6.0,-5);
		Complex c3 = new Complex();
		Complex c4 = new Complex();
		System.out.print("\n Frist Complex number c1 is");
		c1.print();
		System.out.print("\n Second Complex number c2 is");
		c2.print();
		c3.add(c1,c2);
		c4.sub(c1,c2);
		System.out.print("\n Addition of two Complex numbers c1 and c2 is");
		c3.print();
		System.out.print("\n Subtraction of two Complex numbers c2 from c1 is");
		c4.print();
	}
}
