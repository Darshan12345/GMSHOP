<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@include file="template/header.jsp"%>
<form:form method="post" action="saveCustomer" modelAttribute="customer">
    <div class="container-wrapper">
    <div class="container">
    <div class="page-header">
        <h1>Register Customer</h1>

        <p class="lead">Please fill in your information below:</p>
    </div>


    <div class="form-group">

        <label for="firstName">First Name:</label>
        <form:input path="firstName" class="form-control" id="firstName"></form:input>

        <form:errors path="firstName" cssClass="alert-danger"></form:errors>
    </div>

    <div class="form-group">
         <label for="lastName">Last Name:</label>
        <form:input path="lastName" class="form-control" id="lastName"></form:input>
        <form:errors path="lastName" cssClass="alert-danger" />
    </div>

    <div class="form-group">
        <label for="contact">Contact</label>
    <form:input path="contact" class="form-control" id="contact"></form:input>


    </div>


    <button type="submit" class="btn btn-default">Submit</button>
</form:form>

</div>
</div>

<%@include file="template/footer.jsp"%>