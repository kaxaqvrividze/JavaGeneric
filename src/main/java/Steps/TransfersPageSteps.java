package Steps;

import Data.Constants;
import Utils.ArrayToSet;
import Utils.BooleanCompare;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class TransfersPageSteps {

    public TransfersPageSteps CheckClient(){
        boolean  CheckCompare = BooleanCompare.compare($x("//div[5]/span"), Constants.name);
        return this;
    }

    public TransfersPageSteps TransferCheckCurrency(){
        List<String> CurrencyArray = $$x("///div[4]//div").texts();
        Set<String> hs = new HashSet<String>();
        hs.add("EUR");
        hs.add("USD");
        BooleanCompare.compare(ArrayToSet.toSet(CurrencyArray),hs);
        return this;
    }
}
