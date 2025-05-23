
// //라이브러리 포함
// // import { useState } from "react";
// import ReactDOM from "react-dom/client";
// //상태 변환 관리
// import React, {useState, useEffect} from "react";

// //내부적으로 App 작성
// function App() {
//   const [count, setCount] = useState(0);
//   //어떤 기능을 사용할 것인가?
//   //값을 증가시키는 기능
//   function increment() {
//     //값을 저장할 변수 필요 -> const [count, setCount] = useState(0);
//     // setCount(count++);   //count가 상수이기 때문에 수정 불가
//     //setCount((c) => c+1);
//     setCount(count+1);
//   }
//   return (
//     <>
//       <div>
//         Count: {count}
//         <button onClick={increment}>+</button>
//       </div>
//     </>
//   )
// }
// // 함수의 입력값 Tools({ todos })
// function Tools({ todos }) {
//   return (
//     <>
//       {/* map -> 반복 처리 */}
//       {todos.map((todo, index) => {
//         return <p key={index}>{todo}</p>;
//       })}
//     </>
//   );
// }; 
// function App2() {
//   //전달 받은 데이터 -> 배열
//   const [todos, setTodos] = useState(["todo 1", "todo 2", "todo 3"]);
//   return(
//     <>
//       <div>
//         {/* todos={todos}는 속성:값 */}
//         {/* //<Tools>태그는 함수 Tools() */}
//         <Tools todos={todos} />
//       </div>
//     </>
//   )
// }
// //상태가 변화되었을 떄 실행되는 코드(상태 변수 선언, 상태 변화 실행 함수(userEffect), 화면에 표시될 return 태그)
// function Counter() {
//   //상태 변수
//   const [count, setCount] = useState(0);
//   //상태 변환 실행 함수
//   useEffect(() => {
//     console.log(`현재 카운터:${count}`);
//   }, [count]);
//   //return 태그
//   return (
//     <div>
//       <div>카운터:{count}</div>
//       <button onClick={() => setCount(count+1)}>숫자 증가하기</button>
//     </div>
//   );
// }

// //메인 실행코드
// const root = ReactDOM.createRoot(document.getElementById('root'));
// root.render(<Counter/>);

import ReactDOM from "react-dom/client";
import React, { useState, useEffect } from "react";

function PhonebookList() {
  const [contacts, setContacts] = useState([]);

  useEffect(() => {
    console.log("호출");
    const xhttp = new XMLHttpRequest();
    xhttp.open("get", "data.json");
    xhttp.send();
    xhttp.onload = function () {
      const data = JSON.parse(xhttp.responseText);
      setContacts(data);
    };
  }, []);

  return (
    <div>
      {contacts.map(contact => (
        <ul
          key={contact.id}
          style={{ listStyle: "none", border: "1px solid", padding: 0 }}
        >
          <li>{contact.id}</li>
          <li>{contact.name}</li>
          <li>{contact.phone}</li>
        </ul>
      ))}
    </div>
  );
}

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<PhonebookList />);
