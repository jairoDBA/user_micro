package com.user.infrastructure.controllers.request;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class UserRequest {

    private String name;
    private String email;
}
