<html lang="en-US">
    <head>
        <meta charset="UTF-8">
        <title>查询结果</title>
    </head>
    <body>
        <p>个人信息查询结果:</p>
        <br>
        <p>姓名: ${student.studentName}</p>
        <p>学号: ${student.studentId}</p>
        <p>住址: ${student.studentAddress}</p>
        <p>创建时间: ${student.createTime?string('yyyy-MM-dd HH:mm:ss')}</p>
        <p>更新时间: ${student.updateTime?string('yyyy-MM-dd HH:mm:ss')}</p>
    </body>
</html>