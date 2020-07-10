package com.ph.sunlife.exam.dto;

import java.math.BigDecimal;

public class TaxComputationDTO {

  private String state;
  private BigDecimal salesTax;
  private BigDecimal amount;
  private BigDecimal computedTax;

  public TaxComputationDTO(String state,
      BigDecimal salesTax, BigDecimal amount, BigDecimal computedTax) {
    this.state = state;
    this.salesTax = salesTax;
    this.amount = amount;
    this.computedTax = computedTax;
  }

  public BigDecimal getSalesTax() {
    return salesTax;
  }

  public void setSalesTax(BigDecimal salesTax) {
    this.salesTax = salesTax;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public BigDecimal getComputedTax() {
    return computedTax;
  }

  public void setComputedTax(BigDecimal computedTax) {
    this.computedTax = computedTax;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  @Override
  public String toString() {
    return "TaxComputationDTO{" +
        "state='" + state + '\'' +
        ", salesTax=" + salesTax +
        ", amount=" + amount +
        ", computedTax=" + computedTax +
        '}';
  }
}
