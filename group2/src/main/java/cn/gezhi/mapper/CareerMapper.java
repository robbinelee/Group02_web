package cn.gezhi.mapper;

import cn.gezhi.po.Career;
import cn.gezhi.po.CareerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CareerMapper {
    int countByExample(CareerExample example);

    int deleteByExample(CareerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Career record);

    int insertSelective(Career record);

    List<Career> selectByExample(CareerExample example);

    Career selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Career record, @Param("example") CareerExample example);

    int updateByExample(@Param("record") Career record, @Param("example") CareerExample example);

    int updateByPrimaryKeySelective(Career record);

    int updateByPrimaryKey(Career record);
}