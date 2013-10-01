<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras"
	prefix="tilesx"%>

<div style="border: 2px solid black;">

	<table>
		<tr>
			<td><tiles:insertAttribute name="tag01" /></td>
			<td><tiles:insertAttribute name="tag02" /></td>
			<td><tiles:insertAttribute name="tag03" /></td>
		</tr>
	</table>
</div>