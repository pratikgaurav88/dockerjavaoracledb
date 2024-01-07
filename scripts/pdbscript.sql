--CONNECT / AS SYSDBA;
--ALTER USER sys IDENTIFIED BY Welcome123#;
create pluggable database dockerpdb1 admin user dockerpdb identified by Welcome123# roles = (DBA) FILE_NAME_CONVERT =('/opt/oracle/oradata/ORCLCDB/pdbseed','/opt/oracle/oradata/ORCLCDB/dockerpdb'); 
ALTER pluggable database dockerpdb1 open;
ALTER SESSION SET container = dockerpdb1;
GRANT CONNECT TO dockerpdb;
GRANT RESOURCE TO dockerpdb;
GRANT
CREATE VIEW TO dockerpdb;
GRANT
CREATE
SESSION TO dockerpdb;
GRANT
CREATE TABLE TO dockerpdb;
GRANT
CREATE SEQUENCE TO dockerpdb;
GRANT
CREATE PROCEDURE TO dockerpdb;
GRANT
CREATE TRIGGER TO dockerpdb;
alter user dockerpdb quota unlimited on SYSTEM;
GRANT UNLIMITED TABLESPACE TO dockerpdb;

exit;