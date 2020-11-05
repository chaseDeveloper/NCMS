package kr.co.chase.ncms.vo;

import java.io.Serializable;
import java.sql.Timestamp;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 집중상담
 * @author Molra
 */
public class CslIdvVO implements Serializable {
	private static final long serialVersionUID = -858838578081269358L;

	private String mbrNo;						// 회원정보 번호(ex:M20272772504833)
	private String cslNo;						// 상담번호
	private String cslId;						// 상담자ID
	private String cslNm;						// 상담자명
	private String cslDt;						// 상담 일자
	private String cslFmTm;						// 상담 시작시간
	private String cslToTm;						// 상담 종료시간
	private int cslTermTm;						// 상당 소요시간
	private String pgmCd;						// 프로그램
	private String cslTgtCd;					// 상담대상
	private String cslTpCd;						// 상담유형
	private String rskaTpCd;					// 위기분류척도 Rating A: 위험성
	private String rskbTpCd;					// 위기분류척도 Rating B: 지지체계
	private String rskcTpCd;					// 위기분류척도 Rating C: 협조능력
	private int rskSco;							// 위기분류척도 점수
	private String cslSbj;						// 상담주제
	private String cslTgt;						// 상담목표
	private String cslCtnt;						// 상담내용
	private String nxtCslDt;					// 다음 상담날짜
	private String nxtCslTm;					// 다음 상담시간
	private String nxtCslCtnt;					// 다음 상담내용
	private String creId;						// 생성자
	private Timestamp creDt;					// 생성일자
	private String updId;						// 수정자
	private Timestamp updDt;					// 수정일자

