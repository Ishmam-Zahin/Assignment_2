import java.util.Scanner;

public class MainFunction {
    public static void main(String []str){
        Scanner input = new Scanner(System.in);

        //TaxPay
        System.out.println("Enter your marrage status(true or false) first then your income below:");
        TaxPay taxpay = new TaxPay(input.nextBoolean(), input.nextDouble());
        System.out.println("Your tax is = "+taxpay.getTax()+" dollar");

        //conversions
        System.out.println("Enter the decimal number to convert into Roman below:");
        DecimalToRoman roman = new DecimalToRoman(input.nextInt());
        roman.getRoman();

        //LeapYear
        System.out.println("Enter the year below:");
        LeapYear leapYear = new LeapYear(input.nextInt());
        if(leapYear.leapYearOrNot()) System.out.println("YES!");
        else System.out.println("NO!");
    }
}