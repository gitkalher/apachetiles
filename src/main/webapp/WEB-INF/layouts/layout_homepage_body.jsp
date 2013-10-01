<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<table>
	<tr>
		<td><tiles:insertAttribute name="siteSearch" /></td>
		<td></td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td><tiles:insertAttribute name="userAgent" /></td>
	</tr>
	<tr>
		<td><tiles:insertAttribute name="news" /></td>
	</tr>
	<tr>
		<td><tiles:insertAttribute name="homeBody" /></td>
	</tr>
	<tr>
		<td><tiles:insertAttribute name="caseStuddies" /></td>
	</tr>
	<tr>
		<td><tiles:insertAttribute name="taggs" /></td>
	</tr>
	<tr>
		<td><tiles:insertAttribute name="comment" /></td>
	</tr>
</table>
