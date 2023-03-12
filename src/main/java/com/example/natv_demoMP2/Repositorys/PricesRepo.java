package com.example.natv_demoMP2.Repositorys;

import com.example.natv_demoMP2.Entitys.Prices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PricesRepo extends JpaRepository<Prices,Long> {
}
