<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<script type="text/javaScript" language="javascript" defer="defer">
	$(document).ready(function(){
		<%-- 페이지처리 --%>
		goPage = function(pageNo){
			$("input[name='pgmPageNo']").val(pageNo);
			getWeeklyPrgList();
		},
		<%-- 프로그램정보 상세 보기 --%>
		viewPrgRow = function(PGM_CD, PGM_DT){
			var pgmObj = {
				pgmCd : PGM_CD,
				pgmDt : PGM_DT
			}

			reSetPgmForm(pgmObj);
		}
	});
</script>
<div class="table-box mgt10">
	<div class="el-table_header-wrapper">
		<table>
			<colgroup>
				<col style="width:44px">
				<col style="width:130px">
				<col style="width:95px">
				<col style="width:130px">
				<col style="width:220px">
				<col>
			</colgroup>
			<thead>
			<tr>
				<th>#</th>
				<th>기관명</th>
				<th>실시 일자</th>
				<th>담당자</th>
				<th>주관 프로그램</th>
				<th>참여자수</th>
			</tr>
			</thead>
		</table>
	</div>
	<div class="el-table_body-wrapper" style="height: 630px;">
<c:if test="${totalCount > 0}">
		<table>
			<colgroup>
				<col style="width:44px">
				<col style="width:130px">
				<col style="width:95px">
				<col style="width:130px">
				<col style="width:220px">
				<col>
			</colgroup>
			<tbody>
	<c:forEach var="result" items="${prgList}" varStatus="status">
		<fmt:parseDate value="${result.PGM_DT}" var="regDt" pattern="yyyyMMdd"/>
			<tr>
				<td><div class="cell"><fmt:formatNumber value="${result.ROWNUM}" pattern="#" /></div></td>
				<td><div class="cell"><c:out value="${result.SITE_NM}" /></div></td>
				<td><fmt:formatDate value="${regDt}" pattern="yyyy-MM-dd"/></td>
				<td><div class="cell"><c:out value="${result.MNG_USR_NM}" /></div></td>
				<td class='txt-left'><a href='javaScript:viewPrgRow("<c:out value="${result.PGM_CD}"/>"
																  , "<c:out value="${result.PGM_DT}"/>");' class='row_link'>
<c:if test="${result.PGM_TP_NM ne null and result.PGM_TP_NM ne ''}">
					<c:out value="${result.PGM_TP_NM}" /> >
</c:if>
					<c:out value="${result.PGM_NM}" /></a></td>
				<td><div class="cell"><c:out value="${result.MBR_CNT}" /></div></td>
			</tr>
	</c:forEach>
			</tbody>
		</table>
</c:if>
<c:if test="${totalCount <= 0}">
		<div class="no-data">조회된 데이터가 없습니다.</div>
</c:if>
	</div>
</div>
<div class="paging">
	<ui:pagination paginationInfo="${paginationInfo}" type="image" jsFunction="goPage" />
</div>