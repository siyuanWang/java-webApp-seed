-- SQL Manager Lite for PostgreSQL 5.6.0.46308
-- ---------------------------------------
-- Host      : localhost
-- Database  : geely
-- Version   : PostgreSQL 9.4.4, compiled by Visual C++ build 1800, 64-bit



SET check_function_bodies = false;
--
-- Structure for table sys_user (OID = 16416) : 
--
SET search_path = public, pg_catalog;
CREATE TABLE public.sys_user (
    "ID" integer NOT NULL,
    "LOGIN_NAME" varchar(100) NOT NULL,
    "PASSWORD" varchar(200) NOT NULL,
    "NAME" varchar(32),
    "PHONE" varchar(32),
    "EMAIL" varchar(64),
    "IS_BUILTIN" boolean DEFAULT false NOT NULL,
    "LOGIN_TIME" timestamp(0) without time zone,
    "PASSWORD_LAST_MODIFY_TIME" timestamp(0) without time zone,
    "UPDATE_TIME" timestamp(0) without time zone NOT NULL,
    "CREATE_TIME" timestamp(0) without time zone NOT NULL
)
WITH (oids = false);
--
-- Structure for table sys_role (OID = 16424) : 
--
CREATE TABLE public.sys_role (
    "ID" integer NOT NULL,
    "NAME" varchar(100) NOT NULL,
    "IS_BUILTIN" boolean DEFAULT false NOT NULL,
    "UPDATE_TIME" timestamp(0) without time zone NOT NULL,
    "CREATE_TIME" timestamp(0) without time zone NOT NULL
)
WITH (oids = false);
--
-- Structure for table sys_menu (OID = 16432) : 
--
CREATE TABLE public.sys_menu (
    "ID" integer NOT NULL,
    "PID" integer DEFAULT 0 NOT NULL,
    "NAME" varchar(256) NOT NULL,
    "URL" varchar(200) NOT NULL,
    "ORDER_NUM" integer DEFAULT 0 NOT NULL,
    "TYPE" integer,
    "UPDATE_TIME" timestamp(0) without time zone NOT NULL,
    "CREATE_TIME" timestamp(0) without time zone NOT NULL
)
WITH (oids = false);
--
-- Structure for table sys_role_menu (OID = 16439) : 
--
CREATE TABLE public.sys_role_menu (
    "ID" integer NOT NULL,
    "ROLE_ID" integer NOT NULL,
    "MENU_ID" integer NOT NULL,
    "UPDATE_TIME" timestamp(0) without time zone NOT NULL,
    "CREATE_TIME" timestamp(0) without time zone NOT NULL
)
WITH (oids = false);
--
-- Structure for table sys_user_role (OID = 16444) : 
--
CREATE TABLE public.sys_user_role (
    "ID" integer NOT NULL,
    "USER_ID" integer NOT NULL,
    "ROLE_ID" integer NOT NULL,
    "UPDATE_TIME" timestamp(0) without time zone NOT NULL,
    "CREATE_TIME" timestamp(0) without time zone NOT NULL
)
WITH (oids = false);
--
-- Definition for sequence geely_sequences (OID = 16454) : 
--
CREATE SEQUENCE public.geely_sequences
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Data for table public.sys_user (OID = 16416) (LIMIT 0,2)
--
INSERT INTO sys_user ("ID", "LOGIN_NAME", "PASSWORD", "NAME", "PHONE", "EMAIL", "IS_BUILTIN", "LOGIN_TIME", "PASSWORD_LAST_MODIFY_TIME", "UPDATE_TIME", "CREATE_TIME")
VALUES (15, 'administrator', '123456', 'wsy', '17601612994', 'wsy2355883@163.com', true, '2015-10-12 14:12:52', '2015-10-12 14:12:52', '2015-10-12 14:12:52', '2015-10-12 14:12:52');

INSERT INTO sys_user ("ID", "LOGIN_NAME", "PASSWORD", "NAME", "PHONE", "EMAIL", "IS_BUILTIN", "LOGIN_TIME", "PASSWORD_LAST_MODIFY_TIME", "UPDATE_TIME", "CREATE_TIME")
VALUES (17, 'administrator1', '123456', 'wsy', '17601612994', 'wsy2355883@163.com', true, '2015-10-12 14:15:12', '2015-10-12 14:15:12', '2015-10-12 14:15:12', '2015-10-12 14:15:12');

--
-- Data for table public.sys_menu (OID = 16432) (LIMIT 0,6)
--
INSERT INTO sys_menu ("ID", "PID", "NAME", "URL", "ORDER_NUM", "TYPE", "UPDATE_TIME", "CREATE_TIME")
VALUES (1, 0, '系统管理', 'javascript:void(0)', 1, 1, '2015-05-25 14:08:03', '2015-05-25 14:08:03');

