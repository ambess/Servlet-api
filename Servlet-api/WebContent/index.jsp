<!-- La page index acte comme welcome page pour les utilisateurs authentifiés -->
<%@ page import="tn.pnud.training.model.Administrator"
	isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<!-- Ceci est une scriptlet -->

</head>
<body>
	<c:out value="${101 % 10}" />
	</br>
	</br>
	<c:out value="${101 / 0}" />
	</br>
	<c:catch var="exp">
		<c:out value="${101 % 0}" />
	</c:catch>
	<c:choose>
		<c:when test="${empty exp}"/>
		<c:otherwise>
			</br>
			${exp}
		</c:otherwise>
	</c:choose>

</body>
</html>