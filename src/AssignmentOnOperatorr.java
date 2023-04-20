
public class AssignmentOnOperatorr {

	public static void main(String[] args) {
		//if a=4,b=3;find the value of C=a++*6+++b*5+10
		 
		AssignmentOnOperatorr obj1=new AssignmentOnOperatorr();
		obj1.Operator();
	}
		public void Operator() {
		int a=4;
		int b=3;
	
		int C= ((a++)*6)+(++b*5)+10; //a=4,b=4
		
		//1. a++ is called the post-increment operator. When used in an expression, 
		//it first uses the current value of a and then increments it by 1.
	    //2. In this expression, ++b is evaluated first, so a is incremented to 4, 
		//and then gets the value 4 (the new value of b).
		System.out.println("The value of C="+C);
		//System.out.println("The New value="+(((a++)*6)+(++b*5)+10));
		//System.out.println("The New value="+(((a++)*6)+(++b*5)+10));
		//System.out.println("The value of a="+a++); //4->5
		//System.out.println("The value of b="+(++b));//3-->5
		
		//int D= ((a++)*6)+(++b*5)+10;             //a=5,b=7
		//System.out.println("The New value="+(((a++)*6)+(++b*5)+10));}

	}
}

