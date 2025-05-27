'use strict'
//객체: {}, JSON: "{}", 배열: []
function add(a, b) {
    return a+b;
}
let copyadd = add;
console.log(copyadd(10, 20));

let minus = (a, b) => {return a-b;}
console.log(minus(20, 10));

minus = function(a, b) {return a-b;}
console.log(minus(20, 10));

minus = function minus2(a, b) {return a-b;}
console.log(minus(30, 10));

let f, ff, fff;
f = ff = fff = minus;

//배열을 선언 하는 법
let arr = [];
console.log(typeof arr);
console.log(arr);

let arr2 = new Array();
console.log(typeof arr2);
console.log(arr2);

//객체를 선언 하는 법
let obj = {};
console.log(typeof obj);
console.log(obj);

let obj2 = new Object();
console.log(typeof obj2);
console.log(obj2);

//배열과 객체 구별
console.log(Array.isArray(arr));
console.log(Array.isArray(obj));

//배열의 값을 입력하기
arr = ["banana", "apple"];
console.log(arr);
arr.push("melon");
console.log(arr);
console.log(arr.pop());
console.log(arr);

arr2 = new Array(1, 2, "3", "4");
console.log(arr2);

let arr3 = [];
let insa = "Hello";
console.log(insa);
arr3 = [...insa];
console.log(arr3);

let arr4 = insa.split();        //스페이스로 분리
console.log(arr4);              //분리할게 없을 경우 단일 배열

arr4 = insa.split("");      //빈문자열 분리
console.log(arr4);              //문자 단위로 분리

let arr5 = ["banana", "apple", "melon"];
let arr6 = ["banana", "apple", "melon"];
let arr7 = "['banana', 'apple', 'melon']";
console.log(Array.isArray(arr5));
console.log(arr5);
console.log(Array.isArray(arr6));
console.log(arr6);
console.log(Array.isArray(arr7));
console.log(arr7);

let arr8 = arr7.substring(1, arr7.length-1).replaceAll("'", "").split(",");
console.log(arr8);

let arr9 = "['banana', 'apple', 'melon']";          //오류! 요소는 ""로 묶어야함
let arr10 = '["banana", "apple", "melon"]';
console.log(JSON.parse(arr10));

let json3 = "{'name':'hong', 'age':'23'}";          //오류! '' 불가
let json4 = '{"name":"hong", "age":"23"}';
let json5 = "{\"name\":\"hong\", \"age\":\"23\"}";
console.log(JSON.parse(json4));
console.log(JSON.parse(json5));

//배열 또는 객체는 ""으로 처리하라
arr5 = ["banana", "apple", "melon"];
console.log(arr5.join());
console.log(arr5.toString());
console.log(JSON.stringify(arr5));

let obj3 = {
    "name":"kim",
    "age":20
};
console.log(obj3);
let firstname = "park";
let age = 23;
let person = {"name":firstname, "age":age}
console.log(person);

person["name"] = "ryu";
person["age"] = 30;
console.log(person);