'use strict'
//클래스 : 속성+함수(생성함수+클래스명() = constructor)
class Person {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }
    print() {
        console.log(`나의 이름은 ${this.name} 입니다.`);
        console.log(`나이는 ${this.age} 입니다.`);
    }
}
let p1 = new Person();
console.log(p1);
let p2 = new Person("hong", 30);
console.log(p2);
p2.print();

p1.name = "kim";
p1.age = 20;
p1.print();

p1["name"] = "ryu";
p1["age"] = 25;
p1.print();

class NewPerson {
    constructor(name, age) {
        this._name = name;
        this._age = age;
    }
    get name() {return this._name;}
    get age() {return this._age;}
    set name(value) {this._name=value;}
    set age(value) {this._age= value;}
    print() {
        console.log(this.name);
        console.log(this.age);
    }
}
let newP = new NewPerson("park", 40);
console.log(newP._name);        //변수를 호출
console.log(newP.name);         //함수를 호출
// console.log(newP.name());    //함수로서 호출은 오류
newP._name = "park2";
console.log(newP._name);
newP.name = "park3";
console.log(newP.name);