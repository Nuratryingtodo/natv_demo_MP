package com.example.natv_demoMP2.Repositorys;

import com.example.natv_demoMP2.Entitys.Channels;
import com.example.natv_demoMP2.Enums.Statuses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChannelsRepo extends JpaRepository<Channels,Long> {
    List<Channels> findAllByIdInAndStatus(List<Long> ids, Statuses status);
}
