DROP TABLE member CASCADE CONSTRAINTS;

/**********************************/
/* Table Name: 회원 */
/**********************************/
CREATE TABLE member(
		m_id                          		VARCHAR2(20)		 NULL ,
		m_name                        		VARCHAR2(120)		 NULL ,
		m_address                     		VARCHAR2(512)		 NULL ,
		m_point                       		NUMBER(10)		 DEFAULT 100		 NULL ,
		m_gender                      		CHAR(1)		 DEFAULT 'M'		 NULL ,
		m_date                        		DATE		 DEFAULT sysdate		 NULL 
);

COMMENT ON TABLE member is '회원';
COMMENT ON COLUMN member.m_id is '회원아이디';
COMMENT ON COLUMN member.m_name is '회원이름';
COMMENT ON COLUMN member.m_address is '주소';
COMMENT ON COLUMN member.m_point is '포인트';
COMMENT ON COLUMN member.m_gender is '회원성별';
COMMENT ON COLUMN member.m_date is '가입일자';



ALTER TABLE member ADD CONSTRAINT IDX_member_PK PRIMARY KEY (m_id);

