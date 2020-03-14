package com.cts.swrb.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.swrb.model.AppUserEntity;

@Repository
public interface AppUserEntityRepository extends CrudRepository<AppUserEntity,Integer> {
	AppUserEntity findByUserName(String userName);
	boolean existsByUserName(String userName );
}
