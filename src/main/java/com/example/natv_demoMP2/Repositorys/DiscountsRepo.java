package com.example.natv_demoMP2.Repositorys;

import com.example.natv_demoMP2.Entitys.Discounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountsRepo extends JpaRepository<Discounts,Long> {
//    List<Discounts> findAllByChannelsAndEndDate(Channel channel);


}