INSERT INTO sys_menu ("ID", "PID", "NAME", "URL", "ORDER_NUM", "TYPE", "UPDATE_TIME", "CREATE_TIME")
VALUES (2, 0, '车辆管理', 'javascript:void(0)', 1, 1, '2015-05-25 14:08:03', '2015-05-25 14:08:03');

INSERT INTO sys_menu ("ID", "PID", "NAME", "URL", "ORDER_NUM", "TYPE", "UPDATE_TIME", "CREATE_TIME")
VALUES (3, 0, '系统参数', 'javascript:void(0)', 1, 1, '2015-05-25 14:08:03', '2015-05-25 14:08:03');

INSERT INTO sys_menu ("ID", "PID", "NAME", "URL", "ORDER_NUM", "TYPE", "UPDATE_TIME", "CREATE_TIME")
VALUES (11, 1, '用户管理', 'javascript:void(0)', 1, 1, '2015-05-25 14:08:03', '2015-05-25 14:08:03');

INSERT INTO sys_menu ("ID", "PID", "NAME", "URL", "ORDER_NUM", "TYPE", "UPDATE_TIME", "CREATE_TIME")
VALUES (12, 1, '角色管理', 'javascript:void(0)', 1, 1, '2015-05-25 14:08:03', '2015-05-25 14:08:03');

INSERT INTO sys_menu ("ID", "PID", "NAME", "URL", "ORDER_NUM", "TYPE", "UPDATE_TIME", "CREATE_TIME")
VALUES (13, 1, '机构管理', 'javascript:void(0)', 1, 1, '2015-05-25 14:08:03', '2015-05-25 14:08:03');

--
-- Definition for index SYS_USER_LOGIN_NAME_INDEX (OID = 16422) : 
--
ALTER TABLE ONLY sys_user
    ADD CONSTRAINT "SYS_USER_LOGIN_NAME_INDEX"
    UNIQUE ("LOGIN_NAME");
--
-- Definition for index sys_role_pkey (OID = 16428) : 
--
ALTER TABLE ONLY sys_role
    ADD CONSTRAINT sys_role_pkey
    PRIMARY KEY ("ID");
--
-- Definition for index sys_role_NAME_key (OID = 16430) : 
--
ALTER TABLE ONLY sys_role
    ADD CONSTRAINT "sys_role_NAME_key"
    UNIQUE ("NAME");
--
-- Definition for index sys_menu_pkey (OID = 16437) : 
--
ALTER TABLE ONLY sys_menu
    ADD CONSTRAINT sys_menu_pkey
    PRIMARY KEY ("ID");
--
-- Definition for index sys_role_menu_pkey (OID = 16442) : 
--
ALTER TABLE ONLY sys_role_menu
    ADD CONSTRAINT sys_role_menu_pkey
    PRIMARY KEY ("ID");
--
-- Definition for index sys_user_role_pkey (OID = 16447) : 
--
ALTER TABLE ONLY sys_user_role
    ADD CONSTRAINT sys_user_role_pkey
    PRIMARY KEY ("ID");
--
-- Definition for index SYS_USER_PKEY (OID = 16451) : 
--
ALTER TABLE ONLY sys_user
    ADD CONSTRAINT "SYS_USER_PKEY"
    PRIMARY KEY ("ID");
--
-- Data for sequence public.geely_sequences (OID = 16454)
--
SELECT pg_catalog.setval('geely_sequences', 18, true);
--
-- Comments
--
COMMENT ON SCHEMA public IS 'standard public schema';
COMMENT ON COLUMN public.sys_user."ID" IS 'primary key';
COMMENT ON COLUMN public.sys_user."IS_BUILTIN" IS '是否是内置数据';
COMMENT ON COLUMN public.sys_user."LOGIN_TIME" IS '上次登录时间';
COMMENT ON COLUMN public.sys_user."PASSWORD_LAST_MODIFY_TIME" IS '上一次修改密码的时间';
COMMENT ON COLUMN public.sys_user."UPDATE_TIME" IS '更新时间';
COMMENT ON COLUMN public.sys_user."CREATE_TIME" IS '创建时间';
COMMENT ON COLUMN public.sys_role."NAME" IS '角色名称';
COMMENT ON COLUMN public.sys_role."IS_BUILTIN" IS '是否内置角色';
COMMENT ON COLUMN public.sys_menu."PID" IS '父菜单ID,无父菜单为0';
COMMENT ON COLUMN public.sys_menu."NAME" IS '菜单名';
COMMENT ON COLUMN public.sys_menu."URL" IS '菜单URL';
COMMENT ON COLUMN public.sys_menu."ORDER_NUM" IS '同一级菜单的顺序';
COMMENT ON COLUMN public.sys_menu."TYPE" IS '类型：0是菜单,1是按钮';
