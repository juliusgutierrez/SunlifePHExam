package com.ph.sunlife.exam.tax.impl;

import com.ph.sunlife.exam.tax.TaxState;
import java.math.BigDecimal;

public class CATaxState extends TaxState {

  private static BigDecimal SALES_TAX = new BigDecimal(6.5);
  private static String STATE_NAME = "CA";

  public CATaxState() {
    super(SALES_TAX, STATE_NAME);
  }

}
