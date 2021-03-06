package com.llzw.apigate.web.validation;

import com.google.common.base.Enums;
import com.llzw.apigate.persistence.entity.Role;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RoleConstraintValidator implements ConstraintValidator<ValidRole, String> {

  @Override
  public boolean isValid(final String role, final ConstraintValidatorContext context) {
    return Enums.getIfPresent(Role.RoleType.class, role).isPresent();
  }
}
