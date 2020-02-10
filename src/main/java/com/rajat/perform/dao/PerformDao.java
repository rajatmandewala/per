package com.rajat.perform.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rajat.perform.model.PerformModel;

public interface PerformDao extends JpaRepository<PerformModel, Integer> {}
