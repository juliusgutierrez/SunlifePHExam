package com.ph.sunlife.exam.tax;

import com.ph.sunlife.exam.dto.TaxComputationDTO;
import java.math.BigDecimal;

public abstract class TaxState {

  private BigDecimal saleTax;
  private String stateName;

  public TaxState(BigDecimal saleTax, String stateName) {
    this.saleTax = saleTax;
    this.stateName = stateName;
  }

  public void setSaleTax(BigDecimal saleTax) {
    this.saleTax = saleTax;
  }

  public TaxComputationDTO performComputations(BigDecimal amount) {
    if (amount == null) {
      throw new RuntimeException("amount should not be null");
    }

    BigDecimal tax = saleTax.multiply(amount);
    return new TaxComputationDTO(stateName, saleTax, amount, tax);

  }

}
