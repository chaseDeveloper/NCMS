package kr.co.chase.ncms.individual.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.co.chase.ncms.common.ConstantObject;
import kr.co.chase.ncms.dao.CslAssDao;
import kr.co.chase.ncms.dao.CslAssEvlDao;
import kr.co.chase.ncms.dao.CslIdvDao;
import kr.co.chase.ncms.dao.CslIspDao;
import kr.co.chase.ncms.individual.service.IndividualService;

@Service("individualService")
public class IndividualServiceImpl extends EgovAbstractServiceImpl implements IndividualService{
	private static final Logger LOGGER = LoggerFactory.getLogger(IndividualServiceImpl.class);

	@Resource(name="cslIdvDao")
	private CslIdvDao cslIdvDao;

	@Resource(name="cslIspDao")
	private CslIspDao cslIspDao;

	@Resource(name="cslAssDao")
	private CslAssDao cslAssDao;

	@Resource(name="cslAssEvlDao")
	private CslAssEvlDao cslAssEvlDao;

	/**
	 * 회원별 집중상담 이력 조회
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public List<HashMap<String, Object>> getCslIdvList(HashMap<String, Object> map) throws Exception{
		return cslIdvDao.getCslIdvList(map);
	}

	/**
	 * 집중 상담 내용을 조회 한다
	 * @param cslNo
	 * @return
	 * @throws Exception
	 */
	public HashMap<String, Object> getCslIdv(String cslNo) throws Exception{
		return cslIdvDao.getCslIdv(cslNo);
	}

	/**
	 * 집중 상담이력을 등록 한다.
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int insertCslIdv(HashMap<String, Object> map) throws Exception{
		return cslIdvDao.insertCslIdv(map);
	}

	/**
	 * 집중 상담 이력 수정
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int updateCslIdv(HashMap<String, Object> map) throws Exception{
		return cslIdvDao.updateCslIdv(map);
	}

	/**
	 * 집중 상담 번호 생성
	 * @return
	 * @throws Exception
	 */
	public String getCslIdvSeq() throws Exception{
		return cslIdvDao.getCslIdvSeq();
	}

	/**
	 * 집중 상담 내용 저장 처리
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public HashMap<String, Object> cslIdvAdd(HashMap<String, Object> map) throws Exception{
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		String cslNo = StringUtils.defaultIfEmpty(map.get("cslNo").toString(), "");

		if("".equals(cslNo)){
			map.put("cslNo", this.getCslIdvSeq());

			int result = this.insertCslIdv(map);
			if(result > 0){
				resultMap.put("err", "N");
				resultMap.put("MSG", "집중 상담 등록 완료");
			}else{
				resultMap.put("err", "Y");
				resultMap.put("MSG", "집중 상담 등록 실패");
			}
		}else{
			int result = this.updateCslIdv(map);
			if(result > 0){
				resultMap.put("err", "N");
				resultMap.put("MSG", "집중 상담 수정 완료");
			}else{
				resultMap.put("err", "Y");
				resultMap.put("MSG", "집중 상담 수정 실패");
			}
		}

		return resultMap;
	}

	/**
	 * 집중 상담 내용 삭제
	 * @param clsNo
	 * @return
	 * @throws Exception
	 */
	public int deleteCslIdv(String clsNo) throws Exception{
		return cslIdvDao.deleteCslIdv(clsNo);
	}

	/**
	 * ISP 수립 목록 조회
	 * @param mbrNo
	 * @return
	 * @throws Exception
	 */
	public List<HashMap<String, Object>> getCslIspList(String mbrNo) throws Exception{
		return cslIspDao.getCslIspList(mbrNo);
	}

