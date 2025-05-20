console.log("test");
//객체 형식
let obj = {"name":"hongkildong", "age":23};
let obj2 = {"name":"hongkildong", "age":"23"};
console.log("obj"+obj);
console.log("obj2"+obj2);
console.log(obj.name);
console.log(obj["name"]);

//json 형식
let strobj = `{"name":"kimkildong", "age":"30"}`;
//let strobj2 = "{"name":"kimkildong","age":"30"}"; //오류 발생
let strobj3 = "{\"name\":\"kimkildong\", \"age\":\"30\"}";
console.log(strobj.name);
//js 문자열 표현방법
let str = "hello";
let str2 = `hello`;
/* 주의사항
* 네트워크를 통해서 전달될 때는 문자열 전달
* 문자열로 받은 데이터를 json형식일 때 객체로 변환 가능
*/
let obj4 = JSON.parse(strobj);
console.log(obj.name);
console.log(obj.age);
console.log(typeof obj4);

//객체를 문자열로 변환
console.log(typeof JSON.stringify(obj4));

/* 객체의 조합
* 속성만을 사용한 객체 {"name":"kimkildong", "age":"30"}
* 속성+함수
*/
let obj5 = {"name":"kimkildong", "age":"30", 
    "callname":function(name) {console.log(name)},
    "callage":function(age) {console.log(age)}
}
obj5.callname(obj5.name);
obj5["callage"](obj5.age);
let myfunc = function() {
    console.log("hello myfunc");
} 
myfunc();

let myfunc2 = () => {
    console.log("hello myfunc2");
}
myfunc2();
function myfunc3() {
    console.log("hello myfunc3");
}
let myfunc4 = myfunc3;
myfunc4();
let myfunc5 = myfunc4 = myfunc3;
myfunc5();
myfunc4();
myfunc3();

let arr = ["apple", "bannana", "mango"];
console.log(typeof arr);
console.log(arr[0]);

let arr2 = [
    {"name":"kim", "age":"10"},
    {"name":"park", "age":"20"},
    {"name":"lee", "age":"30"}
];
console.log(arr2[0]["name"]);
console.log(arr[2]["age"]);

let obj6 = {
    "name":"kim",
    "age":"10",
    "intro":function(name, age, fav) {
        console.log(`my name is ${name}`);
        console.log(`my age is ${age}`);
        console.log(`my fav is ${fav}`);
    },
    "fav":["apple", "bannana", "mango"],
    "bestfriend":{"name":"park", "age":10},
    "frends":[
        {"name":"lee", "age":12},
        {"name":"ryu", "age":13},
        {"name":"sin", "age":14}
    ]
}
obj6.intro(obj6.name, obj6.age, obj6.fav);
console.log(obj6.bestfriend["name"]);
console.log(obj6.bestfriend.age);
console.log(obj6.frends[0].name);
console.log(obj6.frends[1]["name"]);
console.log(obj6["frends"][1]["name"]);