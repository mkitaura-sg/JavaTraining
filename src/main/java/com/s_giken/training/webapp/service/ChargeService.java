package com.s_giken.training.webapp.service;

import java.util.List;
import java.util.Optional;

import com.s_giken.training.webapp.model.Charge;
import com.s_giken.training.webapp.model.ChargeSearchCondition;

public interface ChargeService {
    public List<Charge> findAll();

    public Optional<Charge> findById(int chargeId);

    public List<Charge> findByConditions(ChargeSearchCondition chargeSearchCondition);

    public void save(Charge charge);

    public void deleteById(int chargeId);
}
