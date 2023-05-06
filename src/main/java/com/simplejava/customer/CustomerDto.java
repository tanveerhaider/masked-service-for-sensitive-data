package com.simplejava.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.simplejava.util.MaskData;
import com.simplejava.util.Maskable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description :
 * User: Tanveer Haider
 * Date: 5/3/2023
 * Time: 3:53 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto implements Maskable {
    private long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    @JsonProperty("emailAddress")
    private String emailId;
    private String ssn;

    @Override
    public void maskFields() {
        this.emailId = MaskData.maskSensitiveData(this.emailId);
        this.phoneNumber = MaskData.maskSensitiveData(this.phoneNumber);
        this.ssn = MaskData.maskSensitiveData(this.ssn);
    }


}

