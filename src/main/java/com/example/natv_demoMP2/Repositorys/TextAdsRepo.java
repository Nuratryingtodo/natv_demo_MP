package com.example.natv_demoMP2.Repositorys;

import com.example.natv_demoMP2.Entitys.TextAds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextAdsRepo extends JpaRepository<TextAds,Long> {
}
