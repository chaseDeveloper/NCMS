package kr.co.chase.ncms.common;

/**
 * 홈페이지 시스템에서 사용하는 상수를 정의하는 클래스
 * @author jhg
 */
public class ConstantObject {
	/**
	 * 사용자 로그인 세션변수
	 */
	public static final String LOGIN_SESSEION_INFO = "Usr_Session_Info";

	public static final String Y = "Y";
	public static final String N = "N";

	public static final String defaultRowSize = "10";
	public static final String defaultPageSize = "10";

	/**
	 * 회원 등록 상태값
	 */
	public static final String defaultMemStsCd = "RG";		// 등록
	public static final String rlMemStsCd = "RL";			// 퇴록
	public static final String rrMemStsCd = "RR";			// 재등록
	public static final String etMemStsCd = "ET";			// 미등록

	public static final String adminRoleCd = "90";			// 관리자코드
}