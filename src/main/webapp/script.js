function getById(tableName){
    const request = new XMLHttpRequest();
    let id = document.getElementById('id_input').value;
    request.open("GET", "/dbservice/"+ tableName + "/" + id, true);
    request.setRequestHeader("Content-Type", "application/json");

    request.onreadystatechange = function () {
        if (request.readyState === XMLHttpRequest.DONE) {
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

    request.send()
}