package b;

import b.StringDrink;

public class StringReplacer implements StringTransformer {
    char A;
    char X;
    public StringReplacer(char a, char x){
        this.A=a;
        this.X=x;
    }
    public void execute(StringDrink drink){
        String temp = drink.getText();
        temp.replace(A,X);
        drink.setText(temp);

    }

}
