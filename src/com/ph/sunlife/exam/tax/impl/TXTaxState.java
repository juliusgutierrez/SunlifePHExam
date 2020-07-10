package com.ph.sunlife.exam.tax.impl;

import com.ph.sunlife.exam.tax.TaxState;
import java.math.BigDecimal;

public class TXTaxState extends TaxState {

  private static BigDecimal SALES_TAX = new BigDecimal(6.25);
  private static String STATE_NAME = "NM";

  public TXTaxState() {
    super(SALES_TAX, STATE_NAME);
  }

}
