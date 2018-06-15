package com.slicetest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class ProductsDetails {
    private final String companyName;
    private final String productName;
    private final String type;
    private final String productDetail;
}
