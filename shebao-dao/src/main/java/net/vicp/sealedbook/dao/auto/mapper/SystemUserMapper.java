package net.vicp.sealedbook.dao.auto.mapper;

import java.util.List;
import net.vicp.sealedbook.dao.auto.criteria.SystemUserExample;
import net.vicp.sealedbook.dao.auto.model.SystemUserMo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_security_user
     *
     * @mbggenerated
     */
    int countByExample(SystemUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_security_user
     *
     * @mbggenerated
     */
    int deleteByExample(SystemUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_security_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_security_user
     *
     * @mbggenerated
     */
    int insert(SystemUserMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_security_user
     *
     * @mbggenerated
     */
    int insertBatch(List<SystemUserMo> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_security_user
     *
     * @mbggenerated
     */
    int insertSelective(SystemUserMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_security_user
     *
     * @mbggenerated
     */
    List<SystemUserMo> selectByExample(SystemUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_security_user
     *
     * @mbggenerated
     */
    SystemUserMo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_security_user
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SystemUserMo record, @Param("example") SystemUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_security_user
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SystemUserMo record, @Param("example") SystemUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_security_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SystemUserMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_security_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SystemUserMo record);
}