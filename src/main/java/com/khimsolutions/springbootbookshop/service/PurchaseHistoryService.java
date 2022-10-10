package com.khimsolutions.springbootbookshop.service;

import com.khimsolutions.springbootbookshop.model.PurchaseHistory;
import com.khimsolutions.springbootbookshop.repository.IPurchaseHistoryRepository;
import com.khimsolutions.springbootbookshop.repository.projection.IPurchaseItem;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;

public class PurchaseHistoryService implements IPurchaseHistoryService {

    @Autowired
    private IPurchaseHistoryRepository purchaseHistoryRepository;

    @Override
    public PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory) {

        purchaseHistory.setPurchaseTime(LocalDateTime.now());

        return purchaseHistoryRepository.save(purchaseHistory);
    }

    @Override
    public List<IPurchaseItem> findPurchasedItemsOfUser(Long userId) {

        return purchaseHistoryRepository.findAllPurchasesOfUser(userId);
    }
}