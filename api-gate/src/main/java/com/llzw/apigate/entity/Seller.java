package com.llzw.apigate.entity;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Arrays;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
public class Seller extends User {

    private static final long serialVersionUID = 1L;

    @Column(nullable = false)
    @NonNull
    protected Address contactAddress;

    public Seller(String username, String password, String nickname, String email, String phoneNumber, IdType identity_type, String identity_number) {
        super(username, password, nickname, email, phoneNumber, identity_type, identity_number);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_SELLER"));
    }

}

