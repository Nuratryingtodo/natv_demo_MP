package com.example.natv_demoMP2.Mappers;

import java.util.List;
public interface BaseMapper <E,D>{
    D toDTO(E e);
    E toEntity(D d);
    List<D> toDTOList(List<E>eList);
    List<E> toEntityList (List<D>dList);



}
