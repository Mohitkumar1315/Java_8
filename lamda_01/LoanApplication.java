package lamda_01;
public class LoanApplication 
{
    private int LoanId;
    private String applicantName;
    private double salary;
    private double loanAmount;
    private String product;
    private String status;
    public int getLoanId()
    {
        return LoanId;        
    }
    public void setLoanId(int loanid)
    {
        this.LoanId=loanid;            
    }
    public String getProduct()
    {
      return product;
    }
    public void setProduct(String product)
    {
        this.product=product;
    }
    public void setStatus(String status)
    {
        this.status=status;
    }
    public String getStatus()
    {
        return status;           
    }
    public String getApplicationName() 
    {
        return applicantName;
    }
    public  void setApplciatioName(String name){
        applicantName=name;
    }  
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    } 
    public double getLoanAmount()
    {
        return loanAmount;
    }
    public void setLoanAmt(double loanamt)
    {
      loanAmount=loanamt;        
    }
}