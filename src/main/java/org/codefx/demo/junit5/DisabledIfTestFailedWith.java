package org.codefx.demo.junit5;

import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@ExtendWith(DisabledIfTestFailedCondition.class)
public @interface DisabledIfTestFailedWith {

	Class<? extends Exception>[] value() default {};

}
