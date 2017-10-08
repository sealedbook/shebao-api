package net.vicp.sealedbook.dao.auto.mapper;

import java.util.List;
import net.vicp.sealedbook.dao.auto.criteria.SystemModuleFunctionMapperExample;
import net.vicp.sealedbook.dao.auto.model.SystemModuleFunctionMapperMo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemModuleFunctionMapperMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_security_mf_map
     *
     * @mbggenerated
     */
    int countByExample(SystemModuleFunctionMapperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_security_mf_map
     *
     * @mbggenerated
     */
    int deleteByExample(SystemModuleFunctionMapperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_security_mf_map
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_security_mf_map
     *
     * @mbggenerated
     */
    int insert(SystemModuleFunctionMapperMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_security_mf_map
     *
     * @mbggenerated
     */
    int insertBatch(List<SystemModuleFunctionMapperMo> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_security_mf_map
     *
     * @mbggenerated
     */
    int insertSelective(SystemModuleFunctionMapperMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_security_mf_map
     *
     * @mbggenerated
     */
    List<SystemModuleFunctionMapperMo> selectByExample(SystemModuleFunctionMapperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_security_mf_map
     *
     * @mbggenerated
     */
    SystemModuleFunctionMapperMo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_security_mf_map
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SystemModuleFunctionMapperMo record, @Param("example") SystemModuleFunctionMapperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_security_mf_map
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SystemModuleFunctionMapperMo record, @Param("example") SystemModuleFunctionMapperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_security_mf_map
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SystemModuleFunctionMapperMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_security_mf_map
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SystemModuleFunctionMapperMo record);
}