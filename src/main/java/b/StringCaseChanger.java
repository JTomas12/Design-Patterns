package b;

import b.StringDrink;

public class StringCaseChanger implements StringTransformer {
    public void execute(StringDrink drink){
        String temp = "";
        String nstr = drink.getText();
        char ch;
        for (int i=0; i<nstr.length(); i++){
            if(Character.isLowerCase(nstr.charAt(i))){
                ch = Character.toUpperCase(nstr.charAt(i));
                temp = temp + ch;
            }
            else {
                ch = Character.toLowerCase(nstr.charAt(i));
                temp = temp + ch;
            }
        }
        drink.setText(temp);

    }


}
