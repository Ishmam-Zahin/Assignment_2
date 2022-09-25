public class DecimalToRoman {
    int decimal;

    public DecimalToRoman(int decimal){
        this.decimal = decimal;
    }

    public void getRoman(){
        if(decimal >= 1000){
            int x = decimal / 1000;
            while(x>0){
                System.out.print("M");
                x = x - 1;
                decimal = decimal - 1000;
            }
        }

        if(decimal >= 100 && decimal <= 999){
            int x = decimal / 100;
            if(x == 9){
                System.out.print("CM");
                decimal = decimal - 900;
            }
            else if(x == 4){
                System.out.print("CD");
                decimal = decimal - 400;
            }
            else {
                while(x > 0){
                    if(x>=5) {
                        System.out.print("D");
                        x = x - 5;
                        decimal = decimal - 500;
                    }
                    else{
                        System.out.print("C");
                        x = x - 1;
                        decimal = decimal - 100;
                    }
                }
            }
        }

        if(decimal >= 10 && decimal <= 99){
            int x = decimal / 10;
            if(x == 9){
                System.out.print("XC");
                decimal = decimal - 90;
            }
            else if(x == 4){
                System.out.print("XL");
                decimal = decimal - 40;
            }
            else {
                while(x > 0){
                    if(x>=5) {
                        System.out.print("L");
                        x = x - 5;
                        decimal = decimal - 50;
                    }
                    else{
                        System.out.print("X");
                        x = x - 1;
                        decimal = decimal - 10;
                    }
                }
            }
        }

        if(decimal >= 1 && decimal <= 9){
            int x = decimal / 1;
            if(x == 9){
                System.out.print("IX");
                decimal = decimal - 9;
            }
            else if(x == 4){
                System.out.print("IV");
                decimal = decimal - 4;
            }
            else {
                while(x > 0){
                    if(x>=5) {
                        System.out.print("V");
                        x = x - 5;
                        decimal = decimal - 5;
                    }
                    else{
                        System.out.print("I");
                        x = x - 1;
                        decimal = decimal - 1;
                    }
                }
            }
        }
        System.out.print("\n");
    }
}