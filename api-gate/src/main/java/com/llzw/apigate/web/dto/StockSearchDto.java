package com.llzw.apigate.web.dto;

import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class StockSearchDto {

  protected Long productId;

  protected Integer shelfLife;

  @Size(max = 30, message = "Length cannot exceed 30")
  protected String trackingId;

  @Size(max = 30, message = "Length cannot exceed 30")
  protected String carrierName;

  protected Boolean valid;
}
