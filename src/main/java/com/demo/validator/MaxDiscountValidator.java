package com.demo.validator;

import com.demo.entity.Campaign;
import com.demo.entity.DiscountType;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class MaxDiscountValidator {

    public void validate(Campaign campaign, Errors errors) {
        if (DiscountType.RATE.equals(campaign.getDiscountType())) {
            if (campaign.getMaxDiscount() == null) {
                errors.reject("Maximum discount is mandatory");
            } else if (campaign.getMaxDiscount() > 100) {
                errors.reject("Maximum discount cannot more than 100");
            }
        }
    }
}
