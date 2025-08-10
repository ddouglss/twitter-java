package com.ddouglss.springsecurity.data.dto;

public record LoginResponse(String accessToken, Long expiresIn) {
}
