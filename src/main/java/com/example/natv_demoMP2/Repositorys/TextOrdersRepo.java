package com.example.natv_demoMP2.Repositorys;

import com.example.natv_demoMP2.Entitys.TextOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextOrdersRepo extends JpaRepository<TextOrder,Long> {
}
