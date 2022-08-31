--------------------------------------------------------
-- Archivo creado  - domingo-noviembre-14-2021   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table ATENCION
--------------------------------------------------------

  CREATE TABLE "ATENCION" ("ID_ATENCION" NUMBER(10,0), "RUT_PACIENTE" VARCHAR2(12), "NOMBRE_PACIENTE" VARCHAR2(100), "EDAD_PACIENTE" NUMBER(3,0), "FECHA_NACIMIENTO_PACIENTE" DATE, "ID_ESPECIALIDAD" NUMBER(10,0), "ID_SISTEMA_SALUD" NUMBER(10,0));
--------------------------------------------------------
--  DDL for Table ESPECIALIDAD
--------------------------------------------------------

  CREATE TABLE "ESPECIALIDAD" ("ID_ESPECIALIDAD" NUMBER(10,0), "NOMBRE_ESPECIALIDAD" VARCHAR2(100));
--------------------------------------------------------
--  DDL for Table SISTEMA_SALUD
--------------------------------------------------------

  CREATE TABLE "SISTEMA_SALUD" ("ID_SISTEMA_SALUD" NUMBER(10,0), "NOMBRE_SISTEMA_SALUD" VARCHAR2(100));
--------------------------------------------------------
--  DDL for Table USUARIO
--------------------------------------------------------

  CREATE TABLE "USUARIO" ("ID_USUARIO" NUMBER(10,0), "LOGIN" VARCHAR2(225), "CONTRASENA" VARCHAR2(225));

Insert into ESPECIALIDAD (ID_ESPECIALIDAD,NOMBRE_ESPECIALIDAD) values ('1','GASTORENTEROLOGIA');
Insert into ESPECIALIDAD (ID_ESPECIALIDAD,NOMBRE_ESPECIALIDAD) values ('2','OFTALMOLOGIA');
Insert into ESPECIALIDAD (ID_ESPECIALIDAD,NOMBRE_ESPECIALIDAD) values ('3','TRAUMATOLOGIA');
Insert into ESPECIALIDAD (ID_ESPECIALIDAD,NOMBRE_ESPECIALIDAD) values ('4','PEDIATRIA');
Insert into ESPECIALIDAD (ID_ESPECIALIDAD,NOMBRE_ESPECIALIDAD) values ('5','CIRUGIA ADULTO');
Insert into ESPECIALIDAD (ID_ESPECIALIDAD,NOMBRE_ESPECIALIDAD) values ('6','CIRUGIA INFANTIL');
Insert into ESPECIALIDAD (ID_ESPECIALIDAD,NOMBRE_ESPECIALIDAD) values ('7','NEUROLOGIA');
Insert into ESPECIALIDAD (ID_ESPECIALIDAD,NOMBRE_ESPECIALIDAD) values ('8','NEONATOLOGIA');
Insert into SISTEMA_SALUD (ID_SISTEMA_SALUD,NOMBRE_SISTEMA_SALUD) values ('1','ISAPRE');
Insert into SISTEMA_SALUD (ID_SISTEMA_SALUD,NOMBRE_SISTEMA_SALUD) values ('2','FONASA');

Insert into USUARIO (ID_USUARIO,LOGIN,CONTRASENA) values ('1','arojas','123arojas');
Insert into USUARIO (ID_USUARIO,LOGIN,CONTRASENA) values ('2','vvalencia','v.val1984');
--------------------------------------------------------
--  Constraints for Table USUARIO
--------------------------------------------------------

  ALTER TABLE "USUARIO" ADD PRIMARY KEY ("ID_USUARIO") 
--------------------------------------------------------
--  Constraints for Table SISTEMA_SALUD
--------------------------------------------------------

  ALTER TABLE "SISTEMA_SALUD" ADD PRIMARY KEY ("ID_SISTEMA_SALUD") 
--------------------------------------------------------
--  Constraints for Table ESPECIALIDAD
--------------------------------------------------------

  ALTER TABLE "ESPECIALIDAD" ADD PRIMARY KEY ("ID_ESPECIALIDAD") 
--------------------------------------------------------
--  Constraints for Table ATENCION
--------------------------------------------------------

  ALTER TABLE "ATENCION" ADD PRIMARY KEY ("ID_ATENCION") 
--------------------------------------------------------
--  Ref Constraints for Table ATENCION
--------------------------------------------------------

  ALTER TABLE "ATENCION" ADD CONSTRAINT "FK_ATENCION_ESPECIALIDAD" FOREIGN KEY ("ID_ESPECIALIDAD") REFERENCES "ESPECIALIDAD" ("ID_ESPECIALIDAD") ;
  ALTER TABLE "ATENCION" ADD CONSTRAINT "FK_ATENCION_SIS_SALUD" FOREIGN KEY ("ID_SISTEMA_SALUD") REFERENCES "SISTEMA_SALUD" ("ID_SISTEMA_SALUD") ;
