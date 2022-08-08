package factoryPattern;

public class OldRegimeTaxCalculationAlgo implements TaxCalculationAlgo{
    @Override
    public int calculateTax(SalaryDetails salaryDetails) {
        return (salaryDetails.hra * 30)/100
                + (salaryDetails.basePay * 40)/100;
    }
}
