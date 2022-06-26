package com.springboot.blog.payload;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Data
public class CommentDto {
    private long id;

    @NotEmpty(message = "Name should not be null or empty.")
    private String name;

    @NotEmpty(message = "Email should not be null or empty.")
    @Email(message = "Email should have valid email form.")
    private String email;

    @NotEmpty
    @Min(10)
    private String body;
}
