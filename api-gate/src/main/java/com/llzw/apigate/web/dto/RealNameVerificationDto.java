package com.llzw.apigate.web.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class RealNameVerificationDto {

  @NotNull
  @Size(min = 1, max = 10, message = "Length must between 1 and 10")
  protected String identityType;

  @NotNull
  @Size(min = 1, max = 20, message = "Length must between 1 and 20")
  protected String identityNumber;

  @NotNull
  @Size(min = 1, max = 20, message = "Length must between 1 and 20")
  protected String firstName;

  @NotNull
  @Size(min = 1, max = 20, message = "Length must between 1 and 20")
  protected String lastName;
}
