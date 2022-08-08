package factoryPattern;

public class TaxCalculator {
    public static void main(String[] args) {
        System.out.println("Nagesh");
    }

    int calculateTax(SalaryDetails salaryDetails, TaxRegime taxRegime){
        /*int taxAmount = 0;
        if(taxRegime == TaxRegime.OLD){
            taxAmount += (salaryDetails.hra * 30)/100
                            + (salaryDetails.basePay * 40)/100;
        }else{
            taxAmount += (salaryDetails.basePay+salaryDetails.hra * 30)/100;
        }
        return taxAmount;*/

        TaxCalculationAlgo taxCalculationAlgo = TaxCalculationAlgoFactory.getTaxCalculationAlgoForRegime(taxRegime);
        return taxCalculationAlgo.calculateTax(salaryDetails);
    }
}
