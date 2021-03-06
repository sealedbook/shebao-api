package net.vicp.sealedbook.dao.auto.model;

import java.util.Date;
import net.vicp.sealedbook.common.enums.YesNoEnum;
import net.vicp.sealedbook.common.utils.BaseEntity;

public class NoticeInfoMo extends BaseEntity {
    /**
     * 
     */
    private Integer id;

    /**
     * 通知内容
     */
    private String content;

    /**
     * 提交时间
     */
    private Date submitDateTime;

    /**
     * 提交用户ID
     */
    private Integer submitUserId;

    /**
     * 提交IP地址
     */
    private String submitIpaddress;

    /**
     * 是否删除
     */
    private YesNoEnum isDeleted;

    /**
     * @return the value of notice_info.id
     * 
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the value for notice_info.id
     * 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the value of notice_info.content
     * 通知内容
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the value for notice_info.content
     * 通知内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * @return the value of notice_info.submit_date_time
     * 提交时间
     */
    public Date getSubmitDateTime() {
        return submitDateTime;
    }

    /**
     * @param submitDateTime the value for notice_info.submit_date_time
     * 提交时间
     */
    public void setSubmitDateTime(Date submitDateTime) {
        this.submitDateTime = submitDateTime;
    }

    /**
     * @return the value of notice_info.submit_user_id
     * 提交用户ID
     */
    public Integer getSubmitUserId() {
        return submitUserId;
    }

    /**
     * @param submitUserId the value for notice_info.submit_user_id
     * 提交用户ID
     */
    public void setSubmitUserId(Integer submitUserId) {
        this.submitUserId = submitUserId;
    }

    /**
     * @return the value of notice_info.submit_ipaddress
     * 提交IP地址
     */
    public String getSubmitIpaddress() {
        return submitIpaddress;
    }

    /**
     * @param submitIpaddress the value for notice_info.submit_ipaddress
     * 提交IP地址
     */
    public void setSubmitIpaddress(String submitIpaddress) {
        this.submitIpaddress = submitIpaddress == null ? null : submitIpaddress.trim();
    }

    /**
     * @return the value of notice_info.is_deleted
     * 是否删除
     */
    public YesNoEnum getIsDeleted() {
        return isDeleted;
    }

    /**
     * @param isDeleted the value for notice_info.is_deleted
     * 是否删除
     */
    public void setIsDeleted(YesNoEnum isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice_info
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        NoticeInfoMo other = (NoticeInfoMo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getSubmitDateTime() == null ? other.getSubmitDateTime() == null : this.getSubmitDateTime().equals(other.getSubmitDateTime()))
            && (this.getSubmitUserId() == null ? other.getSubmitUserId() == null : this.getSubmitUserId().equals(other.getSubmitUserId()))
            && (this.getSubmitIpaddress() == null ? other.getSubmitIpaddress() == null : this.getSubmitIpaddress().equals(other.getSubmitIpaddress()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice_info
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getSubmitDateTime() == null) ? 0 : getSubmitDateTime().hashCode());
        result = prime * result + ((getSubmitUserId() == null) ? 0 : getSubmitUserId().hashCode());
        result = prime * result + ((getSubmitIpaddress() == null) ? 0 : getSubmitIpaddress().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice_info
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", content=").append(content);
        sb.append(", submitDateTime=").append(submitDateTime);
        sb.append(", submitUserId=").append(submitUserId);
        sb.append(", submitIpaddress=").append(submitIpaddress);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append("]");
        return sb.toString();
    }
}