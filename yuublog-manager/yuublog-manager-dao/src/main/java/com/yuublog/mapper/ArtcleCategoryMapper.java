package com.yuublog.mapper;

import org.apache.ibatis.annotations.Param;

public interface ArtcleCategoryMapper {
    int countByExample(ArtcleCategoryExample example);

    int deleteByExample(ArtcleCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ArtcleCategory record);

    int insertSelective(ArtcleCategory record);

    List<ArtcleCategory> selectByExample(ArtcleCategoryExample example);

    ArtcleCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ArtcleCategory record, @Param("example") ArtcleCategoryExample example);

    int updateByExample(@Param("record") ArtcleCategory record, @Param("example") ArtcleCategoryExample example);

    int updateByPrimaryKeySelective(ArtcleCategory record);

    int updateByPrimaryKey(ArtcleCategory record);
}