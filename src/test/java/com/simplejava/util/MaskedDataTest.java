package com.simplejava.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Description :
 * User: Tanveer Haider
 * Date: 5/4/2023
 * Time: 10:33 PM
 */
public class MaskedDataTest {

    @Test
    public void maskSensitiveData_ValidString(){
        String emailId="tanveer@gmail.com";
        String expectedString = "*************.com";
        String result= MaskData.maskSensitiveData(emailId);
        assertEquals(expectedString,result);

        String phoneNo="6475151726";
        expectedString = "******1726";
        result= MaskData.maskSensitiveData(phoneNo);
        assertEquals(expectedString,result);

        String str = null;
        result= MaskData.maskSensitiveData(str);
        assertNull(result);

    }
}
