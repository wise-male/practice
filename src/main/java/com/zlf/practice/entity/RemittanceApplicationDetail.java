package com.zlf.practice.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Data
public class RemittanceApplicationDetail {

	private Long id;

	/**
	 * 放款申请明细uuid
	 */
	private String remittanceApplicationDetailUuid;
	/**
	 * 放款申请uuid
	 */
	private String remittanceApplicationUuid;

	/**
	 * 信托合同uuid
	 */
	private String financialContractUuid;

	/**
	 * 信托合同Id
	 */
	private Long financialContractId;

	/**
	 * 业务记录号
	 */
	private String businessRecordNo;

	/**
	 * 优先级
	 */
	private int priorityLevel;

	/**
	 * 恒生银行编码
	 */
	private String cpBankCode;
	/**
	 * 交易对手方银行卡号
	 */
	private String cpBankCardNo;
	/**
	 * 交易对手方银行卡持有人
	 */
	private String cpBankAccountHolder;

	/**
	 * 交易对手方证件号
	 */
	private String cpIdNumber;

	/**
	 * 交易对手方开户行所在省
	 */
	private String cpBankProvince;

	/**
	 * 交易对手方开户行所在市
	 */
	private String cpBankCity;
	
	/**
	 * 交易对手方开户行名称
	 */
	private String cpBankName;

	/**
	 * 计划支付时间
	 */
	private Date plannedPaymentDate;
	/**
	 * 实际支付完成时间
	 */
	private Date completePaymentDate;

	/**
	 * 计划交易总金额
	 */
	private BigDecimal plannedTotalAmount;
	/**
	 * 实际交易总金额
	 */
	private BigDecimal actualTotalAmount;
	
	/**
	 * 执行备注
	 */
	private String executionRemark;
	
	private Date createTime;

	private String creatorName;

	private Date lastModifiedTime;

	/**
	 * RemittancePlan总个数
	 */
	private int totalCount;

	/**
	 * RemittancePlan实际完成个数
	 */
	private int actualCount;

	/**
	 * 版本锁
	 */
	private String versionLock;

	private Integer intField1;

	private Integer intField2;

	private Integer intField3;

	private String stringField1;

	private String stringField2;

	private String stringField3;

	private BigDecimal decimalField1;

	private BigDecimal decimalField2;

	private BigDecimal decimalField3;
}
