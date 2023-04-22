package JavaReady;
public class WhileLoop {

    public static void main(String[] args) {
        int i=1;

//		while(true)
//		{
//			System.out.println("Hi"+ i);
//			i++;
//		}
//		while(i<=4)
//		{
//			System.out.println("Hi"+ i);
//			i++;
//		}
//		System.out.println("Bye"+i);


        while(i<=4)
        {
            System.out.println("Hi"+ i);
            int j=1;
            while(j<=3) {
                System.out.println("Hello"+j);
                j++;
            }
            i++;
        }
        System.out.println("Bye"+i);
    }
}
    /*For loop:-
        If you know how many iterations you want to go for loop
        (intiliazing vaue, condition, increment or decrement)

        While loop:-
        When you need to read the file go for while loop, if the number of iterations is not known.

        - For loop can also be used as a while.

        Do While Loop:-
        If you condition get false but you want to exceute the code at least once.*/

