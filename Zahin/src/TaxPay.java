public class TaxPay {
    double income;
    boolean marriedStatus;

    public  TaxPay(boolean marriedStatus, double income){
        this.marriedStatus = marriedStatus;
        this.income = income;
    }

    public double getTax(){
        double tax;

        if(marriedStatus){
            if(income <= 16000){
                tax = income * Constants.TEN_BY_HUNDRED;
            }
            else if(income >16000 && income <= 64000){
                tax = 1600 + ((income - 16000) * Constants.FIFTEEN_BY_HUNDRED);
            }
            else{
                tax = 8800 + ((income - 64000) * Constants.TWINTYFIVE_BY_HUNDRED);
            }
        }
        else{
            if(income <= 8000){
                tax = income * Constants.TEN_BY_HUNDRED;
            }
            else if(income >8000 && income <= 32000){
                tax = 800 + ((income - 8000) * Constants.FIFTEEN_BY_HUNDRED);
            }
            else{
                tax = 4400 + ((income - 32000) * Constants.TWINTYFIVE_BY_HUNDRED);
            }
        }

        return tax;
    }
}