import java.util.*;  
class c6usp10   
{  
    public static void main()  
    {  
              
    int n, reverse,sum=0,f;  
    Scanner sc = new Scanner(System.in);      
    System.out.println("Enter the number");  
    n = sc.nextInt();  
  
        while(n!=0)  
        {  
        reverse = n%10;  
        sum = sum*10 + reverse;  
        n= n/10;  
        }  
        
    f= 0;  
    for (int j=2;j<=sum/2;j++)  
    {  
        if ((sum % j) == 0)  
        {  
            f= 1;  
            break;  
        }  
    }  
    if (f == 0)  
            System.out.println("Twisted Prime");  
     else  
            System.out.println("Not Twisted Prime");  
}  
}  