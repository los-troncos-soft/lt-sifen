# LT-SIFEN
API rest para generación de comprobantes electrónicos de Sifen.  
Utiliza rshk-jsifenlib para la serialización de los datos y el envio a Sifen  
https://github.com/roshkadev/rshk-jsifenlib

### Conexión a PostgreSQL
`sudo -u postgres psql`

### Crear usuario y base de datos
 ```:
CREATE ROLE lt_user WITH LOGIN PASSWORD '123456';  
ALTER ROLE lt_user CREATEDB;  
CREATE DATABASE lt_sifen OWNER lt_user;  
GRANT ALL PRIVILEGES ON DATABASE lt_sifen TO lt_user;
