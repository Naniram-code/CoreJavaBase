package Assignment;

public class Swaping_Number {
	
		void SwappingTwoWithTempVar() {
		 int a=20;
		 int b=30;
		 
		 System.out.println("Before Swapping a and b"+"\n"+"Value of a="+a +"\t"+"Value of b="+b);
         int temp=b;//with third temp variable
		      b=a;
		      a=temp;
		  System.out.println("After Swapping with temp veriable a and b"+"\n"+"Value of a="+a +"\t"+"Value of b="+b);
	     }
		
		void SwappingTwoWithoutTemp() {//without using temp variable
			int a=20;
			int b=30;
	            a=a*b;
	            b=a/b;
	            a=a/b;
	      
	        System.out.println("Swapping a and b without temp var"+"\n"+"Value of a="+a +"\t"+"Value of b="+b);
		}
		void SwappingThreeNumberWithoutTemp() {//without using temp variable
			int x=1;
			int y=2;
			int z=3;
			 System.out.println(" \n\nBefore Swapping x ,y and z"+"\n"+"Value of x="+x 
		        		+"\t"+"Value of y="+y+"\t"+"Value of z="+z);
	            x=x+y+z;
	            y=x-(y+z);
	            z=x-(y+z);
	            x= x-(y+z);
	            
	      System.out.println("Swapping x ,y and z without temp var"+"\n"+"Value of x="+x 
	        		+"\t"+"Value of y="+y+"\t"+"Value of z="+z);
		}
		void SwappingThreeNumberWithTemp() {//without using temp variable
			int x=1;
			int y=2;
			int z=3;
			int temp=x; 
	            x=y;
	            y=z;
	            z=temp;
	        
	            System.out.println("Swapping x ,y and z with temp var"+"\n"+"Value of x="+x 
	        		+"\t"+"Value of y="+y+"\t"+"Value of z="+z);
		}
	      public static void main(String[] args) {
			
			Swaping_Number Cobj= new Swaping_Number();
			Cobj.SwappingTwoWithTempVar();
			Cobj.SwappingTwoWithoutTemp();
			Cobj.SwappingThreeNumberWithoutTemp();
			Cobj.SwappingThreeNumberWithTemp();
	
			}
		
		}


