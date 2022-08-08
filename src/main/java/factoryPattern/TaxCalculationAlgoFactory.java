package factoryPattern;

public class TaxCalculationAlgoFactory {
    public static TaxCalculationAlgo getTaxCalculationAlgoForRegime(TaxRegime taxRegime){
        if(taxRegime ==TaxRegime.OLD)
            return new OldRegimeTaxCalculationAlgo();
        else
            return new NewRegimeTaxCalculationAlgo();
    }

    public static TaxCalculationAlgo getNewRegimeTaxCalculation(){
        return new NewRegimeTaxCalculationAlgo();
    }
}
