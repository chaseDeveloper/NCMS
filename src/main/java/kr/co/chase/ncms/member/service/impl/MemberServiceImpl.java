package kr.co.chase.ncms.member.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.co.chase.ncms.common.ConstantObject;
import kr.co.chase.ncms.counsel.service.CounselService;
import kr.co.chase.ncms.dao.MstMbrDao;
import kr.co.chase.ncms.dao.MstRegHisDao;
import kr.co.chase.ncms.member.service.MemberService;

@Service("memberService")
public class MemberServiceImpl extends EgovAbstractServiceImpl implements MemberService {
	private static final Logger LOGGER = LoggerFactory.getLogger(MemberServiceImpl.class);

	@Resource(name="mstMbrDao")
	private MstMbrDao mstMbrDao;

	@Resource(name="mstRegHisDao")
	private MstRegHisDao mstRegHisDao;

	@Resource(name="counselService")
	private CounselService counselService;

	/**
	 * 회원 정보 조회
	 * @param mbrNo
	 * @return
	 * @throws Exception
	 */
	public HashMap<String, Object> getMstMbr(String mbrNo) throws Exception{
		if("".equals(StringUtils.defaultIfEmpty(mbrNo, ""))) {
			throw new Exception("MemberServiceImpl.getMstMbr mbrNo 필수값 누락");
		}

		return mstMbrDao.getMstMbr(mbrNo);
	}

	/**
	 * 회원 이력 조회
	 * @param mbrNo
	 * @return
	 * @throws Exception
	 */
	public List<HashMap<String, Object>> getMstRegHisList(String mbrNo) throws Exception{
		if("".equals(StringUtils.defaultIfEmpty(mbrNo, ""))) {
			throw new Exception("MemberServiceImpl.getMstRegHisList mbrNo 필수값 누락");
		}

		return mstRegHisDao.getMstRegHisList(mbrNo);
	}

	/**
	 * 회원 번호 생성
	 * @return
	 * @throws Exception
	 */
	public String getMbrNoSeq() throws Exception{
		return mstMbrDao.getMbrNoSeq();
	}

	/**
	 * 회원 정보 등록
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int insertMstMbr(HashMap<String, Object> map) throws Exception{
		if("".equals(StringUtils.defaultIfEmpty((String)map.get("mbrNo"), ""))) {
			throw new Exception("MemberServiceImpl.insertMstMbr mbrNo 필수값 누락");
		}

		return mstMbrDao.insertMstMbr(map);
	}

	/**
	 * 회원 이력 등록
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int insertMstRegHis(HashMap<String, Object> map) throws Exception{
		if("".equals(StringUtils.defaultIfEmpty((String)map.get("mbrNo"), ""))) {
			throw new Exception("MemberServiceImpl.insertMstMbr mbrNo 필수값 누락");
		}
		if("".equals(StringUtils.defaultIfEmpty((String)map.get("regRlsCd"), ""))) {
			throw new Exception("MemberServiceImpl.insertMstMbr regRlsCd 필수값 누락");
		}

		return mstRegHisDao.insertMstRegHis(map);
	}

	/**
	 * 회원 정보 수정
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int updateMstMbr(HashMap<String, Object> map) throws Exception{
		if("".equals(StringUtils.defaultIfEmpty((String)map.get("mbrNo"), ""))) {
			throw new Exception("MemberServiceImpl.updateMstMbr mbrNo 필수값 누락");
		}

		return mstMbrDao.updateMstMbr(map);
	}

	/**
	 * 회원 정보 저장
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public HashMap<String, Object> saveMstMbr(HashMap<String, Object> map) throws Exception{
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		int result = 0;

		String mbrNo = StringUtils.defaultIfEmpty((String)map.get("mbrNo"), "");
		if("".equals(mbrNo)){
			HashMap<String, Object> sechMap = new HashMap<String, Object>();
			sechMap.put("mbrNm", map.get("mbrNm"));
			sechMap.put("juminNo1", map.get("juminNo1"));

			int memCnt = counselService.getMstMbrListCount(sechMap);
			if(memCnt <= 0){
				map.put("mbrNo", this.getMbrNoSeq());
				map.put("stsCd", ConstantObject.defaultMemStsCd);
				result = this.insertMstMbr(map);

				if(result > 0) {
					map.put("regRlsCd", ConstantObject.defaultMemStsCd);
					map.put("dtlCtnt", "최초등록");
					this.insertMstRegHis(map);
				}

				resultMap.put("MSG", "등록");
			}else{
				resultMap.put("err", ConstantObject.Y);
				resultMap.put("MSG", "동일 회원 정보 존재");
			}
		}else{
			result = this.updateMstMbr(map);
			resultMap.put("MSG", "수정");
		}

		if(result <= 0) {
			resultMap.put("err", ConstantObject.Y);
		}

		return resultMap;
	}
}