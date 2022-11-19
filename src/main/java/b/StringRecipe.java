package b;

import b.StringDrink;

import java.util.List;

public class StringRecipe {
    List<StringTransformer> transformers_;
    public StringRecipe(List<StringTransformer> transformers){
        this.transformers_=transformers;
    }
    public void mix(StringDrink drink){
        for (StringTransformer t : transformers_){
            t.execute(drink);
        }

    }
}
