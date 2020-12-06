package com.github.nikyotensai.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Result<T> {

    private String code;
    private String message;
    private T data;

    public static <T> Result<T> create(String code, String message) {
        return new Result<>(code, message, null);
    }

    public static <T> Result<T> create(String code, String message, T data) {
        return new Result<>(code, message, data);
    }

}
