package com.khimsolutions.springbootbookshop.service;

import com.khimsolutions.springbootbookshop.model.PurchaseHistory;
import com.khimsolutions.springbootbookshop.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {

    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);
}
