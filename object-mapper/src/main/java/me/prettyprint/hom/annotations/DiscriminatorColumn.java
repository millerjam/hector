package me.prettyprint.hom.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DiscriminatorColumn {

  String name() default "DTYPE";

  DiscriminatorType discriminatorType() default DiscriminatorType.STRING;

  String columnDefinition() default "";

  int length() default 31;

}