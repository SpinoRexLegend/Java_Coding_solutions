import java.util.*;
public class Project_16
{
    public static void main()
    {
        Transport trnsprt = new Transport();
        trnsprt.accept();
        trnsprt.calculate();
        trnsprt.print();
    }
}

class Transport
{
    String name;
    int w = 0;
    int charge = 0;
    float totalBill = 0;
    
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Please enter the name: ");
        name = sc.nextLine();
        System.out.println ("Please enter the weight of the parcel: ");
        w = sc.nextInt();
    }
    
    void calculate()
    {
        int weightbelow10 = 0;
        int weightbelow30 = 0;
        int weightabove30 = 0;
        int chargebelow10 = 0;
        int chargebelow30 = 0;
        int chargeabove30 = 0;
        float surcharge = 0;
        
        if (w <=10)
        {
            weightbelow10 = w;
            weightbelow30 = 0;
            weightabove30 = 0;            
        }
        else if (w <=30)
        {
            weightbelow10 = 10;
            weightbelow30 = w - weightbelow10;
            weightabove30 = 0;
        }
        else
        {
            weightbelow10 = 10;
            weightbelow30 = 20;
            weightabove30 = w - (weightbelow10 + weightbelow30);
        }
        
        chargebelow10 = weightbelow10 * 25;
        chargebelow30 = weightbelow30 * 20;
        chargeabove30 = weightabove30 * 10;
        
        charge = chargebelow10 + chargebelow30 + chargeabove30;
        surcharge = charge * 5/100;
        totalBill = charge + surcharge;
    }
    
    void print()
    {
        System.out.println ("Name      Weight      BillAmount");
        System.out.println (name + "      " + w + "      " + totalBill);        
    }   
}
