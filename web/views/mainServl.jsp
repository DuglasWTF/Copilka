<!DOCTYPE html>
<html lang="en">
<head>
    <title>Учёт расходов</title>
    <meta charset="utf-8"/>
</head>

<body>
<form>
    <p>Выберите период: <input type="date" name="calendar"> <input type="date" name="calendar">
        <input type="submit" value="Выбрат"></p>
</form>
<form>
    <p><input type="number" name="CommonIncomeInp"> <input type="submit" value="Ввести доход"</p>
    <p><input type="number" name="CommonSpendInp"> <input type="submit" value="Ввести расход"</p>
</form>
<form>
    <table border="">
        <caption> Доход</caption>
        <tr>
            <th>Комментарий</th>
            <th>Сумма</th>
        </tr>
        <tr>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td></td>
            <td></td>
        </tr>
    </table>

    <table border="">
        <caption> Обязательные расходы</caption>
        <tr>
            <th>Комментарий</th>
            <th>Сумма</th>
        </tr>
        <tr>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td></td>
            <td></td>
        </tr>
    </table>

</form>

<hr/>

<form>
    <p>Доход: </p>
    <p>Бюджет на день:</p>
    <p>Накопления за месяц:</p>
    <p>Накопления за год: </p>
</form>

<hr/>
<form method="post" action="${pageContext.request.contextPath}/mainServl" >

    <p> Дата <input type="datetime-local" name="calendar"> Потраченная сумма <input type="number" name="spendInp">
        Комментарий <input name="comment">
        <button type="submit">Submit</button>
    </p>

</form>
<p>Бюджет на сегодня:</p>
<p>Сальдо с сегодня:</p>
</body>
</html>
