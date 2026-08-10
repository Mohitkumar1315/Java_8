package lamda_01;
import java.util.function.Consumer;
public class consumer 
{
     public static void main(String[] args) 
     {
        //Requirement : create a consumer that prints below details
//         Loan ID: 101
// Applicant: Rahul
// Amount: 1500000   
        LoanApplication application=new LoanApplication();   
        application.setApplciatioName("Mohitbkabir");
        application.setLoanAmt(50000.0);
         application.setSalary(36232);
         application.setProduct("HL");
         application.setStatus("Approved");
         application.setLoanId(5);
         Consumer<LoanApplication> loanPrinter=loan->{
            System.out.println("Loan Id :"+loan.getLoanId());
            System.out.println("Application name :"+loan.getApplicationName());
            System.out.println("Loan amount :"+loan.getLoanAmount());
         };
        
     }
}
