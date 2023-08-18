package com.macro.mall.tiny.mbg.mapper;

import com.macro.mall.tiny.mbg.model.UmsRole;
import com.macro.mall.tiny.mbg.model.UmsRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbg.generated Fri Aug 18 10:19:39 CST 2023
     */
    long countByExample(UmsRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbg.generated Fri Aug 18 10:19:39 CST 2023
     */
    int deleteByExample(UmsRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbg.generated Fri Aug 18 10:19:39 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbg.generated Fri Aug 18 10:19:39 CST 2023
     */
    int insert(UmsRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbg.generated Fri Aug 18 10:19:39 CST 2023
     */
    int insertSelective(UmsRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbg.generated Fri Aug 18 10:19:39 CST 2023
     */
    List<UmsRole> selectByExample(UmsRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbg.generated Fri Aug 18 10:19:39 CST 2023
     */
    UmsRole selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbg.generated Fri Aug 18 10:19:39 CST 2023
     */
    int updateByExampleSelective(@Param("record") UmsRole record, @Param("example") UmsRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbg.generated Fri Aug 18 10:19:39 CST 2023
     */
    int updateByExample(@Param("record") UmsRole record, @Param("example") UmsRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbg.generated Fri Aug 18 10:19:39 CST 2023
     */
    int updateByPrimaryKeySelective(UmsRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbg.generated Fri Aug 18 10:19:39 CST 2023
     */
    int updateByPrimaryKey(UmsRole record);
}