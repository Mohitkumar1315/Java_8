package lamda_01;
public class ValidateLoanEligibility {
    public static void main(String[] args) {
     LoanApplication application=new LoanApplication();
     application.setApplciatioName("Mohitbkabir");
     application.setLoanAmt(50000.0);
     application.setSalary(36232);

         LoanEligibility checkEligibility=(app)->{
        return app.getSalary()>20000 && app.getLoanAmount()>40000;
     };
     boolean loanElebliltiy=checkEligibility.check(application);
     System.out.println("Loan eligibility:"+loanElebliltiy);
    }
}