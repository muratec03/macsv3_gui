package net.muratec.mcs.mapper;

import java.util.List;
import net.muratec.mcs.model.Stocker;
import net.muratec.mcs.model.StockerExample;
import org.apache.ibatis.annotations.Param;

public interface StockerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STOCKER
     *
     * @mbg.generated
     */
    long countByExample(StockerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STOCKER
     *
     * @mbg.generated
     */
    int deleteByExample(StockerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STOCKER
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer tscId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STOCKER
     *
     * @mbg.generated
     */
    int insert(Stocker record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STOCKER
     *
     * @mbg.generated
     */
    int insertSelective(Stocker record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STOCKER
     *
     * @mbg.generated
     */
    List<Stocker> selectByExample(StockerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STOCKER
     *
     * @mbg.generated
     */
    Stocker selectByPrimaryKey(Integer tscId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STOCKER
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Stocker record, @Param("example") StockerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STOCKER
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Stocker record, @Param("example") StockerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STOCKER
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Stocker record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STOCKER
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Stocker record);
}