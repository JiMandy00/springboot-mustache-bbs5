package com.mustache.bbs5;

import com.mustache.bbs5.entity.User;
import lombok.*;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
    private String username;
    private String password;

    public User toEntity() {
        return User.builder() // builder() : 필요한 값만 가져올 수 있음
                .username(this.username)
                .password(this.password)
                .build(); // 닫아주기
    }
}
