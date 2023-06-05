<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head><%@ page isELIgnored="false" %>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>javaguides.net</title>
    <link href="<c:url value="/resources/css/bootstrap.min.css" />"
          rel="stylesheet">
    <script src="<c:url value="/resources/js/jquery-1.11.1.js" />"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
<div class="container">
    <div class="col-md-offset-1 col-md-10">
        <h2>Báo cáo chi tiết - chi nhánh ${tempDocuments.branch}</h2>
        <hr />

        <input type="button" value="Add Customer"
               onclick="window.location.href='showForm'; return false;"
               class="btn btn-primary" />
        <br/><br/>
        <div class="panel panel-info">
            <div class="panel-heading">
                <div class="panel-title">Báo cáo</div>
            </div>
            <div class="panel-body">
                <table class="table table-striped table-bordered">
                    <tr>
                        <th>Mã tài sản</th>
                        <th>Mã Hồ sơ</th>
                        <th>Mã Book</th>
                        <th>Số Hợp đồng/ Tài khoản trên T24</th>
                        <th>Loại tài sản giữ hộ</th>
                        <th>Tên khách hàng</th>
                        <th>Số lượng TS giữ hộ CRB</th>
                    </tr>

                    <!-- loop over and print our customers -->
                    <c:forEach var="tempAssets" items="${assets}">

                        <!-- construct an "update" link with customer id -->
                        <c:url var="updateLink" value="">
                            <c:param name="customerId" value="" />
                        </c:url>

                        <!-- construct an "delete" link with customer id -->
                        <c:url var="deleteLink" value="">
                            <c:param name="customerId" value="" />
                        </c:url>

                        <tr>
                            <td>${tempAssets.assetId}</td>
                            <td>${tempAssets.document.id}</td>
                            <td>${tempAssets.companyName}</td>
                            <td>${tempAssets.id}</td>
                            <td>${tempAssets.assetType}</td>
                            <td>${tempAssets.customerName}</td>
                            <td>${tempAssets.xau}</td>


                            <td>
                                <a href="${pageContext.request.contextPath}/customer/showForm"}>Edit</a>
                                    <%--                <a href="${deleteLink}"--%>
                                    <%--                     onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>--%>
                            </td>

                        </tr>

                    </c:forEach>

                </table>

            </div>
        </div>
    </div>

</div>
</body>
</html>