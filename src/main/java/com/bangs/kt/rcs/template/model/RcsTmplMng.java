package com.bangs.kt.rcs.template.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class RcsTmplMng {
    
    // RCS승인템플릿 정보 테이블
    
    @Id
    private Long seq;
    @Column(length = 100, nullable = false)
    private String brandId;
    @Column(length = 40)
    private String messagebaseId;
    @Column(length = 40)
    private String messagebaseFormId;
    @Column(length = 40)
    private String agencyId;
    @Column(length = 10)
    private String messagebaseType;
    @Column(length = 100, nullable = false)
    private String templateName;
    @Column(length = 25, nullable = false)
    private String templateId;
    @Column(length = 4000, nullable = false)
    private String formParam;
    @Column(length = 4000)
    private String buttonInfo;
    @Column(length = 20)
    private String status;
    @Column(length = 20)
    private String approvalResult;
    @Column(length = 300)
    private String approvalReason;
    @Column(length = 14)
    private String approvalResultDate;
    @Column(length = 14, nullable = false)
    private String registDate;
    @Column(length = 100, nullable = false)
    private String registUserId;
    @Column(length = 100)
    private String updateUserId;
    @Column(length = 14)
    private String updateDate;
    @Column(length = 14)
    private String approvalRequestDate;
    @Column(length = 14)
    private String pollingDate;
    @Column(length = 100)
    private String pollkey;
    @Column(length = 2)
    private String step;
    @Column(length = 8)
    private String approvalCode;

}
