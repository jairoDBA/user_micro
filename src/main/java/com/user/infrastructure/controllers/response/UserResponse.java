package com.user.infrastructure.controllers.response;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class UserResponse {
    private Long key;
    private String name;
    private String email;
}
