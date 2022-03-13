package com.demo.repository;

import com.demo.entity.Campaign;
import com.demo.entity.CampaignType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CampaignRepository extends JpaRepository<Campaign, Integer> {

    Optional<Campaign> findByCampaignTypeAndCampaignTypeId(CampaignType campaignType, Integer campaignTypeId);
}
