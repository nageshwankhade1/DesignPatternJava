package factoryPattern;

public class NewRegimeTaxCalculationAlgo implements TaxCalculationAlgo{
    @Override
    public int calculateTax(SalaryDetails salaryDetails) {
        return (salaryDetails.basePay+salaryDetails.hra * 30)/100;
    }
}
