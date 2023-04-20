package Assignment;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int x=10;
    int y=x++;//10
    int z=++x;//12
    
    
    System.out.println("sum of= "+(x+y+z));//12+10+12// 1.y = one time assign=10 /2. x-->y=10 to 10+1=11=x(post) then x-->z=1+11=12(pre) now x=12
	}

}
