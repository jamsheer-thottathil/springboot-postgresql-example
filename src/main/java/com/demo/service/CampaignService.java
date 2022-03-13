package com.demo.service;

import com.demo.entity.Campaign;
import com.demo.entity.CampaignType;

import java.util.List;
import java.util.Optional;

public interface CampaignService {

    List<Campaign> getCampaigns();

    Optional<Campaign> getCampaign(Integer id);

    Campaign saveCampaign(Campaign campaign);

    void deleteCampaign(Integer id);

    Optional<Campaign> findByCampaignTypeAndCampaignTypeId(CampaignType campaignType, Integer campaignTypeId);
}
