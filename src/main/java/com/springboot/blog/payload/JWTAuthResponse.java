package com.springboot.blog.payload;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class JWTAuthResponse {

    @NonNull
    private String accessToken;
    private String tokenType = "Bearer";

}
