package com.yuublog.mapper;

import com.yuublog.pojo.Artcle;
import com.yuublog.pojo.ArtcleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArtcleMapper {
    int countByExample(ArtcleExample example);

    int deleteByExample(ArtcleExample example);

    int deleteByPrimaryKey(Integer artId);

    int insert(Artcle record);

    int insertSelective(Artcle record);

    List<Artcle> selectByExample(ArtcleExample example);

    Artcle selectByPrimaryKey(Integer artId);

    int updateByExampleSelective(@Param("record") Artcle record, @Param("example") ArtcleExample example);

    int updateByExample(@Param("record") Artcle record, @Param("example") ArtcleExample example);

    int updateByPrimaryKeySelective(Artcle record);

    int updateByPrimaryKey(Artcle record);
}