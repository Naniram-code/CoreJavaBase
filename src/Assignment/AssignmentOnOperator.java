package Assignment;

public class AssignmentOnOperator {

	public static void main(String[] args) {
		//if a=4,b=3;find the value of C=a++*6+++b*5+10
		 
		AssignmentOnOperator obj1=new AssignmentOnOperator();
		obj1.Operator();
		obj1.RameshBasicSakary();
		obj1.SumOfDigit();
	}
		void Operator() {
		int a=4;
		int b=3;
		int C= ((a++)*6)+(++b*5)+10; // post increment a=4, pre increment b=4
			System.out.println("The value of C="+C);
			System.out.println("Pow ="+Math.pow(4,8));

	}
	//Provide value for Ramesh basic Salary.His dearness allowrance is 40% of basic salary and house rent allowance is 70% of
	//basic salary.WAP to calculate his gross salary .Ex basic =10000,da=4000,hra=7000,gs=210000.
	 void RameshBasicSakary()
	{
		double basic=10000d;
		double da=0.4*10000d;
		double hra=0.7*10000d;
		double gs=basic+da+hra;
		System.out.println("Ramesh Gross Salary="+gs);
	}
	//if a 3-digit number is provided WAP to calculate the sum of its digit Eg. no=123.The output should be 1+2+3=6
	 public void SumOfDigit()
	 {
		 int number=123;
		 int sum=0;

		 sum +=number%10;// modulus 3 add (sum=0+3)
		 number=number/10;//remove 3(number=12)
		 sum +=number%10;// (sum=3+2)
		 number=number/10;  // (number=1)
		 sum +=number;     //(5+1)

		 System.out.println("The sum of digit=="+sum);
	 }
}

