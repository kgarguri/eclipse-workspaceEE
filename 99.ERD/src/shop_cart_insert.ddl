/*
INSERT INTO cart1 (cart_item_no, cart_item_qty, cart_item_tot_price, user_id, product_no) 
VALUES (cart_item_no, cart_item_qty, cart_item_tot_price, user_id, product_no);
*/


INSERT INTO cart1 (cart_item_no, cart_item_gty, cart_item_tot_price, user_id, product_no) 
VALUES (9001, 2, 306000, 'guard1', 1001);
INSERT INTO cart1 (cart_item_no, cart_item_gty, cart_item_tot_price, user_id, product_no) 
VALUES (9002, 2, 400000, 'guard1', 1002);
INSERT INTO cart1 (cart_item_no, cart_item_gty, cart_item_tot_price, user_id, product_no) 
VALUES (9003, 1, 106000, 'guard1', 1003);

INSERT INTO cart1 (cart_item_no, cart_item_gty, cart_item_tot_price, user_id, product_no) 
VALUES (9004, 1, 999990, 'guard2', 1005);
INSERT INTO cart1 (cart_item_no, cart_item_gty, cart_item_tot_price, user_id, product_no) 
VALUES (9005, 1, 34000, 'guard2', 1006);


INSERT INTO cart1 (cart_item_no, cart_item_gty, cart_item_tot_price, user_id, product_no) 
VALUES (9006, 1, 32700, 'guard3', 1004);

INSERT INTO cart1 (cart_item_no, cart_item_gty, cart_item_tot_price, user_id, product_no) 
VALUES (9007, 1, 999990, 'guard1', 1005);
INSERT INTO cart1 (cart_item_no, cart_item_gty, cart_item_tot_price, user_id, product_no) 
VALUES (9008, 1, 34000, 'guard1', 1006);

commit;

select * from cart1;
