drop table customer;
-- 오라클에서 한 줄 주석
create table customer(
	cus_no number(38) primary key
	,cus_name varchar2(50) not null
	,cus_phone varchar2(30) not null
	,cus_email varchar2(100) not null
	,cus_date date --default sysdate 제약조건을 주면 기본값이 날짜값으로 저장됨
);
select * from customer;
/* 레코드: 테이블 컬럼의 한 행
 * 레코드 저장문 형식)
 * instert into 테이블명 (컬럼 목록) values(값);
 * 모든 컬럼에 저장시에는 컬럼 목록 생략 가능
 * 문자열 레코드를 저장할 시 ''(작은 따옴표)
 * 시퀀스)
 * 번호 발생기. 중복과 null값이 없음.
 * 시퀀스 생성문법)
 * create sequence - 시퀀스명
 * start with 1 - 1부터 시작
 * increment by 1 - 1씩 증가
 * nochache - 임시 메모리를 사용하지 않음.
 * nocycle; - 시퀀스 최소값 또는 최대값에 도달하면 처음부터 다시 반복하지 않음
 */
create sequence cus_seq
start with 1
increment by 1
nocache
nocycle;

-- sysdate 오늘 날짜와 시간 반환
select sysdate as "오늘 날짜와 시간값" from dual;

select cus_seq.nextval as "다음 시퀀스 번호값" from dual;
insert into customer(cus_no, cus_name, cus_phone, cus_email, cus_date) values(cus_seq.nextval, '홍길동', '010-777-7777', 'hong@gmail.com', sysdate);
select * from customer order by cus_no desc;
insert into customer values(cus_seq.nextval, '이순신', '010-999-9999', 'leeshin@naver.com', sysdate);
insert into customer values(cus_seq.nextval, '신사임당', '010-888-8888', 'shin@gmail.com', sysdate);
/* 레코드 수정문 형식)
 * update 테이블명
 * set 컬럼명 = 변경할 값, 컴럼명 = 변경할 값
 * where 조건식;
 */
update customer set cus_name='수정 홍길동', cus_phone='010-555-5555', cus_email='edithong@gmail.com' where cus_no=2;
select cus_name, cus_phone, cus_email from customer where cus_no=2;

/* 레코드 삭제문 형식)
 * delete from 테이블명 where 조건식;
 */
select * from customer order by cus_no asc;

delete from customer where cus_no=4;