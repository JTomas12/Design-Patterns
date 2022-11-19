package b;

import b.StringDrink;

public class StringInverter implements StringTransformer {
    private String s;
    public StringInverter(){}
    public void execute(StringDrink drink){
        String nstr = drink.getText();
        char ch;
        for (int i=0; i<nstr.length(); i++)
        {
            ch= nstr.charAt(i); //extracts each character
            s = ch+nstr; //adds each character in front of the existing string
        }
        drink.setText(s);

    }
}
