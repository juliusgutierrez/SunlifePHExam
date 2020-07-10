package com.ph.sunlife.exam.tax.impl;

import com.ph.sunlife.exam.tax.TaxState;
import java.math.BigDecimal;

public class MNTaxState extends TaxState {

  private static BigDecimal SALES_TAX = new BigDecimal(6.78);
  private static String STATE_NAME = "MN";

  public MNTaxState() {
    super(SALES_TAX, STATE_NAME);
  }


}
