package com.arnoldgalovics.blog.swagger.breaker.core.model.transformer;

public interface Transformer<S, R> {
    R transform(S from);
}