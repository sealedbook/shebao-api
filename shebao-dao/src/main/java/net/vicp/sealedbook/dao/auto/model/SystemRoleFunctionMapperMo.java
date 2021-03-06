package net.vicp.sealedbook.dao.auto.model;

import net.vicp.sealedbook.common.utils.BaseEntity;

public class SystemRoleFunctionMapperMo extends BaseEntity {
    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private Integer roleId;

    /**
     * 
     */
    private Integer functionId;

    /**
     * @return the value of sys_security_rf_map.id
     * 
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the value for sys_security_rf_map.id
     * 
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * @return the value of sys_security_rf_map.role_id
     * 
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * @param roleId the value for sys_security_rf_map.role_id
     * 
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * @return the value of sys_security_rf_map.function_id
     * 
     */
    public Integer getFunctionId() {
        return functionId;
    }

    /**
     * @param functionId the value for sys_security_rf_map.function_id
     * 
     */
    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_security_rf_map
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
        SystemRoleFunctionMapperMo other = (SystemRoleFunctionMapperMo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getFunctionId() == null ? other.getFunctionId() == null : this.getFunctionId().equals(other.getFunctionId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_security_rf_map
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getFunctionId() == null) ? 0 : getFunctionId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_security_rf_map
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
        sb.append(", roleId=").append(roleId);
        sb.append(", functionId=").append(functionId);
        sb.append("]");
        return sb.toString();
    }
}