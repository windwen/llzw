package com.llzw.apigate.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
public class Buyer extends User {
  private static final long serialVersionUID = 1L;

  @OneToMany(mappedBy = "owner")
  protected List<Address> addresses;

  public Buyer(
      String username,
      String password,
      String nickname,
      String email,
      String phoneNumber,
      IdType identity_type,
      String identity_number) {
    super(username, password, nickname, email, phoneNumber, identity_type, identity_number);
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return Arrays.asList(new SimpleGrantedAuthority("ROLE_BUYER"));
  }
}
