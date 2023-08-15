package com.s_giken.training.webapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.s_giken.training.webapp.model.Charge;
import com.s_giken.training.webapp.model.ChargeSearchCondition;
import com.s_giken.training.webapp.repository.ChargeRepository;

/**
 * 料金管理機能のサービスクラス
 */
@Service
public class ChargeServiceImpl implements ChargeService {
    private ChargeRepository chargeRepository;

    /**
     * 料金管理機能のサービスクラスのコンストラクタ
     * 
     * @param chargeRepository 料金管理機能のリポジトリクラス(SpringのDIコンテナから渡される)
     */
    public ChargeServiceImpl(ChargeRepository chargeRepository) {
        this.chargeRepository = chargeRepository;
    }

    /**
     * 料金を全件取得する
     * 
     * @return 全料金情報
     */
    @Override
    public List<Charge> findAll() {
        return chargeRepository.findAll();
    }

    /**
     * 料金を1件取得する
     * 
     * @param chargeId 料金ID
     * @return 料金IDに一致した料金情報
     */
    @Override
    public Optional<Charge> findById(int chargeId) {
        return chargeRepository.findById(chargeId);
    }

    /**
     * 料金を条件検索する
     * 
     * @param chargeSearchCondition 料金検索条件
     * @return 条件に一致した料金情報
     */
    @Override
    public List<Charge> findByConditions(ChargeSearchCondition chargeSearchCondition) {
        return chargeRepository.findByNameLike(
                "%" + chargeSearchCondition.getName() + "%");
    }

    /**
     * 料金を登録する
     *
     * @param charge 登録する料金情報
     * @return 登録した料金情報
     */
    @Override
    public void save(Charge charge) {
        chargeRepository.save(charge);
    }

    /**
     * 料金を更新する
     * 
     * @param charge 更新する料金情報
     * @return 更新した料金情報
     */
    @Override
    public void deleteById(int chargeId) {
        chargeRepository.deleteById(chargeId);
    }
}
