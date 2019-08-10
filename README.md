## 学习自码匠社区

## 资料
[spring 文档](https://spring.io/guides)
[Github OAuth](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)
[es](https://elasticsearch.cn/explore)

## 工具
[Git](https://git-scm.com/download)
[VP](https://www.visual-paradigm.com)

##脚本
'''sql
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_id` varchar(100) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `token` char(36) DEFAULT NULL,
  `gmt_create` bigint(20) DEFAULT NULL,
  `gmt_modified` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
);
'''