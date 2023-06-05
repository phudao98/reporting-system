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
    <h2>Hệ thống báo cáo quyết toán</h2>
    <hr />

    <input type="button" value="Add Customer"
           onclick="window.location.href='showForm'; return false;"
           class="btn btn-primary" />
    <br/><br/>
    <div class="panel panel-info">
      <div class="panel-heading">
        <div class="panel-title">Danh sách báo cáo</div>
      </div>
      <div class="panel-body">
        <table class="table table-striped table-bordered">
          <tr>
            <th>Mã báo cáo</th>
            <th>Mẫu biểu</th>
            <th>Tên báo cáo</th>
            <th>Đơn vị thực hiện</th>
            <th>Kỳ thực hiện</th>
            <th>Người thực hiện</th>
            <th>Trạng thái</th>
          </tr>

          <!-- loop over and print our customers -->
          <c:forEach var="tempDocuments" items="${documents}">

            <!-- construct an "update" link with customer id -->
            <c:url var="updateLink" value="">
              <c:param name="customerId" value="${tempDocuments.id}" />
            </c:url>

            <!-- construct an "delete" link with customer id -->
            <c:url var="deleteLink" value="">
              <c:param name="customerId" value="${tempDocuments.id}" />
            </c:url>

            <tr>
              <td><a href="${pageContext.request.contextPath}/document/view">${tempDocuments.id}</a></td>
              <td>${tempDocuments.docType}</td>
              <td>${tempDocuments.docName}</td>
              <td>${tempDocuments.branch}</td>
              <td>${tempDocuments.period}</td>
              <td>${tempDocuments.performer}</td>
              <td>${tempDocuments.docStatus}</td>


              <td>
                <a href="${pageContext.request.contextPath}/asset/view"} onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Claim</a>
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