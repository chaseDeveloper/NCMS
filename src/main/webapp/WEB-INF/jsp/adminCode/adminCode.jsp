<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!-- 페이지 타이틀 -->
<div class="tit-area">
    <h1>
        <i class="el-icon-s-order" style="color: rgb(0, 108, 185);"></i>
        코드 관리
    </h1>
</div>
<!-- // 페이지 타이틀 -->

<div class="formline">
   
    <!-- 코드 그룹, 코드 목록 -->
    <div class="el-row">
        <div class="row2">
            <div class="top-right-btn">
                <button type="button" class="el-button el-button--primary el-button--small is-plain" style="margin-left: 8px;">
                    <i class="el-icon-refresh-right"></i><span>초기화</span>
                </button>
                <button type="button" class="el-button el-button--primary el-button--small is-plain" style="margin-left: 8px;">
                    <i class="el-icon-refresh-right"></i><span>엑셀업로드</span>
                </button>
            </div>
            <div class="section pdn mgn">
                <div class="el-card_header">
                    <h2>
                        <i class="el-icon-s-opportunity"></i>
                        코드 그룹
                    </h2>
                </div>
                <div class="el-card_body">

                    <!-- 검색 -->
                    <div class="section bg-sky">
                        <table class="w-auto">
                            <tbody>
                                <tr>
                                    <th>그룹ID</th>
                                    <td>
                                        <input type="text" class="el-input__inner" style="width:100px">
                                    </td>
                                    <th>그룹명</th>
                                    <td>
                                        <input type="text" class="el-input__inner" style="width:100px">
                                        <button type="button" class="el-button el-button--primary el-button--small is-plain" style="margin-left: 8px;">
                                            <i class="el-icon-search"></i><span>검색</span>
                                        </button>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    <!-- // 검색 -->

                    <!-- 검색 결과 -->
                    <div class="table-box mgt10">
                        <div class="el-table_header-wrapper">
                            <table>
                                <colgroup>
                                    <col style="width:46px">
                                    <col style="width:120px">
                                    <col style="width:567px">
                                    <col style="width:80px">
                                    <col>
                                </colgroup>
                                <thead>
                                    <tr>
                                        <th>#</th>
                                        <th>그룹ID</th>
                                        <th>그룹명</th>
                                        <th>정렬순서</th>
                                        <th>사용</th>
                                    </tr>
                                </thead>
                            </table>
                        </div>
                        <div class="el-table_body-wrapper" style="height: 360px;">
                            <table>
                                <colgroup>
                                    <col style="width:46px">
                                    <col style="width:120px">
                                    <col style="width:567px">
                                    <col style="width:80px">
                                    <col>
                                </colgroup>
                                <tbody>
                                    <tr>
                                        <td>
                                            <div class="cell">1</div>
                                        </td>
                                        <td>
                                            <div class="cell">
                                                <a href="#" class="row_link">C1000</a>
                                            </div>
                                        </td>
                                        <td class="txt-left">
                                            <div class="cell">정보제공자/본인여부</div>
                                        </td>
                                        <td>
                                            <div class="cell">1</div>
                                        </td>
                                        <td>
                                            <div class="cell">Y</div>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                            <!-- <div class="no-data">조회된 데이터가 없습니다.</div> -->
                        </div>
                    </div>
                    <!-- // 검색 결과 -->

                    <!-- 그룹정보 -->
                    <div class="section">
                        <table class="w-auto wr-form">
                            <tbody>
                                <tr>
                                    <th>
                                        <span class="required">*</span>
                                        그룹ID
                                    </th>
                                    <td>
                                        <input type="text" class="el-input__inner" style="width:100px">
                                    </td>
                                    <th>
                                        <span class="required">*</span>
                                        그룹명
                                    </th>
                                    <td>
                                        <input type="text" class="el-input__inner" style="width:350px">
                                    </td>
                                </tr>
                                <tr>
                                    <th>
                                        <span class="required">*</span>
                                        순서
                                    </th>
                                    <td>
                                        <input type="text" class="el-input__inner" style="width:100px">
                                    </td>
                                    <th>
                                        <span class="required">*</span>
                                        사용여부
                                    </th>
                                    <td>
                                        <select name="" id="" style="width: 100px;">
                                            <option value="">선택</option>
                                        </select>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    <div class="mgt10 txt-center">
                        <button type="button" class="el-button el-button--primary el-button--small is-plain" style="margin-left: 8px;">
                            <i class="el-icon-refresh-right"></i><span>저장</span>
                        </button>
                    </div>
                    <!-- // 그룹정보 -->

                </div>
            </div>
        </div>
        <div class="row2">
            <div class="top-right-btn">
                <button type="button" class="el-button el-button--primary el-button--small is-plain" style="margin-left: 8px;">
                    <i class="el-icon-refresh-right"></i><span>초기화</span>
                </button>
            </div>
            <div class="section pdn mgn">
                <div class="el-card_header">
                    <h2>
                        <i class="el-icon-s-opportunity"></i>
                        코드 목록
                    </h2>
                </div>
                <div class="el-card_body">

                    <!-- 검색 -->
                    <div class="section bg-sky">
                        <table class="w-auto">
                            <tbody>
                                <tr>
                                    <th>코드ID</th>
                                    <td>
                                        <input type="text" class="el-input__inner" style="width:100px">
                                    </td>
                                    <th>코드명</th>
                                    <td>
                                        <input type="text" class="el-input__inner" style="width:100px">
                                    </td>
                                    <th>사용여부</th>
                                    <td>
                                        <select name="" id="" style="width: 100px;">
                                            <option value="">선택</option>
                                        </select>
                                        <button type="button" class="el-button el-button--primary el-button--small is-plain" style="margin-left: 8px;">
                                            <i class="el-icon-search"></i><span>검색</span>
                                        </button>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    <!-- // 검색 -->

                    <!-- 검색 결과 -->
                    <div class="table-box mgt10">
                        <div class="el-table_header-wrapper">
                            <table>
                                <colgroup>
                                    <col style="width:46px">
                                    <col style="width:120px">
                                    <col style="width:567px">
                                    <col style="width:80px">
                                    <col>
                                </colgroup>
                                <thead>
                                    <tr>
                                        <th>#</th>
                                        <th>코드ID</th>
                                        <th>코드명</th>
                                        <th>정렬순서</th>
                                        <th>사용</th>
                                    </tr>
                                </thead>
                            </table>
                        </div>
                        <div class="el-table_body-wrapper" style="height: 380px;">
                            <table>
                                <colgroup>
                                    <col style="width:46px">
                                    <col style="width:120px">
                                    <col style="width:567px">
                                    <col style="width:80px">
                                    <col>
                                </colgroup>
                                <tbody>
                                    <tr>
                                        <td>
                                            <div class="cell">1</div>
                                        </td>
                                        <td>
                                            <div class="cell">10</div>
                                        </td>
                                        <td class="txt-left">
                                            <div class="cell">본인</div>
                                        </td>
                                        <td>
                                            <div class="cell">10</div>
                                        </td>
                                        <td>
                                            <div class="cell">Y</div>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <div class="cell">1</div>
                                        </td>
                                        <td>
                                            <div class="cell">10</div>
                                        </td>
                                        <td class="txt-left">
                                            <div class="cell">본인</div>
                                        </td>
                                        <td>
                                            <div class="cell">10</div>
                                        </td>
                                        <td>
                                            <div class="cell">Y</div>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <div class="cell">1</div>
                                        </td>
                                        <td>
                                            <div class="cell">10</div>
                                        </td>
                                        <td class="txt-left">
                                            <div class="cell">본인</div>
                                        </td>
                                        <td>
                                            <div class="cell">10</div>
                                        </td>
                                        <td>
                                            <div class="cell">Y</div>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                            <!-- <div class="no-data">조회된 데이터가 없습니다.</div> -->
                        </div>
                    </div>
                    <!-- // 검색 결과 -->

                </div>
            </div>
        </div>
    </div>
    <!-- 코드 그룹, 코드 목록 -->

</div>

