package interviewquestions;

class ParentClass{

	int a=0;
}

public class ThisKeyword extends ParentClass{

	int a=10;
	
	void setValue(int a)
	{
//		this.a = a;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	
	public static void main(String[] args) {
		
		ThisKeyword t1 = new ThisKeyword();
		t1.setValue(20);
	}
}