<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>查询</title>
    </head>
    <body>
        <section class=container>
            <div class="searchByName">
                <h1>个人信息查询</h1>
                <form method="post" action="/test/search/one">
                    <p>姓名: <input type="text" name="name" value="" placeholder="yourname"></p>
                    <p><input type="submit" value="个人查询"></p>
                </form>
            </div>
            <div class="searchAll">
                <h1>集体查询</h1>
                <form method="post" action="/test/search/all">
                    <p><input type="submit" value="集体查询"></p>
                </form>
            </div>
        </section>
    </body>
</html>