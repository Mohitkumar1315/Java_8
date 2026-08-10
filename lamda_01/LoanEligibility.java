package lamda_01;
@FunctionalInterface
public interface LoanEligibility 
{
  boolean check(LoanApplication loanApplication);   
}
