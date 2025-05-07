<table>
    <tr>
        <th>Title</th><th>Genre</th><th>Published Year</th><th>Author</th>
    </tr>
    <c:forEach var="book" items="${books}">
        <tr>
            <td>${book.title}</td>
            <td>${book.genre}</td>
            <td>${book.publishedYear}</td>
            <td>${book.author.name}</td>
        </tr>
    </c:forEach>
</table>
