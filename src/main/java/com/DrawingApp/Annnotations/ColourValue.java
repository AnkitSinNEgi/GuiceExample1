package com.DrawingApp.Annnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import com.google.inject.BindingAnnotation;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;


@BindingAnnotation
@Target({FIELD,PARAMETER,METHOD})@Retention(RUNTIME)
public @interface ColourValue {

}
