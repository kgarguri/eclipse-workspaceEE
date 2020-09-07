INSERT INTO user1 (user_id, user_pasword, user_name, user_email) VALUES ('guard1', '1111', 'FIRST', 'guard1@gmail.com');
INSERT INTO user1 (user_id, user_pasword, user_name, user_email) VALUES ('guard2', '1111', 'SECOND', 'guard2@gmail.com');
INSERT INTO user1 (user_id, user_pasword, user_name, user_email) VALUES ('guard3', '1111', 'THIRD', 'guard3@gmail.com');
INSERT INTO user1 (user_id, user_pasword, user_name, user_email) VALUES ('guard4', '1111', 'FOURTH', 'guard4@gmail.com');


INSERT INTO product1 (product_no, product_name, product_price, product_image, product_desc, product_click_count) 
VALUES (1001, '아이폰', 54400, 'iphone.jpg', '아이폰 좋아요', 0);
INSERT INTO product1 (product_no, product_name, product_price, product_image, product_desc, product_click_count) 
VALUES (1002, '아이패드', 89700, 'ipad.jpg', '아이패드 좋아요', 0);
INSERT INTO product1 (product_no, product_name, product_price, product_image, product_desc, product_click_count) 
VALUES (1003, '갤럭시20', 54400, 'galaxy20.jpg', '갤럭시20 좋아요!!!', 0);
INSERT INTO product1 (product_no, product_name, product_price, product_image, product_desc, product_click_count) 
VALUES (1004, '갤럭시탭', 32700, 'tag.jpg', '갤럭시탭 좋아요', 0);
INSERT INTO product1 (product_no, product_name, product_price, product_image, product_desc, product_click_count) 
VALUES (1005, '테슬라', 999990, 'teslar.jpg', '테슬라 좋나요', 0);
INSERT INTO product1 (product_no, product_name, product_price, product_image, product_desc, product_click_count) 
VALUES (1006, '블랙베리', 34000, 'berry.jpg', '블랙베리 좋아요', 0);

/*
 *회원 아이디 guard1 로그인한후  제품들을 주문 1
 * 아이폰2,아이패드2,갤럭시20 1개
 * 
 */
/***********************guard1 1번째주문************************************/
INSERT INTO jumun1 (jumun_no, jumun_desc, jumun_date, jumun_price, user_id) 
VALUES (3001, '아이폰외 4종', sysdate , 345100, 'guard1');

INSERT INTO jumun_detail1 (jumun_detail_no, jumun_no, product_no,jumun_detail_count) 
VALUES (5001, 3001, 1001,2);
INSERT INTO jumun_detail1 (jumun_detail_no, jumun_no, product_no,jumun_detail_count) 
VALUES (5002, 3001, 1002,2);
INSERT INTO jumun_detail1 (jumun_detail_no, jumun_no, product_no,jumun_detail_count) 
VALUES (5003, 3001, 1003,1);


/*
 *회원 아이디 guard2 로그인한후  제품들을 주문 
 * 테슬라1개,블랙베리1개
 * 
 */
/***********************guard2 주문************************************/
INSERT INTO jumun1 (jumun_no, jumun_desc, jumun_date, jumun_price, user_id) 
VALUES (3002, '테슬라외 1종', sysdate , 1033990, 'guard2');

INSERT INTO jumun_detail1 (jumun_detail_no, jumun_no, product_no,jumun_detail_count) 
VALUES (5004, 3002, 1005,1);
INSERT INTO jumun_detail1 (jumun_detail_no, jumun_no, product_no,jumun_detail_count) 
VALUES (5005, 3002, 1006,1);
/*
 *회원 아이디 guard3 로그인한후  제품들을 주문 
 * 갤럭시탭1개
 * 
 */
/***********************guard3 주문************************************/
INSERT INTO jumun1 (jumun_no, jumun_desc, jumun_date, jumun_price, user_id) 
VALUES (3003, '갤럭시탭', sysdate , 32700, 'guard3');

INSERT INTO jumun_detail1 (jumun_detail_no, jumun_no, product_no,jumun_detail_count) 
VALUES (5006, 3003, 1004,1);



/*
 *회원 아이디 guard1 로그인한후  제품들을 주문 2
 *  테슬라1개
 *  블랙베리1개
 */
/***********************guard1 2번째주문************************************/
INSERT INTO jumun1 (jumun_no, jumun_desc, jumun_date, jumun_price, user_id) 
VALUES (3004, '테슬라외 1종', sysdate , 1033990, 'guard1');

INSERT INTO jumun_detail1 (jumun_detail_no, jumun_no, product_no,jumun_detail_count) 
VALUES (5007, 3004, 1005,1);
INSERT INTO jumun_detail1 (jumun_detail_no, jumun_no, product_no,jumun_detail_count) 
VALUES (5008, 3004, 1006,1);

commit;


