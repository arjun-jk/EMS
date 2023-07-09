// FULL TIME EMPLOYEE

public class FTE extends EmployeeInfo {

    
    public double yearlySalary;
    
    
    public FTE(int eN, String fN, String lN, double dR, double yS) {
        super(eN, fN, lN, dR);
        yearlySalary = yS;
        
    }
  
    
    public double calcNetAnnualIncome() {
        return (yearlySalary *(1.0 - deductRate));
    }
    
}
