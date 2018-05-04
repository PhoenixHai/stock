package com.haotu369.mapper;

import com.haotu369.model.stock.StockClassify;
import com.haotu369.model.stock.StockType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : Jian Shen
 * @version : V1.0
 * @date : 2018/5/4
 */
@Repository
public interface StockMapper {

    @Select("SELECT * FROM stock_type")
    public List<StockType> listStockType();

    @Select("SELECT * FROM stock_classify WHERE type = #{type}")
    List<StockClassify> listStockClassify(int type);
}