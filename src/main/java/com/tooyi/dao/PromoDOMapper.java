package com.tooyi.dao;

import com.tooyi.dataobject.PromoDO;

public interface PromoDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Sun Jun 07 12:16:48 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Sun Jun 07 12:16:48 CST 2020
     */
    int insert(PromoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Sun Jun 07 12:16:48 CST 2020
     */
    int insertSelective(PromoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Sun Jun 07 12:16:48 CST 2020
     */
    PromoDO selectByPrimaryKey(Integer id);

    PromoDO selectByItemId(Integer id);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Sun Jun 07 12:16:48 CST 2020
     */
    int updateByPrimaryKeySelective(PromoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Sun Jun 07 12:16:48 CST 2020
     */
    int updateByPrimaryKey(PromoDO record);
}