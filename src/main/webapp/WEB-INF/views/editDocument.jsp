<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Spring MVC 5 - form handling | Java Guides</title>
    <link href="<c:url value="/resources/css/bootstrap.min.css" />"
          rel="stylesheet">
    <script src="<c:url value="/resources/js/jquery-1.11.1.js" />"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>
<div class="container">
    <div class="col-md-offset-2 col-md-7">
        <h2 class="text-center">Spring MVC 5 + Hibernate 5 + JSP + MySQL
            Example</h2>
        <div class="panel panel-info">
            <div class="panel-heading">
                <div class="panel-title">Add Customer</div>
            </div>
            <div class="panel-body">
                <form:form action="saveCustomer" cssClass="form-horizontal"
                           method="post" modelAttribute="customer">

                    <!-- need to associate this data with customer id -->
                    <form:hidden path="assetId" />

                    <div class="form-group">
                        <label for="companyName" class="col-md-3 control-label">Mã Book</label>
                        <div class="col-md-9">
                            <form:input path="companyName" cssClass="form-control" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="id" class="col-md-3 control-label">S? h?p ??ng/Tài kho?n trên T24</label>
                        <div class="col-md-9">
                            <form:input path="id" cssClass="form-control" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="assetType" class="col-md-3 control-label">Lo?i tài s?n gi? h?</label>
                        <div class="col-md-9">
                            <form:input path="assetType" cssClass="form-control" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="curUnit" class="col-md-3 control-label">??n v? tính</label>
                        <div class="col-md-9">
                            <form:input path="curUnit" cssClass="form-control" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="customerCode" class="col-md-3 control-label">Mã khách hàng</label>
                        <div class="col-md-9">
                            <form:input path="customerCode" cssClass="form-control" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="customerName" class="col-md-3 control-label">Tên khách hàng</label>
                        <div class="col-md-9">
                            <form:input path="customerName" cssClass="form-control" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="validDate" class="col-md-3 control-label">Ngày hi?u l?c</label>
                        <div class="col-md-9">
                            <form:input path="validDate" cssClass="form-control" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="expiredDate" class="col-md-3 control-label">Ngày ??n h?n</label>
                        <div class="col-md-9">
                            <form:input path="expiredDate" cssClass="form-control" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="xau" class="col-md-3 control-label">S? l??ng TS gi? h? CRB</label>
                        <div class="col-md-9">
                            <form:input path="xau" cssClass="form-control" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="amountLCY" class="col-md-3 control-label">Thành ti?n CRB</label>
                        <div class="col-md-9">
                            <form:input path="amountLCY" cssClass="form-control" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="amountAssetHold" class="col-md-3 control-label">S? l??ng TS gi? h? Th?c t?</label>
                        <div class="col-md-9">
                            <form:input path="amountAssetHold" cssClass="form-control" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="amountActual" class="col-md-3 control-label">Thành ti?n th?c t?</label>
                        <div class="col-md-9">
                            <form:input path="amountActual" cssClass="form-control" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="gapQuantity" class="col-md-3 control-label">Chênh l?ch s? l??ng</label>
                        <div class="col-md-9">
                            <form:input path="gapQuantity" cssClass="form-control" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="gapAmount" class="col-md-3 control-label">Chênh l?ch Thành ti?n</label>
                        <div class="col-md-9">
                            <form:input path="gapAmount" cssClass="form-control" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="reason" class="col-md-3 control-label">Nguyên nhân</label>
                        <div class="col-md-9">
                            <form:input path="reason" cssClass="form-control" />
                        </div>
                    </div>

                    <div class="form-group">
                        <!-- Button -->
                        <div class="col-md-offset-3 col-md-9">
                            <form:button cssClass="btn btn-primary">Submit</form:button>
                        </div>
                    </div>

                </form:form>
            </div>
        </div>
    </div>
</div>
</body>
</html>