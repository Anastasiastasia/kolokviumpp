import java.util.*;
import java.math.*;
public class kolokvium {
    public List<BigInteger>  Factorial(int n)
    {
        if(n<=0)
        {
            try {
                throw new  IllegalAccessException("input must be positive number");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            
        }
        List<BigInteger> factorials= new ArrayList<>();
         BigInteger f= BigInteger.ONE;
         for(int i=0;i<=n;i++)
         {
f=f.multiply(BigInteger.valueOf(i));
factorials.add(f);
         }
        
return factorials;  
    }
    public static void main(String[] args){
        kolokvium f=new kolokvium();
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        List<BigInteger> findfactorial=f.Factorial(n);
        for (BigInteger i : findfactorial)
        {
            System.out.println(i);
        }
        in.close();
    }
}