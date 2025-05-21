--테이블 생성
create table accounts(
    ano varchar(50) primary key,
    owner varchar(50) not null,
    balance number(38) not null
);
select * from accounts order by balance asc;

insert into accounts values('111-1111-1111', '홍길동', 1000000);
insert into accounts values('222-2222-2222', '이순신', 0);

commit;