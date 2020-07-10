package com.ph.sunlife.exam.tax;

import com.ph.sunlife.exam.dto.TaxComputationDTO;
import com.ph.sunlife.exam.tax.impl.CATaxState;
import com.ph.sunlife.exam.tax.impl.MNTaxState;
import com.ph.sunlife.exam.tax.impl.NMTaxState;
import com.ph.sunlife.exam.tax.impl.NYTaxtState;
import com.ph.sunlife.exam.tax.impl.TXTaxState;
import java.math.BigDecimal;

public enum TaxStateStrategy {

  MN {
    @Override
    public TaxComputationDTO computeTax(BigDecimal amount) {
      return new MNTaxState().performComputations(amount);
    }
  },
  CA {
    @Override
    public TaxComputationDTO computeTax(BigDecimal amount) {
      return new CATaxState().performComputations(amount);
    }
  },
  NY {
    @Override
    public TaxComputationDTO computeTax(BigDecimal amount) {
      return new NYTaxtState().performComputations(amount);
    }
  },
  NM {
    @Override
    public TaxComputationDTO computeTax(BigDecimal amount) {
      return new NMTaxState().performComputations(amount);
    }
  },
  TX {
    @Override
    public TaxComputationDTO computeTax(BigDecimal amount) {
      return new TXTaxState().performComputations(amount);
    }
  },

  ;


  public abstract TaxComputationDTO computeTax(BigDecimal amount);


}
