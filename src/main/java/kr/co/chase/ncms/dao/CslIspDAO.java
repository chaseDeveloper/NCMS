package kr.co.chase.ncms.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository("cslIspDao")
public class CslIspDAO extends EgovAbstractMapper {
	/**
	 * ISP 수립 목록 조회
	 * @param map
	 * @return
	 * @throws SQLException
	 */
	public List<HashMap<String, Object>> getCslIspList(String mbrNo) throws SQLException{
		return selectList("cslIsp.getCslIspList", mbrNo);
	}

	/**
	 * ISP 수립 상세 내용 조회
	 * @param map
	 * @return
	 * @throws SQLException
	 */
	public HashMap<String, Object> getCslIspInfo(HashMap<String, Object> map) throws SQLException{
		return selectOne("cslIsp.getCslIspInfo", map);
	}

	/**
	 * ISP 수립 삭제
	 * @param map
	 * @return
	 * @throws SQLException
	 */
	public int deleteCslIsp(HashMap<String, Object> map) throws SQLException{
		return delete("cslIsp.deleteCslIsp", map);
	}
}