<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: darshan
  Date: 8/11/18
  Time: 3:06 PM
  To change this template use File | Settings | File Templates.
--%>

<%@include file="template/header.jsp"%>

<form:form action="saveSupplier" modelAttribute="supplier" method="post">


    <div class="container-wrapper">

        <div class="container">
        <div class="page-header"> Add Supplier </div>
        <div class="form-group">


            <label for="supplier_name">Name</label>
            <form:input path="supplier_name" id="supplier_name"></form:input>
            <form:errors path="supplier_name"></form:errors>
        </div>

        <div class="form-group">

            <label for="supplier_address" >Address:</label>
            <form:input path="supplier_address" cssClass="form-control" id="supplier_address"></form:input>
            <form:errors path="supplier_address"></form:errors>
        </div>

        <div class="form-group">
            <label for="supplier_contact">Contact</label>
            <form:input path="supplier_contact" cssClass="form-control" id="supplier_contact"></form:input>
            <form:errors path="supplier_contact"></form:errors>
        </div>

        <div class="form-group">
            <button type="submit" class="button btn-primary">Submit</button>
        </div>
    </div>
    </div>
</form:form>



<%@include file="template/footer.jsp"%>