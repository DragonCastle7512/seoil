/*
https://api.coingecko.com/api/v3/coins/bitcoin
https://jsonplaceholder.typicode.com/users
https://jsonplaceholder.typicode.com/posts
https://jsonplaceholder.typicode.com/comments
*/
let xhttp = new XMLHttpRequest();
console.log(xhttp);
// xhttp.open("get", "https://api.coingecko.com/api/v3/coins/bitcoin");
xhttp.open("get", "books.json");
xhttp.send();
xhttp.onload = function() {
    console.log(xhttp.responseText);
    let body = document.querySelector("body");
    console.log(body);
    let books = JSON.parse(xhttp.responseText);
    // body.textContent += books[0].title;
    // body.textContent += books[1].title;
    // body.textContent += books[2].title;
    body.innerHTML += "---------------기본 반복---------------<br>";
    for(let i=0; i<books.length; i++)
        body.innerHTML += books[i].title+"<br>";
    body.innerHTML += "---------------forEach 반복---------------<br>";
    books.forEach(element => {
        body.innerHTML += element.title+"<br>";
    });
    body.innerHTML += "---------------forin 반복---------------<br>";
    for (const key in books)
        body.innerHTML += books[key].title+"<br>";
    body.innerHTML += "---------------forof 반복---------------<br>";
    for (const element of books)
        body.innerHTML += element.title+"<br>";
    //특정 조건을 이용하여 json객체 찾기
    var result = books.find(book => book.title === "javascript 기초");
    console.log(result);
}