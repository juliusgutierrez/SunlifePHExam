import com.ph.sunlife.exam.dto.TaxComputationDTO;
import com.ph.sunlife.exam.tax.TaxStateStrategy;
import java.math.BigDecimal;

public class ApplicationRunner {


  public static void main(String[] args) {

    BigDecimal amount = new BigDecimal(6);

    TaxStateStrategy mn = TaxStateStrategy.MN;

    TaxComputationDTO model = mn.computeTax(amount);
    System.out.println(model);

    model = TaxStateStrategy.CA.computeTax(amount);

    System.out.println(model);


  }

}
