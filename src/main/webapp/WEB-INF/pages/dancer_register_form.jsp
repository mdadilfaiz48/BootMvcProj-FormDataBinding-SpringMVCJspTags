<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>


<h1 style="color: red; text-align: center">Dancer Registration form</h1>
<frm:form  modelAttribute="dancer">
	<table align="center" bgcolor="cyan">
		<tr>
			<td>Dancer ID :</td>
			<td><input type="text" name="did"></td>
		</tr>
		<tr>
			<td>Dancer Name :</td>
			<td><frm:input type="text" path="name"/></td>
		</tr>
		<tr>
			<td>Dancer Address :</td>
			<td><frm:input type="text" path="addrs"/></td>
		</tr>
		<tr>
			<td>Dancer danceForm :</td>
			<td><frm:input type="text" path="danceForm"/></td>
		</tr>
		<tr>
			<td>Dancer Fee :</td>
			<td><frm:input type="text" path="fee"/></td>
		</tr>

		<tr>
			<td><input type="submit" value="send"></td>
			<td><input type="Reset" value="cancel"></td>
		</tr>

	</table>

</frm:form>