package net.vicp.sealedbook.dao.auto.model;

import net.vicp.sealedbook.common.utils.BaseEntity;

public class SystemRoleMo extends BaseEntity {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String roleName;

    /**
     * 
     */
    private Integer orderFlag;

    /**
     * @return the value of sys_security_role.id
     * 
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the value for sys_security_role.id
     * 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the value of sys_security_role.role_name
     * 
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName the value for sys_security_role.role_name
     * 
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * @return the value of sys_security_role.order_flag
     * 
     */
    public Integer getOrderFlag() {
        return orderFlag;
    }

    /**
     * @param orderFlag the value for sys_security_role.order_flag
     * 
     */
    public void setOrderFlag(Integer orderFlag) {
        this.orderFlag = orderFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_security_role
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
        SystemRoleMo other = (SystemRoleMo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRoleName() == null ? other.getRoleName() == null : this.getRoleName().equals(other.getRoleName()))
            && (this.getOrderFlag() == null ? other.getOrderFlag() == null : this.getOrderFlag().equals(other.getOrderFlag()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_security_role
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        result = prime * result + ((getOrderFlag() == null) ? 0 : getOrderFlag().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_security_role
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
        sb.append(", roleName=").append(roleName);
        sb.append(", orderFlag=").append(orderFlag);
        sb.append("]");
        return sb.toString();
    }
}