package com.ph.sunlife.exam.tax.impl;

import com.ph.sunlife.exam.tax.TaxState;
import java.math.BigDecimal;

public class NYTaxtState extends TaxState {

  private static BigDecimal SALES_TAX = new BigDecimal(4.00);
  private static String STATE_NAME = "NM";

  public NYTaxtState() {
    super(SALES_TAX, STATE_NAME);
  }

}
