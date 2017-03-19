package com.niningning.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.niningning.data.Distributor;

@Repository
public interface DistributorRepository extends JpaRepository<Distributor, Long> {

}
