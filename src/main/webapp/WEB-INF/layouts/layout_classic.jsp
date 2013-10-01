<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>
<head>
<title><tiles:getAsString name="title" /></title>
<link rel="stylesheet" type="text/css" href="style/HomeStyle.css">
</head>
<body>
	<div align="left">
		<table>
			<tr>
				<td colspan="2"><tiles:insertAttribute name="header" /></td>
			</tr>
			<tr>
				<td><tiles:insertAttribute name="menu" /></td>
				<td><tiles:insertAttribute name="body" /></td>
			</tr>
			<tr>
				<td colspan="2"><tiles:insertAttribute name="footer" /></td>
			</tr>
		</table>
	</div>
</body>
</html>