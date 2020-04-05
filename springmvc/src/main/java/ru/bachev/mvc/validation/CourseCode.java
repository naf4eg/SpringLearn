package ru.bachev.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD}) //где применяется аннотация, метод, поля
@Retention(RetentionPolicy.RUNTIME) //аннотация будет жить все время выполнения программы
public @interface CourseCode {

    //define default course code
    public String value() default "LUV";

    //define default error message
    public String message() default "must start with LUV";

    //define default group
    public Class<?>[] groups() default {};

    //define default payloads
    public Class<? extends Payload>[] payload() default{};

}
