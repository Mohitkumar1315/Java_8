package lamda_01;
import java.util.function.Predicate;
public class predicate 
{
    public static void main(String[] args) 
    {
        LoanApplication application=new LoanApplication();   
        application.setApplciatioName("Mohitbkabir");
        application.setLoanAmt(50000.0);
         application.setSalary(36232);
         application.setProduct("HL");
         application.setStatus("Approved");

        //  product = "HL"
        //  AND
        //  status = "APPROVED"
        //  AND
        //  loanAmount > 500000
        Predicate<LoanApplication> approvedHLLoan =
        loan -> loan.getProduct().equals("HL")
              && loan.getStatus().equals("APPROVED")
              && loan.getLoanAmount() > 500000;           
        System.out.println("Check the concept :"+approvedHLLoan.test(application));
        
        // using  lamda 
        LoanEligibility approvedHLLoan1=(test)->test.getProduct().equals("HL")
              && test.getStatus().equals("APPROVED")
              && test.getLoanAmount() > 500000;  
              System.out.println("using lambda :"+approvedHLLoan1.check(application)); 
    }    
}