	/**
	 * 회원정보 번호(ex:M20272772504833)
	 * @return
	 */
	public String getMbrNo() {
		return mbrNo;
	}
	/**
	 * 회원정보 번호(ex:M20272772504833)
	 * @param mbrNo
	 */
	public void setMbrNo(String mbrNo) {
		this.mbrNo = mbrNo;
	}
	/**
	 * 상담번호
	 * @return
	 */
	public String getCslNo() {
		return cslNo;
	}
	/**
	 * 상담번호
	 * @param cslNo
	 */
	public void setCslNo(String cslNo) {
		this.cslNo = cslNo;
	}
	/**
	 * 상담자ID
	 * @return
	 */
	public String getCslId() {
		return cslId;
	}
	/**
	 * 상담자ID
	 * @param cslId
	 */
	public void setCslId(String cslId) {
		this.cslId = cslId;
	}
	/**
	 * 상담자명
	 * @return
	 */
	public String getCslNm() {
		return cslNm;
	}
	/**
	 * 상담자명
	 * @param cslNm
	 */
	public void setCslNm(String cslNm) {
		this.cslNm = cslNm;
	}
	/**
	 * 상담 일자
	 * @return
	 */
	public String getCslDt() {
		return cslDt;
	}
	/**
	 * 상담 일자
	 * @param cslDt
	 */
	public void setCslDt(String cslDt) {
		this.cslDt = cslDt;
	}
	/**
	 * 상담 시작시간
	 * @return
	 */
	public String getCslFmTm() {
		return cslFmTm;
	}
	/**
	 * 상담 시작시간
	 * @param cslFmTm
	 */
	public void setCslFmTm(String cslFmTm) {
		this.cslFmTm = cslFmTm;
	}
	/**
	 * 상담 종료시간
	 * @return
	 */
	public String getCslToTm() {
		return cslToTm;
	}
	/**
	 * 상담 종료시간
	 * @param cslToTm
	 */
	public void setCslToTm(String cslToTm) {
		this.cslToTm = cslToTm;
	}
	/**
	 * 상당 소요시간
	 * @return
	 */
	public int getCslTermTm() {
		return cslTermTm;
	}
	/**
	 * 상당 소요시간
	 * @param cslTermTm
	 */
	public void setCslTermTm(int cslTermTm) {
		this.cslTermTm = cslTermTm;
	}
	/**
	 * 프로그램
	 * @return
	 */
	public String getPgmCd() {
		return pgmCd;
	}
	/**
	 * 프로그램
	 * @param pgmCd
	 */
	public void setPgmCd(String pgmCd) {
		this.pgmCd = pgmCd;
	}
	/**
	 * 상담대상
	 * @return
	 */
	public String getCslTgtCd() {
		return cslTgtCd;
	}
	/**
	 * 상담대상
	 * @param cslTgtCd
	 */
	public void setCslTgtCd(String cslTgtCd) {
		this.cslTgtCd = cslTgtCd;
	}
	/**
	 * 상담유형
	 * @return
	 */
	public String getCslTpCd() {
		return cslTpCd;
	}
	/**
	 * 상담유형
	 * @param cslTpCd
	 */
	public void setCslTpCd(String cslTpCd) {
		this.cslTpCd = cslTpCd;
	}
	/**
	 * 위기분류척도 Rating A: 위험성
	 * @return
	 */
	public String getRskaTpCd() {
		return rskaTpCd;
	}
	/**
	 * 위기분류척도 Rating A: 위험성
	 * @param rskaTpCd
	 */
	public void setRskaTpCd(String rskaTpCd) {
		this.rskaTpCd = rskaTpCd;
	}
	/**
	 * 위기분류척도 Rating B: 지지체계
	 * @return
	 */
	public String getRskbTpCd() {
		return rskbTpCd;
	}
	/**
	 * 위기분류척도 Rating B: 지지체계
	 * @param rskbTpCd
	 */
	public void setRskbTpCd(String rskbTpCd) {
		this.rskbTpCd = rskbTpCd;
	}
	/**
	 * 위기분류척도 Rating C: 협조능력
	 * @return
	 */
	public String getRskcTpCd() {
		return rskcTpCd;
	}
	/**
	 * 위기분류척도 Rating C: 협조능력
	 * @param rskcTpCd
	 */
	public void setRskcTpCd(String rskcTpCd) {
		this.rskcTpCd = rskcTpCd;
	}
	/**
	 * 위기분류척도 점수
	 * @return
	 */
	public int getRskSco() {
		return rskSco;
	}
	/**
	 * 위기분류척도 점수
	 * @param rskSco
	 */
	public void setRskSco(int rskSco) {
		this.rskSco = rskSco;
	}
	/**
	 * 상담주제
	 * @return
	 */
	public String getCslSbj() {
		return cslSbj;
	}
	/**
	 * 상담주제
	 * @param cslSbj
	 */
	public void setCslSbj(String cslSbj) {
		this.cslSbj = cslSbj;
	}
	/**
	 * 상담목표
	 * @return
	 */
	public String getCslTgt() {
		return cslTgt;
	}
	/**
	 * 상담목표
	 * @param cslTgt
	 */
	public void setCslTgt(String cslTgt) {
		this.cslTgt = cslTgt;
	}
	/**
	 * 상담내용
	 * @return
	 */
	public String getCslCtnt() {
		return cslCtnt;
	}
	/**
	 * 상담내용
	 * @param cslCtnt
	 */
	public void setCslCtnt(String cslCtnt) {
		this.cslCtnt = cslCtnt;
	}
	/**
	 * 다음 상담날짜
	 * @return
	 */
	public String getNxtCslDt() {
		return nxtCslDt;
	}
	/**
	 * 다음 상담날짜
	 * @param nxtCslDt
	 */
	public void setNxtCslDt(String nxtCslDt) {
		this.nxtCslDt = nxtCslDt;
	}
	/**
	 * 다음 상담시간
	 * @return
	 */
	public String getNxtCslTm() {
		return nxtCslTm;
	}
	/**
	 * 다음 상담시간
	 * @param nxtCslTm
	 */
	public void setNxtCslTm(String nxtCslTm) {
		this.nxtCslTm = nxtCslTm;
	}
	/**
	 * 다음 상담내용
	 * @return
	 */
	public String getNxtCslCtnt() {
		return nxtCslCtnt;
	}
	/**
	 * 다음 상담내용
	 * @param nxtCslCtnt
	 */
	public void setNxtCslCtnt(String nxtCslCtnt) {
		this.nxtCslCtnt = nxtCslCtnt;
	}
	/**
	 * 생성자
	 * @return
	 */
	public String getCreId() {
		return creId;
	}
	/**
	 * 생성자
	 * @param creId
	 */
	public void setCreId(String creId) {
		this.creId = creId;
	}
	/**
	 * 생성일자
	 * @return
	 */
	public Timestamp getCreDt() {
		return creDt;
	}
	/**
	 * 생성일자
	 * @param creDt
	 */
	public void setCreDt(Timestamp creDt) {
		this.creDt = creDt;
	}
	/**
	 * 수정자
	 * @return
	 */
	public String getUpdId() {
		return updId;
	}
	/**
	 * 수정자
	 * @param updId
	 */
	public void setUpdId(String updId) {
		this.updId = updId;
	}
	/**
	 * 수정일자
	 * @return
	 */
	public Timestamp getUpdDt() {
		return updDt;
	}
	/**
	 * 수정일자
	 * @param updDt
	 */
	public void setUpdDt(Timestamp updDt) {
		this.updDt = updDt;
	}
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}