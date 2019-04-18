package com.rybickim.spring.part4.aspects;

import com.rybickim.spring.part4.api.IZapiekanka;
import com.rybickim.spring.part4.implementations.Zapiekanka;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class AspectZapiekanka {

    @DeclareParents(value = "com.rybickim.spring.part4.api.ICook+", defaultImpl = Zapiekanka.class)
    public static IZapiekanka iZapiekanka;
}
