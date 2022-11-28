package com.gokdemiruzunkaya.data.repository;

import com.gokdemiruzunkaya.data.entity.DailyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDailyRepository extends JpaRepository<DailyEntity,Long> {

    //Kendi Sorgumuzu yazdık

}
