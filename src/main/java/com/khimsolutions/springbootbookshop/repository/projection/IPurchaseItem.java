package com.khimsolutions.springbootbookshop.repository.projection;

import java.time.LocalDateTime;

// Projection for custom sql query with join tables
public interface IPurchaseItem {

    String getTitle();
    Double getPrice();
    LocalDateTime getPurchaseTime();

}
