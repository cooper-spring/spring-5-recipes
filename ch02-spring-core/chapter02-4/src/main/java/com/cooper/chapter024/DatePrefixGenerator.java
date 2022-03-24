package com.cooper.chapter024;

import lombok.RequiredArgsConstructor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//@Primary : 후보빈을 명시 - 자동 연결 대상일 때 특정한 빈에 우선권을 부여
@DatePrefixAnnotation
@RequiredArgsConstructor
public class DatePrefixGenerator implements PrefixGenerator {

    private final DateFormat formatter;

    public DatePrefixGenerator(String pattern) {
        this.formatter = new SimpleDateFormat(pattern);
    }

    public String getPrefix() {
        return formatter.format(new Date());
    }

}