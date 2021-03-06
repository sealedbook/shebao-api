package net.vicp.sealedbook.dao.auto.mapper;

import java.util.List;
import net.vicp.sealedbook.dao.auto.criteria.OldPersonExample;
import net.vicp.sealedbook.dao.auto.model.OldPersonMo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OldPersonMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table old_person
     *
     * @mbggenerated
     */
    int countByExample(OldPersonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table old_person
     *
     * @mbggenerated
     */
    int deleteByExample(OldPersonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table old_person
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table old_person
     *
     * @mbggenerated
     */
    int insert(OldPersonMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table old_person
     *
     * @mbggenerated
     */
    int insertBatch(List<OldPersonMo> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table old_person
     *
     * @mbggenerated
     */
    int insertSelective(OldPersonMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table old_person
     *
     * @mbggenerated
     */
    List<OldPersonMo> selectByExample(OldPersonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table old_person
     *
     * @mbggenerated
     */
    OldPersonMo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table old_person
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") OldPersonMo record, @Param("example") OldPersonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table old_person
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") OldPersonMo record, @Param("example") OldPersonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table old_person
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(OldPersonMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table old_person
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(OldPersonMo record);
}