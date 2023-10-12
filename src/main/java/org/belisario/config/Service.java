package org.belisario.config;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Stereotype;
import jakarta.inject.Named;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@ApplicationScoped
@Stereotype
@Retention(RUNTIME)
@Target({TYPE, FIELD, METHOD})
public @interface Service {
}
