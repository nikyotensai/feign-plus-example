package com.github.nikyotensai.clients.fallback;

import com.github.nikyotensai.feign.fallback.annotation.Return;

import java.lang.annotation.*;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Return(handler = CommonPostHandler.class)
public @interface CommonReturn {
}
