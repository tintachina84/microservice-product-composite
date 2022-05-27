package com.tintachina84.api.composite.product;

public record ServiceAddresses(
    String cmp,
    String pro,
    String rev,
    String rec
) {
    public ServiceAddresses {
        cmp = null;
        pro = null;
        rev = null;
        rec = null;
    }
}
