package com.farata.course.mwd.auction.dao;

import com.farata.course.mwd.auction.model.Product;
import org.apache.ibatis.annotations.Select;

/**
 * TODO
 *
 * @author Viktor Gamov (viktor.gamov@faratasystems.com)
 * @since 4/20/14
 */
public interface MyProductMapper {

    @Select({
        "SELECT * FROM PRODUCT"
    })
    Product getProductById(Integer id);
}
