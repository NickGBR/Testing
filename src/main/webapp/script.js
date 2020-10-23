/**
 * Данный метод получает данные из таблицы по id,
 * если данный в поле ввода не переданы,
 * метод возвращает все данные из таблицы.
 * @param tableName
 */
function getById(tableName) {
    const request = new XMLHttpRequest();

    let id = document.getElementById('id_input').value;

    request.open("GET", "/dbservice/" + tableName + "/" + id, true);
    request.setRequestHeader("Content-Type", "application/json");

    request.onreadystatechange = function () {
        if (request.readyState === XMLHttpRequest.DONE) {

            if (request.status === 200) {
                if (request.responseText.length === 0) {
                    alert("Эллимент с " + id + " не найден!")
                } else {
                    const nameList = document.getElementById("name_list");
                    nameList.innerText = "";
                    if (request.status === 200) {
                        const data = JSON.parse(request.responseText);
                        console.log(data.hasOwnProperty(Object));
                        const text = JSON.stringify(data);

                        let textNode = document.createTextNode(text);
                        let par = document.createElement('p');
                        par.appendChild(textNode);
                        nameList.appendChild(par);

                    }
                }
            }
        } else if (request.status === 400) {
            alert("Введите число!")
        }
    }

    request.send()
}