<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="template/header.jsp"%>


<form:form modelAttribute="employee" method="post" action="saveEmployee">

    <div class="container-wrapper">

        <div class="container">

            <div class="form-group">
                <label for="employee_ssn">SSN</label>
                <form:input path="employee_ssn" cssClass="form-control" id="employee_id"></form:input>
                <form:errors path="employee_ssn" cssClass="alert-danger"></form:errors>

            </div>

            <div class="form-group">
                <label for="employee_firstName">First Name:</label>
                <form:input path="employee_firstName" id="employee_firstName" cssClass="form-control"></form:input>
                <form:errors path="employee_firstName" cssClass="alert-danger"></form:errors>

            </div>

            <div class="form-group">

                <label for="employee_lastName">Last Name:</label>
                <form:input path="employee_lastName" id="employee_lastName" cssClass="form-control"></form:input>
                <form:errors path="employee_lastName" cssClass="alert-danger"></form:errors>
            </div>


            <div class="form-group">
                <label>SEX</label>
              Male:  <form:radiobutton path="employee_sex" value="male" id="employee_sex_male" cssClass="radio-button"></form:radiobutton>
              Female:  <form:radiobutton path="employee_sex" value="female" id="employee_sex_female" cssClass="radio-button"></form:radiobutton>

                <form:errors path="employee_sex" cssClass="alert-danger"></form:errors>
            </div>

            <div class="form-group">
                <label for="employee_birthdate">Birthdate</label>
               <form:input cssClass="form-control"  class="form-control" path="employee_birthdate" type="date"/>
                <form:errors path="employee_birthdate" cssClass="alert-danger"></form:errors>
                </div>

            <div class="form-group">
                <label for="employee_salary">Salary:</label>
                <form:input path="employee_salary" id="employee_salary" cssClass="form-control"></form:input>
                <form:errors path="employee_salary" cssClass="alert-danger"></form:errors>
            </div>

            <div class="form-group">
                <label for="employee_address">Address</label>
                <form:input path="employee_address" id="employee_address" cssClass="form-control"></form:input>
                <form:errors path="employee_address" cssClass="alert-danger"></form:errors>
            </div>
            <button type="submit" class="btn-primary btn">Submit</button>
            </div>






        </div>
    </div>

</form:form>


<%@include file="template/footer.jsp"%>