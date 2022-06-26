package com.springboot.blog.payload;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Set;

@Data
public class PostDto {
    private long id;
    // title should be not null or empty
    // title should have min two characters
    @NotEmpty
    @Size(min = 2, message = "Post title should have min 10 characters.")
    private String title;

    // description should be not null or empty
    // description should have min 10 characters
    @NotEmpty
    @Size(min = 10, message = "Post description should have min 10 characters.")
    private String description;

    // description should be not null or empty
    @NotEmpty
    private String content;

    private Set<CommentDto> comments;
}
