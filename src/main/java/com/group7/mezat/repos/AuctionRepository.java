package com.group7.mezat.repos;

import com.group7.mezat.documents.Auction;
import com.group7.mezat.documents.AuctionStatus;
import com.group7.mezat.documents.FishPackage;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface AuctionRepository extends MongoRepository<Auction, String> {
    Auction getOneAuctionById(String id);

    List<Auction> findAllByAuctionStatus(Sort sort, AuctionStatus status);
}
