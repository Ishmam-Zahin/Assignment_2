public class LeapYear {
    int year;

    public LeapYear(int year){
        this.year = year;
    }

    public boolean leapYearOrNot(){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) return true;
        else return false;
    }
}