package com.simplejava.util;

import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * Description :
 * User: Tanveer Haider
 * Date: 5/4/2023
 * Time: 8:49 PM
 */
public class MaskData {

    private static final int TOTAL_CHARS_TO_RETAIN=4;
    public static String maskSensitiveData(String sensitiveData) {
        if (Objects.nonNull(sensitiveData) && !sensitiveData.isBlank()) {
            int totalChars = sensitiveData.length();
            int maskedLength= totalChars-TOTAL_CHARS_TO_RETAIN;
            if(maskedLength>0)
                return findMaskedString(maskedLength) + sensitiveData.substring(maskedLength,totalChars);
            else
                return findMaskedString(maskedLength);

        }
        return sensitiveData;
    }

    private static String findMaskedString(int count){
        return "*".repeat(count);
    }
}
