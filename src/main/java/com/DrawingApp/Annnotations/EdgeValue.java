package com.DrawingApp.Annnotations;


import com.google.inject.BindingAnnotation;
import java.lang.annotation.Target;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;

@BindingAnnotation
@Target({FIELD,PARAMETER,METHOD})@Retention(RUNTIME)
public @interface EdgeValue {

}
