<!-- La page index acte comme welcome page pour les utilisateurs authentifiés -->
<%@ page import="tn.pnud.training.model.Administrator"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="core"%>
<html>
<head>
<!-- Ceci est une scriptlet -->

</head>
<body>
	
	</br> ${sessionScope.Admin.cin le 10000000000}
	</br> ${sessionScope.names[1]}
	</br> ${empty sessionScope["nbPresent"]}
	</br> ${sessionScope.siAdelJaa eq 10}
	</br> ${initParam.jdbcConnectionString}
	</br> ${cookie.JSESSIONID.value}
</body>
</html>