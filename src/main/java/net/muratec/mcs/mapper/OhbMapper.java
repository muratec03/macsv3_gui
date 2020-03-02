package net.muratec.mcs.mapper;

import java.util.List;
import net.muratec.mcs.model.Ohb;
import net.muratec.mcs.model.OhbExample;
import org.apache.ibatis.annotations.Param;

public interface OhbMapper {
    int countByExample(OhbExample example);

    int deleteByExample(OhbExample example);

    int deleteByPrimaryKey(String tscId);

    int insert(Ohb record);

    int insertSelective(Ohb record);

    List<Ohb> selectByExample(OhbExample example);

    Ohb selectByPrimaryKey(String tscId);

    int updateByExampleSelective(@Param("record") Ohb record, @Param("example") OhbExample example);

    int updateByExample(@Param("record") Ohb record, @Param("example") OhbExample example);

    int updateByPrimaryKeySelective(Ohb record);

    int updateByPrimaryKey(Ohb record);
}