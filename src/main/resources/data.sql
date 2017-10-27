insert into service_url values(1,'http;//localhost:8080/','Android','本地环境','2017年01月01日 00:00:00','2017年01月01日 00:00:00',now(),now());
insert into service_url values(2,'http;//www.baidu.com/','Android','百度测试黄精233','2017年01月01日 00:00:00','2017年01月01日 00:00:00',now(),now());
insert into service_url values(3,'http;//www.163.com/','Android','163这个傻帽','2017年01月01日 00:00:00','2017年01月01日 00:00:00',now(),now());
insert  into `sys_role`(`id`,`name`) values (1,'ROLE_ADMIN'),(2,'ROLE_USER');
insert  into `sys_user`(`id`,`password`,`username`) values (1,'root','root'),(2,'sang','sang');
insert  into `sys_user_roles`(`sys_user_id`,`roles_id`) values (1,1),(2,2);