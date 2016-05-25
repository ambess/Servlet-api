<!-- La page index acte comme welcome page pour les utilisateurs authentifiés -->
<%@ page  import="tn.pnud.training.model.Administrator" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<!-- Ceci est une scriptlet -->

</head>
<body>
	<c:choose>
		<c:when test="${requestScope.whichIsTested == 1}">
			<jsp:include page="/WEB-INF/template/header.jsp">
				<jsp:param value="${Admin.firstname}" name="adminParam" />
				<jsp:param value="Custom and standard Actions" name="tagTypeAction" />
			</jsp:include>

			<jsp:useBean id="Admin" class="tn.pnud.training.model.Administrator"
				scope="session" />
			<jsp:getProperty property="cin" name="Admin" />
			<jsp:getProperty property="firstname" name="Admin" />
			<jsp:getProperty property="lastname" name="Admin" />
		</c:when>
		<c:when test="${requestScope.whichIsTested eq 3}">
			<jsp:include page="/WEB-INF/template/header.jsp">
				<jsp:param value="${Admin.firstname}" name="adminParam" />
				<jsp:param value="EL Expressions" name="tagTypeAction" />
			</jsp:include>
			</br> ${sessionScope.Admin.cin le 10000000000}
	</br> ${sessionScope.names[1]}
	</br> ${empty sessionScope["nbPresent"]}
	</br> ${sessionScope.siAdelJaa eq 10}
	</br> ${initParam.jdbcConnectionString}
	</br> ${cookie.JSESSIONID.value}</c:when>
		<c:otherwise>
			<c:out value="<h1>Nous ne faisons rien<h1>" default="The expression never returns a value" escapeXml="false" ></c:out>
		</c:otherwise>
	</c:choose>



</body>
</html>