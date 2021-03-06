package com.seventh.shop.dao;

import com.seventh.shop.domain.Rules;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author gfc
 * 2018年11月23日 下午 8:28
 */
public interface RulesDao extends JpaRepository<Rules, Integer> {
    List<Rules> findAllByAid(int aid);
}
