--boards 테이블 생성
create table boards(
	bno number(38) primary key,
	bwriter varchar2(50) not null,
	btitle varchar2(200) not null,
	bcontent varchar2(4000) not null,
	bdate date default sysdate, -- default sysdate -> 기본값으로 날짜값
	bfilename varchar2(200) null,
	bfiledata blob null
);

select * from boards order by bno desc;
select * from boards;

create sequence seq_bno
	start with 1
	increment by 1
	nocache
	nocycle;

select seq_bno.nextval as "다음 시퀀스 번호" from dual;