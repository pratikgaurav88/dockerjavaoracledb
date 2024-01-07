#!/bin/bash
echo Start Executing SQL commands
mkdir /opt/oracle/oradata/ORCLCDB/dockerpdb
sqlplus / as sysdba @"C:/oracleDB/scripts/pdbscript.sql"