	/**
	 * ISP 수립 상세 내용 조회
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public HashMap<String, Object> getCslIspInfo(HashMap<String, Object> map) throws Exception{
		return cslIspDao.getCslIspInfo(map);
	}

	/**
	 * ISP 수립 삭제
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int deleteCslIsp(HashMap<String, Object> map) throws Exception{
		return cslIspDao.deleteCslIsp(map);
	}

	/**
	 * ISP 수립 등록
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int insertCslIsp(HashMap<String, Object> map) throws Exception{
		return cslIspDao.insertCslIsp(map);
	}

	/**
	 * ISP 수립 수정
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int updateCslIsp(HashMap<String, Object> map) throws Exception{
		return cslIspDao.updateCslIsp(map);
	}

	/**
	 * ISP 수립 등록/수정 처리
	 * @param reqMap
	 * @return
	 * @throws Exception
	 */
	public HashMap<String, Object> cslIspAdd(HashMap<String, Object> map) throws Exception{
		HashMap<String, Object> resultMap = new HashMap<String, Object>();

		String newFlag = StringUtils.defaultIfEmpty(map.get("newFlag").toString(), ConstantObject.N);

		HashMap<String, Object> ispInfo = this.getCslIspInfo(map);

		if(ConstantObject.Y.equals(newFlag)) {					// 신규 등록
			if(ispInfo != null && StringUtils.defaultIfEmpty(ispInfo.get("ISP_DT").toString(), "") != "") {
				resultMap.put("err", "Y");
				resultMap.put("MSG", "이미 저장된 ISP 수립일자와 회원정보가 존재합니다.");
			}else{
				int result = this.insertCslIsp(map);
				if(result > 0) {
					resultMap.put("err", "N");
					resultMap.put("MSG", "ISP 수립 등록 완료");
				}else{
					resultMap.put("err", "Y");
					resultMap.put("MSG", "ISP 수립 등록 실패");
				}
			}
		}else{
			if(ispInfo != null && StringUtils.defaultIfEmpty(ispInfo.get("ISP_DT").toString(), "").equals(StringUtils.defaultIfEmpty(map.get("ispDt").toString(), ""))) {
				int result = this.updateCslIsp(map);
				if(result > 0) {
					resultMap.put("err", "N");
					resultMap.put("MSG", "ISP 수립 수정 완료");
				}else{
					resultMap.put("err", "Y");
					resultMap.put("MSG", "ISP 수립 수정 실패");
				}
			}else{
				resultMap.put("err", "Y");
				resultMap.put("MSG", " 일치하는 저장된 ISP 수립일자와 회원정보가 존재하지 않습니다.");
			}
		}

		return resultMap;
	}

	/**
	 * 사정평가 내용 조회
	 * @param mbrNo
	 * @return
	 * @throws Excepton
	 */
	public HashMap<String, Object> getCslAssInfo(String mbrNo) throws Exception{
		return cslAssDao.getCslAssInfo(mbrNo);
	}

	/**
	 * 사정평가 내용 등록
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int insertCslAss(HashMap<String, Object> map) throws Exception{
		return cslAssDao.insertCslAss(map);
	}

	/**
	 * 사정평가 내용 수정
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int updateCslAss(HashMap<String, Object> map) throws Exception{
		return cslAssDao.updateCslAss(map);
	}

	/**
	 * 사정 평가 평가도구 상세 조회
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public HashMap<String, Object> getCslAssEvlInfo(HashMap<String, Object> map) throws Exception{
		return cslAssEvlDao.getCslAssEvlInfo(map);
	}

	/**
	 * 사정 평가 평가도구 목록 조회
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public List<HashMap<String, Object>> getCslAssEvlList(String mbrNo) throws Exception{
		return cslAssEvlDao.getCslAssEvlList(mbrNo);
	}

	/**
	 * 사정 평가 평가도구 시퀀스 조회
	 * @param mbrNo
	 * @return
	 * @throws Exception
	 */
	public String getEvlSqeNext(String mbrNo) throws Exception{
		return cslAssEvlDao.getEvlSqeNext(mbrNo);
	}

	/**
	 * 사정 평가 평가도구 등록
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int insertCslAssEvl(HashMap<String, Object> map) throws Exception{
		return cslAssEvlDao.insertCslAssEvl(map);
	}

	/**
	 * 사정 평가 평가도구 삭제
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int deleteCslAssEvl(HashMap<String, Object> map) throws Exception{
		return cslAssEvlDao.deleteCslAssEvl(map);
	}

	/**
	 * 사정 평가 내용 조회
	 * @param mbrNo
	 * @return
	 * @throws Exception
	 */
	public HashMap<String, Object> getCslAssInfoView(String mbrNo) throws Exception{
		HashMap<String, Object> resultMap = new HashMap<String, Object>();

		resultMap.put("cslAssInfo", this.getCslAssInfo(mbrNo));
		resultMap.put("cslAssEvlList", this.getCslAssEvlList(mbrNo));

		return resultMap;
	}
}