package com.ph.sunlife.exam.tax.impl;

import com.ph.sunlife.exam.tax.TaxState;
import java.math.BigDecimal;

public class NMTaxState extends TaxState {

  private static BigDecimal SALES_TAX = new BigDecimal(5.125);
  private static String STATE_NAME = "NM";


  public NMTaxState() {
    super(SALES_TAX, STATE_NAME);
  }

}
