-- product.sql
/*
Product adidas = 
                new Product("S001", "슈퍼스타", 87200, 5);
*/

-- 1. PRODUCT 테이블 생성 구문
/* prodcode     NUMBER(4)
 * prodname     VARCHAR2(50)
 * price        NUMBER(12)
 * quantity     NUMBER(3)
 * regdate      DATE    DEFAULT sysdate
 * moddate      DATE    
 * pk_product : prodcode
 */

CREATE TABLE product 
(prodcode VARCHAR2(4),
 prodname VARCHAR2(50),
 price NUMBER(12),
 quantity NUMBER(3),
 regdate DATE DEFAULT systdate,
 moddate DATE,
 CONSTRAINT pk_product PRIMARY KEY (prodcode)
 )
 
-- 2. isExists() : 동일 데이터가 존재하는지 선 조회
SELECT p.prodcode
  FROM product p
 WHERE p.prodcode =?
 
-- 3. add() : 신규 제품 정보 등록 
  INSERT INTO product(prodcode, prodname, price, quantity)
  VALUES (?, ?, ?, ?)
 
-- 4. get() 제품 정보 조회
 SELECT p.prodcode,
        p.prodname,
        p.price,
        p.quantity
  FROM product p
 WHERE p.prodcode =?
 
-- 5. set() 제품 정보 수정
  UPDATE product p
     SET p.prodname = ?,
         p.price = ?,
         p.quantity = ?,
         p.moddate = sysdate
   WHERE p.prodcode = ? ;  
   
-- 6. remove() 제품 정보 삭제
 DELETE product p
  WHERE p.PRODCODE = ? ;  
  
-- 7. getAllProducts()  