package net.vicp.sealedbook.dao.auto.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoticeReceiveExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table notice_receive
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table notice_receive
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table notice_receive
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice_receive
     *
     * @mbggenerated
     */
    public NoticeReceiveExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice_receive
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice_receive
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice_receive
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice_receive
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice_receive
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice_receive
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice_receive
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice_receive
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice_receive
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notice_receive
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table notice_receive
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNoticeIdIsNull() {
            addCriterion("notice_id is null");
            return (Criteria) this;
        }

        public Criteria andNoticeIdIsNotNull() {
            addCriterion("notice_id is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeIdEqualTo(Integer value) {
            addCriterion("notice_id =", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotEqualTo(Integer value) {
            addCriterion("notice_id <>", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdGreaterThan(Integer value) {
            addCriterion("notice_id >", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("notice_id >=", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdLessThan(Integer value) {
            addCriterion("notice_id <", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdLessThanOrEqualTo(Integer value) {
            addCriterion("notice_id <=", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdIn(List<Integer> values) {
            addCriterion("notice_id in", values, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotIn(List<Integer> values) {
            addCriterion("notice_id not in", values, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdBetween(Integer value1, Integer value2) {
            addCriterion("notice_id between", value1, value2, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("notice_id not between", value1, value2, "noticeId");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdIsNull() {
            addCriterion("receive_user_id is null");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdIsNotNull() {
            addCriterion("receive_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdEqualTo(Integer value) {
            addCriterion("receive_user_id =", value, "receiveUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdNotEqualTo(Integer value) {
            addCriterion("receive_user_id <>", value, "receiveUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdGreaterThan(Integer value) {
            addCriterion("receive_user_id >", value, "receiveUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive_user_id >=", value, "receiveUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdLessThan(Integer value) {
            addCriterion("receive_user_id <", value, "receiveUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("receive_user_id <=", value, "receiveUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdIn(List<Integer> values) {
            addCriterion("receive_user_id in", values, "receiveUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdNotIn(List<Integer> values) {
            addCriterion("receive_user_id not in", values, "receiveUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdBetween(Integer value1, Integer value2) {
            addCriterion("receive_user_id between", value1, value2, "receiveUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("receive_user_id not between", value1, value2, "receiveUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeIsNull() {
            addCriterion("receive_date_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeIsNotNull() {
            addCriterion("receive_date_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeEqualTo(Date value) {
            addCriterion("receive_date_time =", value, "receiveDateTime");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeNotEqualTo(Date value) {
            addCriterion("receive_date_time <>", value, "receiveDateTime");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeGreaterThan(Date value) {
            addCriterion("receive_date_time >", value, "receiveDateTime");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receive_date_time >=", value, "receiveDateTime");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeLessThan(Date value) {
            addCriterion("receive_date_time <", value, "receiveDateTime");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("receive_date_time <=", value, "receiveDateTime");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeIn(List<Date> values) {
            addCriterion("receive_date_time in", values, "receiveDateTime");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeNotIn(List<Date> values) {
            addCriterion("receive_date_time not in", values, "receiveDateTime");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeBetween(Date value1, Date value2) {
            addCriterion("receive_date_time between", value1, value2, "receiveDateTime");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("receive_date_time not between", value1, value2, "receiveDateTime");
            return (Criteria) this;
        }

        public Criteria andReceiveDeviceNumberIsNull() {
            addCriterion("receive_device_number is null");
            return (Criteria) this;
        }

        public Criteria andReceiveDeviceNumberIsNotNull() {
            addCriterion("receive_device_number is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveDeviceNumberEqualTo(String value) {
            addCriterion("receive_device_number =", value, "receiveDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andReceiveDeviceNumberNotEqualTo(String value) {
            addCriterion("receive_device_number <>", value, "receiveDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andReceiveDeviceNumberGreaterThan(String value) {
            addCriterion("receive_device_number >", value, "receiveDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andReceiveDeviceNumberGreaterThanOrEqualTo(String value) {
            addCriterion("receive_device_number >=", value, "receiveDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andReceiveDeviceNumberLessThan(String value) {
            addCriterion("receive_device_number <", value, "receiveDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andReceiveDeviceNumberLessThanOrEqualTo(String value) {
            addCriterion("receive_device_number <=", value, "receiveDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andReceiveDeviceNumberLike(String value) {
            addCriterion("receive_device_number like", value, "receiveDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andReceiveDeviceNumberNotLike(String value) {
            addCriterion("receive_device_number not like", value, "receiveDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andReceiveDeviceNumberIn(List<String> values) {
            addCriterion("receive_device_number in", values, "receiveDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andReceiveDeviceNumberNotIn(List<String> values) {
            addCriterion("receive_device_number not in", values, "receiveDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andReceiveDeviceNumberBetween(String value1, String value2) {
            addCriterion("receive_device_number between", value1, value2, "receiveDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andReceiveDeviceNumberNotBetween(String value1, String value2) {
            addCriterion("receive_device_number not between", value1, value2, "receiveDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andReceiveIpAddressIsNull() {
            addCriterion("receive_ip_address is null");
            return (Criteria) this;
        }

        public Criteria andReceiveIpAddressIsNotNull() {
            addCriterion("receive_ip_address is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveIpAddressEqualTo(String value) {
            addCriterion("receive_ip_address =", value, "receiveIpAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveIpAddressNotEqualTo(String value) {
            addCriterion("receive_ip_address <>", value, "receiveIpAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveIpAddressGreaterThan(String value) {
            addCriterion("receive_ip_address >", value, "receiveIpAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("receive_ip_address >=", value, "receiveIpAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveIpAddressLessThan(String value) {
            addCriterion("receive_ip_address <", value, "receiveIpAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveIpAddressLessThanOrEqualTo(String value) {
            addCriterion("receive_ip_address <=", value, "receiveIpAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveIpAddressLike(String value) {
            addCriterion("receive_ip_address like", value, "receiveIpAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveIpAddressNotLike(String value) {
            addCriterion("receive_ip_address not like", value, "receiveIpAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveIpAddressIn(List<String> values) {
            addCriterion("receive_ip_address in", values, "receiveIpAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveIpAddressNotIn(List<String> values) {
            addCriterion("receive_ip_address not in", values, "receiveIpAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveIpAddressBetween(String value1, String value2) {
            addCriterion("receive_ip_address between", value1, value2, "receiveIpAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveIpAddressNotBetween(String value1, String value2) {
            addCriterion("receive_ip_address not between", value1, value2, "receiveIpAddress");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table notice_receive
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table notice_receive
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}