/*
 * 1. ����ѻ���� īƮ�����۸���Ʈ
 * 2. īƮ������ 1���� ��ǰ����
 * 3. ����ѻ���� īƮ�������(��ǰ����)
 */
 --1. ����ѻ���� īƮ�����۸���Ʈ
select * from cart1 c where c.user_id='guard1';
select * from cart1 c where c.user_id='guard2';
select * from cart1 c where c.user_id='guard3';

--2. īƮ������ 1���� ��ǰ����
select * from cart1 c join product1 p on c.product_no=p.product_no where c.cart_item_no=2001;




--3. ����ѻ���� īƮ�������(��ǰ����)