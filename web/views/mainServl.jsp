<!DOCTYPE html>
<html lang="en">
<head>
    <title>Учёт расходов</title>
    <meta charset = "utf-8"/>
</head>





<body>
<form method="post" action="${pageContext.request.contextPath}/mainServl">
    <p>Создать период: <input type="date" name="startDate"> <input type="date" name="endDate"> <input type="text" name="period">
        <input type="submit" value="Создать"></p>
</form>

<hr size="5" noshade="" />

<form>
    <!--сделать чтобы выпадал список ранее сделаных периодов из  формы выше-->
    <p>Выберите период:
        <select name="month">
            <option disabled>Выбор</option>
        </select>
        <input type="submit" value="Выбрать"></p>
</form>

<form>
    <p> <input type = "number" name = "CommonIncomeInp">Комментарий <input name = "comment">  <input type = "submit" value = "Ввести доход"> </p>
    <p> <input type = "number" name = "CommonSpendInp">Комментарий <input name = "comment"> <input type = "submit" value = "Ввести расход"> </p>
</form>
<form>

    <table border = "">
        <caption> Доход </caption>
        <tr>
            <th>Комментарий</th>
            <th>Сумма</th>
        </tr>
        <tr><td></td><td></td></tr>
        <tr><td></td><td></td></tr>
        <tr><td></td><td></td></tr>
        <tr><td></td><td></td></tr>
        <tr><td></td><td></td></tr>
        <tr><td></td><td></td></tr>
        <tr><td></td><td></td></tr>
        <tr><td></td><td></td></tr>
        <tr><td></td><td></td></tr>
    </table>

    <table border = "">
        <caption> Обязательные расходы </caption>
        <tr>
            <th>Комментарий</th>
            <th>Сумма</th>
        </tr>
        <tr><td></td><td></td></tr>
        <tr><td></td><td></td></tr>
        <tr><td></td><td></td></tr>
        <tr><td></td><td></td></tr>
        <tr><td></td><td></td></tr>
        <tr><td></td><td></td></tr>
        <tr><td></td><td></td></tr>
        <tr><td></td><td></td></tr>
        <tr><td></td><td></td></tr>
    </table>

</form>

<hr size="5" noshade="" />

<form>
    <p>Доход: </p>
    <p>Бюджет на день:</p>
    <p>Накопления за месяц:</p>
    <p>Накопления за год: </p>
</form>

<hr size="5" noshade="" />

<form method="post" action="${pageContext.request.contextPath}/mainServl">

    <p> Дата <input type="datetime-local" name="calendar"> Потраченная сумма <input type="number" name="spendInp">
        Комментарий <input name="comment">
        <button type="submit">Submit</button>
    </p>

</form>
<p>Бюджет на сегодня:</p>
<p>Сальдо с сегодня:</p>
</body>
</html>
