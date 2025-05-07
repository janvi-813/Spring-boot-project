<table>
    <tr>
        <th>Name</th><th>Bio</th><th>Birth Year</th>
    </tr>
    <c:forEach var="author" items="${authors}">
        <tr>
            <td>${author.name}</td>
            <td>${author.bio}</td>
            <td>${author.birthYear}</td>
        </tr>
    </c:forEach>
</table>
