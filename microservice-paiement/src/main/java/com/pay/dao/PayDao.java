package com.pay.dao;

import com.pay.model.Pay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayDao extends JpaRepository<Pay, Integer>{

    Pay findByidCommande(int idCommande);
}
