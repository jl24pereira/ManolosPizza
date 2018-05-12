DROP DATABASE IF EXISTS manolosdb;
CREATE DATABASE manolosdb WITH TEMPLATE = template0 
ENCODING = 'UTF8' LC_COLLATE = 'Spanish_El Salvador.1252' 
LC_CTYPE = 'Spanish_El Salvador.1252';
ALTER DATABASE puntocolordb OWNER TO postgres;