package com.ohayou.liteshop.config;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author liyan
 * @date 2020/8/1 下午11:28
 */
@ControllerAdvice
public class GlobalParamHandler {


    private static class CustomLocalDateEditor extends PropertyEditorSupport {

        @Override
        public void setAsText(String text) throws IllegalArgumentException {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localDate = LocalDate.parse(text, dateTimeFormatter);
            super.setValue(localDate);
        }

    }

    private static class CustomLocalDateTimeEditor extends PropertyEditorSupport {

        @Override
        public void setAsText(String text) throws IllegalArgumentException {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime localDateTime = LocalDateTime.parse(text, dateTimeFormatter);
            super.setValue(localDateTime);
        }

    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(LocalDate.class,new CustomLocalDateEditor());
        binder.registerCustomEditor(LocalDateTime.class,new CustomLocalDateTimeEditor());
    }


}
